package com.alex.woot.misc;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.soap.SOAPException;

import utils.CUCMInfo.dataName;

import SOAPMisc.SOAPGear;
import SOAPMisc.SaveResult;
import SOAPMisc.getAXLConData;
import SOAPMisc.getLdapSystem;
import Window.Fenetre;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.*;



public class GenerateSourceFile
	{
	/************
	 * Variables
	 ************/
	private boolean done;
	private int index;
	private String[] paramList;
	private boolean advFile;
	private ArrayList<CUCMInfo> ciList;
	private Fenetre maFenetre;
	
	//Fichier excel
	private String nomFichier;
	private WritableWorkbook monWorkbook;
	private WritableSheet userSheet;
	private WritableSheet ccmSheet;
	private WritableSheet gwSheet;
	private WritableSheet sdSheet;
	
	private WritableFont arial10font;
	private WritableFont arial10font3;
	private WritableCellFormat typeFormat;
	
	private WritableCellFormat userFormat;
	private WritableCellFormat posteFormat;
	private WritableCellFormat ligneFormat;
	private WritableCellFormat siteFormat;
	private WritableCellFormat secuFormat;
	private WritableCellFormat serviceFormat;
	private WritableCellFormat speedDialFormat;
	private WritableCellFormat arial10format2;
	
	//Source
	private String emplacementDest;
	private JFileChooser fcDest;
	
	/*****************
	 * Constructeurs
	 *****************/
	public GenerateSourceFile(Fenetre maFenetre)
		{
		done = false;
		fcDest = new JFileChooser();
		index = 0;
		advFile = false;
		ciList = new ArrayList<CUCMInfo>();
		this.maFenetre = maFenetre;
		
		//Fichier excel
		nomFichier = variable.getNomProg()+"_"+variable.getVersionProg()+".xls";
		
		cheminRep();
		
		/********
		 * On demande à l'utilisateur si il veut un fichier de collecte évolué
		 * On entend par là un fichier de collecte contenant des informations récupéré
		 * dans le callmanager 
		 */
		Object[] options = {"Oui","Non"};
		switch(JOptionPane.showOptionDialog(null,"Voulez-vous que le logiciel récupère des informations dans le CUCM\r\npour construire le fichier ?","Injection terminée",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]))
			{
			case 0:
				{
				advFile = true;
				break;
				}
			case 1:break;
			default:break;
			}
		
		if(done)
			{
			variable.getLogger().info("Création du fichier source à l'emplacement suivant : "+emplacementDest);
			
			try
				{
				if(advFile)
					{
					/*****************************
					 * Récupération des info du CUCM
					 *****************************/
					getCUCMInfo();
					/*****************************/
					}
					
				/*****************************
				 * Génération du fichier excel
				 *****************************/
				openSheet();
				System.out.println("Fichier correctement ouvert");
				
				createExcelFile();
				JOptionPane.showMessageDialog(null,"Le fichier source a été créé avec succès","Information",JOptionPane.INFORMATION_MESSAGE);
				/*****************************/
				}
			catch(Exception exc)
				{
				variable.getLogger().info(exc.getMessage(),exc);
				JOptionPane.showMessageDialog(null,"L'erreur suivante est survenu durant la création du fichier source : \r\n"+exc.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
				}
			finally
				{
				try
					{
					monWorkbook.close();
					System.out.println("fichier "+nomFichier+" fermé");
					}
				catch(Exception e)
					{
					e.printStackTrace();
					System.out.println("Erreur : "+e.getMessage());
					}
				}
			}
		}
	
	public void cheminRep()
		{
		try
			{
			if(variable.getEmplacementBase().compareTo("") == 0)
				{
				fcDest.setCurrentDirectory(new File("."));
				}
			else
				{
				fcDest.setCurrentDirectory(new File(variable.getEmplacementBase()));
				}
			fcDest.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int resultat = fcDest.showDialog(fcDest, "Choisir");
			if(resultat == fcDest.APPROVE_OPTION)
				{
				emplacementDest = fcDest.getSelectedFile().toString();
				done = true;
				}
			else
				{
				emplacementDest = "";
				}
			}
		catch(Exception exception)
			{
			exception.printStackTrace();
			System.out.println("Erreur : "+exception.getMessage());
			}
		}
	
	public void createExcelFile() throws Exception
		{
		//Ecrire fonction
		
		userSheet = monWorkbook.createSheet("Collecte Utilisateur", 0);
		ccmSheet = monWorkbook.createSheet("Collecte CUCM", 1);
		gwSheet = monWorkbook.createSheet("Collecte Gateway", 2);
		sdSheet = monWorkbook.createSheet("Collecte SD", 3);
		
		//Définition des formats
		arial10font = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD);
		arial10font.setColour(Colour.WHITE);
		
		userFormat = new WritableCellFormat(arial10font);
		userFormat.setBackground(Colour.DARK_BLUE);
		
		posteFormat = new WritableCellFormat(arial10font);
		posteFormat.setBackground(Colour.DARK_PURPLE);
		
		ligneFormat = new WritableCellFormat(arial10font);
		ligneFormat.setBackground(Colour.DARK_RED);
		
		siteFormat = new WritableCellFormat(arial10font);
		siteFormat.setBackground(Colour.DARK_GREEN);
		
		secuFormat = new WritableCellFormat(arial10font);
		secuFormat.setBackground(Colour.DARK_BLUE);
		
		serviceFormat = new WritableCellFormat(arial10font);
		serviceFormat.setBackground(Colour.DARK_YELLOW);
		
		speedDialFormat = new WritableCellFormat(arial10font);
		speedDialFormat.setBackground(Colour.GREEN);
		
		typeFormat = new WritableCellFormat(arial10font);
		typeFormat.setBackground(Colour.GRAY_80);
		
		/******************************
		 * Ecriture du premier onglet
		 ******************************/
		//User
		userSheet.addCell(getLabel("Nom", userFormat));
		userSheet.addCell(getLabel("Prénom", userFormat));
		userSheet.addCell(getLabel("UserID", userFormat));
		
		//Poste
		userSheet.addCell(getLabel("Poste", posteFormat));
		userSheet.addCell(getLabel("Adresse Mac", posteFormat));
		userSheet.addCell(getLabel("Button Template", posteFormat));
		
		//Ligne
		userSheet.addCell(getLabel("Numéro Ligne", ligneFormat));
		userSheet.addCell(getLabel("CSS Ligne", ligneFormat));
		userSheet.addCell(getLabel("External Phone Number Mask", ligneFormat));
		userSheet.addCell(getLabel("AAR Mask", ligneFormat));
		userSheet.addCell(getLabel("Presence Group", ligneFormat));
		userSheet.addCell(getLabel("Renvoi tout", ligneFormat));
		userSheet.addCell(getLabel("Renvoi sur occupation", ligneFormat));
		userSheet.addCell(getLabel("Renvoi sur non réponse", ligneFormat));
		userSheet.addCell(getLabel("Call Pickup Group", ligneFormat));
		
		//Line Group
		userSheet.addCell(getLabel("Line Group", ligneFormat));
		
		//Securite
		userSheet.addCell(getLabel("Mot de passe", secuFormat));
		userSheet.addCell(getLabel("Code PIN", secuFormat));
		
		//PosteFixe
		userSheet.addCell(getLabel("Poste Fixe", typeFormat));
		
		//Mevo
		userSheet.addCell(getLabel("Mevo", posteFormat));
		
		//SIP
		userSheet.addCell(getLabel("CUP", ligneFormat));
		
		//Service
		userSheet.addCell(getLabel("Service 1", serviceFormat));
		userSheet.addCell(getLabel("Service 2", serviceFormat));
		userSheet.addCell(getLabel("Service 3", serviceFormat));
		
		//Speed Dial
		userSheet.addCell(getLabel("Speed Dial 1", speedDialFormat));
		userSheet.addCell(getLabel("Speed Dial 2", speedDialFormat));
		userSheet.addCell(getLabel("Speed Dial 3", speedDialFormat));
		
		//Parametre divers
		userSheet.addCell(getLabel("Parametre 1", ligneFormat));
		userSheet.addCell(getLabel("Parametre 2", ligneFormat));
		userSheet.addCell(getLabel("Parametre 3", ligneFormat));
		
		//Première colonne
		userSheet.addCell(new Label(0, 1, "", typeFormat));
		
		//Ligne de #
		arial10font3 = new WritableFont(WritableFont.ARIAL, 10);
		arial10font3.setColour(Colour.BLACK);
		arial10format2 = new WritableCellFormat(arial10font3);
		arial10format2.setBackground(Colour.WHITE);
		for(int i = 1; i<index+1; i++)
			{
			userSheet.addCell(new Label(i, 2, "#", arial10format2));
			}
		
		//Exemple
		String[] exemple = new String[]{"ratel","alex","alexrate","7941","000000001234","Standard 7941 SCCP","351234","CSS_NoRestriction","013489XXXX","3313489XXXX","","","8000","8000","CPG_1","Accueil:B","12345","12345","Oui","Oui","Non","annuaire:Annuaire interne","","","5050:Standard","","","IPEI : 1234567890AZ","",""};
		for(int i = 1; i<exemple.length+1; i++)
			{
			userSheet.addCell(new Label(i,1,exemple[i-1], arial10format2));
			}
		
		//List
		paramList = new String[]{"Oui","Non"};
		userSheet.addCell(getList(paramList, "Oui", 19));
		userSheet.addCell(getList(paramList, "Oui", 20));
		userSheet.addCell(getList(paramList, "Non", 21));
		
		paramList = new String[]{"7941","7942","7945","7961","7962","7965","7970","7971","7975","7911","7912","7931","7935","7936","7937","Third-party SIP Device (Basic)","8945","9971","6921","6945","6901","Analog Device"};
		userSheet.addCell(getList(paramList, "7941", 4));
		
		if(advFile)
			{
			for(int i=0; i<ciList.size(); i++)
				{
				//Phone Button Template
				if(ciList.get(i).getDN().equals(dataName.PBT))
					{
					paramList = new String[ciList.get(i).getContents().size()];
					for(int j=0; j<ciList.get(i).getContents().size(); j++)
						{
						paramList[j]=ciList.get(i).getContents().get(j);
						userSheet.addCell(new Label(6, j+1, ciList.get(i).getContents().get(j), arial10format2));
						}
					}
				//CSS
				if(ciList.get(i).getDN().equals(dataName.CSS))
					{
					paramList = new String[ciList.get(i).getContents().size()];
					for(int j=0; j<ciList.get(i).getContents().size(); j++)
						{
						paramList[j]=ciList.get(i).getContents().get(j);
						userSheet.addCell(new Label(8, j+1, ciList.get(i).getContents().get(j), arial10format2));
						}
					}
				}
			}
		/*************************************/
		
		/******************************
		 * Ecriture du deuxième onglet
		 ******************************/
		index = 0;
		String[] dataList = new String[]{"Nom du site","Surnom du site","Location Audio BW (KBps)","Region Codec","MRG MOH","MRG Soft","User local","Softkey Template","CallManager Group","Date Time Group","Numero de la MOH","Country","Prefixe","SDA","E.164","Standard","AAR Group","Tranche SDA","Voice Mail Template","Service Connexion","Service Deconnexion","Service Annuaire","Speed Dial"};
		for(int i=0; i<dataList.length; i++)
			{
			ccmSheet.addCell(getLabel(dataList[i], userFormat));
			}
		
		//Exemple
		String[] ccmExemple = new String[]{"Lyon","LYON","1000","G.729","MRG_MOH_PLAISIR","MRG_PLAISIR","English United States","Standard User","CMG_PLAISIR","DTG_Europe","1","Netherlands","274","74444","31","5555","AAR_Europe","2709[69]XX","voicemailusertemplate","Connexion:Veuillez activer votre ligne","Deconnexion","Annuaire:Annuaire","18:Urgence"};
		for(int i = 1; i<ccmExemple.length+1; i++)
			{
			ccmSheet.addCell(new Label(i,1,ccmExemple[i-1], arial10format2));
			}
		
		//Première colonne
		ccmSheet.addCell(new Label(0, 1, "", typeFormat));
		
		//Ligne de #
		for(int i = 1; i<index+1; i++)
			{
			ccmSheet.addCell(new Label(i, 2, "#", arial10format2));
			}
		
		//List
		paramList = new String[]{"G.711","G.729"};
		ccmSheet.addCell(getList(paramList, "G.729", 4));
		
		paramList = new String[]{"French France","Italian Italy","Portuguese Portugal","English United States","Spanish Spain","Dutch Netherlands"};
		ccmSheet.addCell(getList(paramList, "English United States", 7));
		
		paramList = new String[]{"France","Italy","Portugal","United Kingdom","Spain","Netherlands","Germany"};
		ccmSheet.addCell(getList(paramList, "France", 12));
		
		if(advFile)
			{
			for(int i=0; i<ciList.size(); i++)
				{
				//MRG
				if(ciList.get(i).getDN().equals(dataName.MRG))
					{
					paramList = new String[ciList.get(i).getContents().size()];
					for(int j=0; j<ciList.get(i).getContents().size(); j++)
						{
						paramList[j]=ciList.get(i).getContents().get(j);
						ccmSheet.addCell(new Label(5, j+1, ciList.get(i).getContents().get(j), arial10format2));
						ccmSheet.addCell(new Label(6, j+1, ciList.get(i).getContents().get(j), arial10format2));
						}
					}
				//Softkey Template
				if(ciList.get(i).getDN().equals(dataName.SKT))
					{
					paramList = new String[ciList.get(i).getContents().size()];
					for(int j=0; j<ciList.get(i).getContents().size(); j++)
						{
						paramList[j]=ciList.get(i).getContents().get(j);
						}
					ccmSheet.addCell(getList(paramList, "default", 8));
					}
				//CallManager Group
				if(ciList.get(i).getDN().equals(dataName.CMG))
					{
					paramList = new String[ciList.get(i).getContents().size()];
					for(int j=0; j<ciList.get(i).getContents().size(); j++)
						{
						paramList[j]=ciList.get(i).getContents().get(j);
						}
					ccmSheet.addCell(getList(paramList, "default", 9));
					}
				//Date Time Group
				if(ciList.get(i).getDN().equals(dataName.DTG))
					{
					paramList = new String[ciList.get(i).getContents().size()];
					for(int j=0; j<ciList.get(i).getContents().size(); j++)
						{
						paramList[j]=ciList.get(i).getContents().get(j);
						}
					ccmSheet.addCell(getList(paramList, "default", 10));
					}
				//AAR Group
				if(ciList.get(i).getDN().equals(dataName.ARG))
					{
					paramList = new String[ciList.get(i).getContents().size()];
					for(int j=0; j<ciList.get(i).getContents().size(); j++)
						{
						paramList[j]=ciList.get(i).getContents().get(j);
						}
					ccmSheet.addCell(getList(paramList, "default", 17));
					}
				}
			}
		/****************************************/
		
		/******************************
		 * Ecriture du troisième onglet
		 ******************************/
		index = 0;
		String[] dataListe = new String[]{"ISR/VG","Type","Hostname","IP","Masque","Gateway","Interface","Domaine","User","Password","Ntp server","IOS","CCM1","CCM2","CCM3","Fichier moh","Max session conf","Card Type Port 1","Card Type Port 2","Card Type Port 3","Card Type Port 4","Framing Global","MAC Address","IT","VG port 1","VG port 2","VG port 3","VG port 4","VG port 5","VG port 6","VG port 7","VG port 8","VG port 9","VG port 10","VG port 11","VG port 12","VG port 13","VG port 14","VG port 15","VG port 16","VG port 17","VG port 18","VG port 19","VG port 20","VG port 21","VG port 22","VG port 23","VG port 24"};
		
		for(int i=0; i<dataListe.length; i++)
			{
			gwSheet.addCell(getLabel(dataListe[i], userFormat));
			}
		
		//Exemple
		String[] gwExemple = new String[]{"ISR SRST","2951","PASS1.ToIP.FLO1.RG","10.39.94.10","255.255.255.0","10.39.94.1","GigabitEthernet 0/0","LV.FR","administrator","CCMCisco92","10.32.24.93","c2951-universalk9-mz.SPA.151-4.M1.bin","10.33.5.6","10.33.5.38","","LVM_ZEUR.wav","4","VWIC3-2MFT-T1E1-E1","VWIC3-1MFT-T1E1-E1","VWIC3-2MFT-T1E1-E1","VWIC3-1MFT-T1E1-E1","NON-CRC4","","31"};
		for(int i = 1; i<gwExemple.length+1; i++)
			{
			gwSheet.addCell(new Label(i,1,gwExemple[i-1], arial10format2));
			}
		
		//Première colonne
		gwSheet.addCell(new Label(0, 1, "", typeFormat));
		
		//Ligne de #
		for(int i = 1; i<index+1; i++)
			{
			gwSheet.addCell(new Label(i, 2, "#", arial10format2));
			}
		
		//List
		paramList = new String[]{"2801","2811","2821","2851","2901","2911","2921","2951","3945","VG202","VG204","VG224"};
		gwSheet.addCell(getList(paramList, "2911", 2));
		
		paramList = new String[]{"VWIC2-1MFT-T1E1-E1","VWIC2-2MFT-T1E1-E1","VWIC3-1MFT-T1E1-E1","VWIC3-2MFT-T1E1-E1","VIC2-2BRI","VIC2-1BRI"};
		gwSheet.addCell(getList(paramList, "VWIC3-2MFT-T1E1-E1", 18));
		gwSheet.addCell(getList(paramList, "VWIC3-2MFT-T1E1-E1", 19));
		gwSheet.addCell(getList(paramList, "VWIC3-2MFT-T1E1-E1", 20));
		gwSheet.addCell(getList(paramList, "VWIC3-2MFT-T1E1-E1", 21));
		
		paramList = new String[]{"CRC4","NON-CRC4"};
		gwSheet.addCell(getList(paramList, "NON-CRC4", 22));
		/*****************************************/
		
		/******************************
		 * Ecriture du quatrième onglet
		 ******************************/
		index = 0;
		String[] SDListe = new String[58];
		SDListe[0] = "Cible";
		SDListe[1] = "Extention 1";
		SDListe[2] = "Extention 2";
		
		for(int i=3; i<SDListe.length; i++)
			{
			SDListe[i] = "SD"+(i-1);
			}
		
		sdSheet.addCell(getLabel(SDListe[0], ligneFormat));
		sdSheet.addCell(getLabel(SDListe[1], ligneFormat));
		sdSheet.addCell(getLabel(SDListe[2], ligneFormat));
		
		for(int i=3; i<SDListe.length; i++)
			{
			sdSheet.addCell(getLabel(SDListe[i], userFormat));
			}
		
		//Exemple
		String[] SDExemple = new String[]{"alexrate","7915 24-Button Line Expansion Module","7915 24-Button Line Expansion Module","12345:RATEL Alexandre:Pickup","00123456790:Meteo:Pickup"};
		for(int i = 1; i<SDExemple.length+1; i++)
			{
			sdSheet.addCell(new Label(i,1,SDExemple[i-1], arial10format2));
			}
		
		//Première colonne
		sdSheet.addCell(new Label(0, 1, "", typeFormat));
		
		//Ligne de #
		for(int i = 1; i<index+1; i++)
			{
			sdSheet.addCell(new Label(i, 2, "#", arial10format2));
			}
		
		//List
		paramList = new String[]{"7914 14-Button Line Expansion Module","7915 12-Button Line Expansion Module","7915 24-Button Line Expansion Module","7916 12-Button Line Expansion Module","7916 24-Button Line Expansion Module","CKEM 36-Button Line Expansion Module"};
		sdSheet.addCell(getList(paramList, "7915 24-Button Line Expansion Module", 2));
		sdSheet.addCell(getList(paramList, "7915 24-Button Line Expansion Module", 3));
		/*****************************************/
		
		/******************************
		 * Finalisation du fichier excel
		 ******************************/
		monWorkbook.write();
		}
	
	public void openSheet() throws Exception
		{
		System.out.println("Fichier créer ici : "+emplacementDest+"\\"+nomFichier);
		monWorkbook = Workbook.createWorkbook(new File(emplacementDest+"\\"+nomFichier));
		}
	
	private jxl.write.Label getLabel(String name, WritableCellFormat format)
		{
		index++;
		return new Label(index, 0, name, format);
		}
	
	private Label getList(String[] paramList, String defValue, int y)
		{
		WritableCellFeatures wcf = new WritableCellFeatures();
		ArrayList<String> aList = new ArrayList<String>();
		for(int i=0;i<paramList.length; i++)
			{
			aList.add(paramList[i]);
			}
		
		wcf.setDataValidationList(aList);
		Label lab = new Label(y, 1, defValue, arial10format2);
		lab.setCellFeatures(wcf);
		
		return lab;
		}
	
	/*******************************************
	 * Method Used to get CUCM's following data :
	 * - Phone Button Template
	 * - CSS Ligne
	 * - MRG
	 * - User Locale
	 * - Softkey Template
	 * - CallManager Group
	 * - Date Time Group
	 * - AAR Group
	 *******************************************/
	private void getCUCMInfo() throws Exception
		{
		//If Database access is configured we ask here the path
		if(variable.getTargetOption("database").compareTo("dat")==0)
			{
			variable.getLogger().info("Récupération du contenu du fichier database");
			variable.filePathDAT();
			databaseAccess.getTemplate(maFenetre);
			}
		
		//Get AXL connection data
		new getAXLConData(maFenetre);
		
		/*****************
		 * Init the AXL Connection
		 ****************/
		//Reset the SOAP connection
		utils.variable.setMySOAPGear(null);
		utils.variable.setMySOAPGear(new SOAPGear());
		/****************/
		
		/*****************************
		 * Test of the AXL connection
		 *****************************/
		try
			{
			/***
			 * Get the CUCM Version
			 */
			String CCMVersion = SOAPMisc.axlSimpleRequest.process("getCCMVersion");
			if(CCMVersion == null)
				{
				//Bloquer le programme si la version n'a pas réussi à être récupéré
				}
			else
				{
				CCMVersion = CCMVersion.substring(0,1);
				utils.variable.setVersionCCM(CCMVersion);
				/**
				 * Bloquer le programme si la version n'est pas supportée
				 * 
				 * Définir une liste de versions supportées
				 */
				if(Integer.parseInt(utils.variable.getVersionCCM())<9)
					{
					//Version supporté, on ne fais rien
					}
				else
					{
					JOptionPane.showMessageDialog(null,"La version de CUCM utilisé n'est pas compatible.\r\nLe programme va maintenant se terminer","Information",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					}
				}
			}
		catch(SOAPException sexc)
			{
			variable.getLogger().info("ERROR : "+sexc.getMessage());
			System.out.println("## Serveur AXL Injoigniable ##");
			switch(JOptionPane.showConfirmDialog(null,"L'erreur suivante est survenu : \r\n"+sexc.getMessage()+"\r\nVoulez-vous tout de même continuer ?","Erreur AXL",JOptionPane.YES_NO_OPTION))
				{
				case 0:break;
				case 1:System.exit(0);break;
				case -1:break;
				default:break;
				}
			}
		/*****************************/
		
		try
			{
			//Phone button Template
			ciList.add(new CUCMInfo(dataName.PBT,"phonetemplate"));
			//CSS Ligne
			ciList.add(new CUCMInfo(dataName.CSS,"callingsearchspace"));
			//MRG
			ciList.add(new CUCMInfo(dataName.MRG,"mediaresourcegroup"));
			//Softkey Template
			ciList.add(new CUCMInfo(dataName.SKT,"softkeytemplate"));
			//CallManager Group
			ciList.add(new CUCMInfo(dataName.CMG,"callmanagergroup"));
			//Date Time Group
			ciList.add(new CUCMInfo(dataName.DTG,"datetimesetting"));
			//AAR Group
			ciList.add(new CUCMInfo(dataName.ARG,"aarneighborhood"));
			}
		catch(Exception exc)
			{
			variable.getLogger().info("ERROR : "+exc.getMessage(),exc);
			throw new Exception(exc.getMessage());
			}
		}
	
	/*2012*//*RATEL Alexandre*/
	}

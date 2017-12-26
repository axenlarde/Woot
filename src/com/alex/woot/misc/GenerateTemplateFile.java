package com.alex.woot.misc;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.*;



public class GenerateTemplateFile
	{
	/************
	 * Variables
	 ************/
	boolean done;
	String[] paramList;
	String line;
	StringBuffer buf;
	
	//Fichier template
	String nomFichierUser;
	String nomFichierCCM;
	String nomFichierGW;
	File fileUser;
	File fileCCM;
	File fileGW;
	BufferedWriter tamponUser;
	BufferedWriter tamponCCM;
	BufferedWriter tamponGW;
	FileWriter fwUser;
	FileWriter fwCCM;
	FileWriter fwGW;
	
	
	//Source
	String emplacementDest;
	JFileChooser fcDest;
	
	/*****************
	 * Constructeurs
	 *****************/
	public GenerateTemplateFile()
		{
		done = false;
		fcDest = new JFileChooser();
		line = "";
		
		//Fichier excel
		nomFichierUser = "templateUser.xml";
		nomFichierCCM = "templateCCM.xml";
		nomFichierGW = "templateGW.xml";
		
		cheminRep();
		
		if(done)
			{
			System.out.println("Création des fichiers de template à l'emplacement suivant : "+emplacementDest);
			
			/**************************************
			 * Génération des fichiers de template
			 **************************************/
			createTemplateFile();
			/*****************************/
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
	
	public void createTemplateFile()
		{
		//Ecrire fonction
		try
			{
			openFile();
			System.out.println("Fichier correctement ouvert");
				
			/****************************************
			 * Ecriture du fichier templateUSER.xml
			 ****************************************/
			line += "<!-- "+variable.getNomProg()+" - "+variable.getVersionProg()+" -->"+"\r\n";
			line += "<!--Fichier de paramétrage de la collecte-->"+"\r\n";
			line += "<!--Rappel :"+"\r\n";
			line += "Nom = nom"+"\r\n";
			line += "Prénom = prenom"+"\r\n";
			line += "UserID = userid"+"\r\n";
			line += "Adresse mac = mac"+"\r\n";
			line += "Type de poste = poste"+"\r\n";
			line += "Numéro de la ligne = nligne"+"\r\n";
			line += "nsite = nsite"+"\r\n";
			line += "desc = description du site"+"\r\n";
			line += "Titre = titre"+"\r\n";
			line += "Mot de passe = pass"+"\r\n";
			line += "Code PIN = pin"+"\r\n";
			line += "CSS Ligne = cssligne"+"\r\n";
			line += "type de poste = tposte"+"\r\n";
			line += "Parametre libre 1 à 3 = param1"+"\r\n";
			line += "Texte libre à mettre entre guillement simple, exemple = 'test'"+"\r\n";
			line += "utiliser des + pour séparer les éléments"+"\r\n";
			line += "Un chiffre entre étoiles placé avant une valeure indique le nombre de lettre à utiliser, exemple : *1*prenom = On utilise la première lettre du prénom"+"\r\n";
			line += "Le symbole *M* indique que tout la valeure suivante doit être converti en majuscule"+"\r\n";
			line += "Le symbole *1M* indique que seul la première lettre doit être converti en majuscule. Le chiffre peut être ajusté."+"\r\n";
			line += "Le symbole *m* indique que tout la valeure suivante doit être converti en minuscule"+"\r\n";
			line += "Le symbole *1m* indique que seul la première lettre doit être converti en minuscule. Le chiffre peut être ajusté."+"\r\n";
			line += "Les combinaisons sont possibles, par exemple : *4**M*nom affichera les 4 premières lettres du nom misent en majuscule. *M**4* est équivalent. *2M**5*nom affichera les 5 première lettres du nom dont les deux premières seront en majuscule."+"\r\n";
			line += "-->"+"\r\n";
			line += "<pattern>"+"\r\n";
			line += "	<phone>"+"\r\n";
			line += "		<description>'Telephone non connecte - '+nsite</description>"+"\r\n";
			line += "		<descriptiontoolong>'Telephone non connecte'</descriptiontoolong>"+"\r\n";
			line += "		<linedescription>''</linedescription>"+"\r\n";
			line += "		<linedescriptiontoolong>''</linedescriptiontoolong>"+"\r\n";
			line += "		<alertingname>''</alertingname>"+"\r\n";
			line += "		<alertingnametoolong>''</alertingnametoolong>"+"\r\n";
			line += "		<linetextlabel>'Telephone non connecte - '+nsite</linetextlabel>"+"\r\n";
			line += "		<linetextlabeltoolong>'Telephone non connecte'</linetextlabeltoolong>"+"\r\n";
			line += "		<css>'CSS_'+nsites</css>"+"\r\n";
			line += "		<cssline>'Restrict_Interne'</cssline>"+"\r\n";
			line += "		<serviceconnexion>Connexion:Connectez-vous</serviceconnexion>"+"\r\n";
			line += "	</phone>"+"\r\n";
			line += "	<phonefixe>"+"\r\n";
			line += "		<description>*M*nom+' '+*1M*prenom+' - '+nsite</description>"+"\r\n";
			line += "		<descriptiontoolong>*M*nom+' - '+nsite</descriptiontoolong>"+"\r\n";
			line += "		<linedescription>'DID '+nsite</linedescription>"+"\r\n";
			line += "		<linedescriptiontoolong>nsite</linedescriptiontoolong>"+"\r\n";
			line += "		<alertingname>*M*nom+' '+*1M*prenom</alertingname>"+"\r\n";
			line += "		<alertingnametoolong>*M*nom</alertingnametoolong>"+"\r\n";
			line += "		<display>*M*nom+' '+*1M*prenom</display>"+"\r\n";
			line += "		<displaytoolong>*M*nom</displaytoolong>"+"\r\n";
			line += "		<linetextlabel>*M*nom+' '+*1M*prenom</linetextlabel>"+"\r\n";
			line += "		<linetextlabeltoolong>*M*nom</linetextlabeltoolong>"+"\r\n";
			line += "		<digestuser>userid</digestuser>"+"\r\n";
			line += "		<css>'CSS_'+nsite</css>"+"\r\n";
			line += "		<serviceconnexion>Connexion</serviceconnexion>"+"\r\n";
			line += "	</phonefixe>"+"\r\n";
			line += "	<udp>"+"\r\n";
			line += "		<deviceprofilename>userid</deviceprofilename>"+"\r\n";
			line += "		<description>nsite+' - '+*M*nom+' '+*1M*prenom+' - '+titre</description>"+"\r\n";
			line += "		<descriptiontoolong>nsite+' - '+*M*nom+' '+*1**M*prenom+'. - '+titre</descriptiontoolong>"+"\r\n";
			line += "		<linedescription>nsite+' - '+*M*nom+' '+*1M*prenom+' - '+titre</linedescription>"+"\r\n";
			line += "		<linedescriptiontoolong>nsite+' - '+*M*nom+' '+*1**M*prenom+'. - '+titre</linedescriptiontoolong>"+"\r\n";
			line += "		<alertingname>*M*nom+' '+*1M*prenom+' - '+titre</alertingname>"+"\r\n";
			line += "		<alertingnametoolong>*M*nom+' '+*1**M*prenom+'. - '+titre</alertingnametoolong>"+"\r\n";
			line += "		<display>*M*nom+' '+*1M*prenom+' - '+titre</display>"+"\r\n";
			line += "		<displaytoolong>*M*nom+' '+*1**M*prenom+'. - '+titre</displaytoolong>"+"\r\n";
			line += "		<linetextlabel>*M*nom+' '+*1M*prenom+' - '+titre</linetextlabel>"+"\r\n";
			line += "		<linetextlabeltoolong>*M*nom+' '+*1**M*prenom+'. - '+titre</linetextlabeltoolong>"+"\r\n";
			line += "		<servicedeconnexion>Deconnexion</servicedeconnexion>"+"\r\n";
			line += "	</udp>"+"\r\n";
			line += "	<user>"+"\r\n";
			line += "		<nom>*M*nom</nom>"+"\r\n";
			line += "		<prenom>*1M*prenom</prenom>"+"\r\n";
			line += "		<userid>userid</userid>"+"\r\n";
			line += "		<departement>nsite</departement>"+"\r\n";
			line += "		<usergroup>'CG92 CCM End Users'</usergroup>"+"\r\n";
			line += "	</user>"+"\r\n";
			line += "	<divers>"+"\r\n";
			line += "		<tranchenumhsda>81100000:81109999</tranchenumhsda>"+"\r\n";
			line += "		<tranchecpg>8120000:8120999</tranchecpg>"+"\r\n";
			line += "		<partitionhsda>'P_HSDA'</partitionhsda>"+"\r\n";
			line += "		<partitionsda>'P_SDA'</partitionsda>"+"\r\n";
			line += "		<tranchelinegroup>8130000:8130999</tranchelinegroup>"+"\r\n";
			line += "		<subscribecallingsearchspace>'CSS_SUBSCRIBE'</subscribecallingsearchspace>"+"\r\n";
			line += "		<profilmevo>'MEVO_CG92'</profilmevo>"+"\r\n";
			line += "		<cssFW>'CSS_FW_site_distant'</cssFW>"+"\r\n";
			line += "	</divers>"+"\r\n";
			line += "	<callpickupgroup>"+"\r\n";
			line += "		<pickupnotification>Visual Alert</pickupnotification><!--No Alert,Audio Alert,Visual Alert,Audio and Visual Alert-->"+"\r\n";
			line += "		<pickupnotificationtimer>2</pickupnotificationtimer>"+"\r\n";
			line += "		<callingpartyinfo>true</callingpartyinfo><!--true,false-->"+"\r\n";
			line += "		<calledpartyinfo>true</calledpartyinfo><!--true,false-->"+"\r\n";
			line += "	<callpickupgroup>"+"\r\n";
			line += "</pattern>"+"\r\n";
			
			tamponUser.write(line);
			/*************************************/
			
			/******************************
			 * Ecriture du fichier templateCCM.xml
			 ******************************/
			line = "";
			line += "<!-- "+variable.getNomProg()+" - "+variable.getVersionProg()+" -->"+"\r\n";
			line += "<!--Fichier de paramétrage de la collecte-->"+"\r\n";
			line += "<!--Rappel :"+"\r\n";
			line += "Nom/Description du site = desc"+"\r\n";
			line += "Surnom du site = nsite"+"\r\n";
			line += "Pays = country"+"\r\n";
			line += "sda = sda"+"\r\n";
			line += "E164 prefixe = E164"+"\r\n";
			line += "Num standard = standard"+"\r\n";
			line += "Tranche SDA = tranche"+"\r\n";
			line += "Texte libre à mettre entre guillement simple, exemple = 'test'"+"\r\n";
			line += "utiliser des + pour séparer les éléments"+"\r\n";
			line += "-->"+"\r\n";
			line += "<pattern>"+"\r\n";
			line += "	<location>"+"\r\n";
			line += "		<name>'LOC_'+nsite</name>"+"\r\n";
			line += "	</location>"+"\r\n";
			line += "	<region>"+"\r\n";
			line += "		<name>'REG_'+nsite</name>"+"\r\n";
			line += "	</region>"+"\r\n";
			line += "	<srstreference>"+"\r\n";
			line += "		<name>'SRST_'+nsite</name>"+"\r\n";
			line += "		<matchName>'SRST'</matchName>"+"\r\n";
			line += "	</srstreference>"+"\r\n";
			line += "	<devicepool>"+"\r\n";
			line += "		<name>'DP_'+nsite</name>"+"\r\n";
			line += "	</devicepool>"+"\r\n";
			line += "	<conferencebridge>"+"\r\n";
			line += "		<name>'CFB_'+nsite</name>"+"\r\n";
			line += "		<description>'ISR sur '+nsite</description>"+"\r\n";
			line += "	</conferencebridge>"+"\r\n";
			line += "	<mediaressourcegroup>"+"\r\n";
			line += "		<name>'MRG_'+nsite</name>"+"\r\n";
			line += "		<description>'Ressource Médias allouées sur ISR '+nsite</description>"+"\r\n";
			line += "	</mediaressourcegroup>"+"\r\n";
			line += "	<mediaressourcegrouplist>"+"\r\n";
			line += "		<name>'MRGL_'+nsite</name>"+"\r\n";
			line += "	</mediaressourcegrouplist>"+"\r\n";
			line += "	<gateway>"+"\r\n";
			line += "		<description>'ISR site '+nsite</description>"+"\r\n";
			line += "		<matchName>'ISR'</matchName>"+"\r\n";
			line += "		<protocol>'MGCP'</protocol>"+"\r\n";
			line += "		<css>'CSS_ALL'</css>"+"\r\n";
			line += "		<calledpartytransformationcss>''</calledpartytransformationcss>"+"\r\n";
			line += "		<callingpartytransformationcss>'CSS_CALLING_OUT_'+nsite</callingpartytransformationcss>"+"\r\n";
			line += "		<significantdigit>'4'</significantdigit>"+"\r\n";
			line += "		<prefixdn>prefixe</prefixdn>"+"\r\n";
			line += "		<nationalprefix>'00'</nationalprefix>"+"\r\n";
			line += "		<internationalprefix>'000'</internationalprefix>"+"\r\n";
			line += "		<unknownprefix>''</unknownprefix>"+"\r\n";
			line += "		<subscriberprefix>''</subscriberprefix>"+"\r\n";
			line += "	</gateway>"+"\r\n";
			line += "	<vg>"+"\r\n";
			line += "		<description>'VG '+desc</description>"+"\r\n";
			line += "		<matchName>'VG'</matchName>"+"\r\n";
			line += "		<protocol>'SCCP'</protocol>"+"\r\n";
			line += "		<css>'CSS_'+nsite</css>"+"\r\n";
			line += "	</vg>"+"\r\n";
			line += "	<routegroup>"+"\r\n";
			line += "		<name>'RG_'+nsite</name>"+"\r\n";
			line += "	</routegroup>"+"\r\n";
			line += "	<routelist>"+"\r\n";
			line += "		<name>'RL_'+nsite</name>"+"\r\n";
			line += "		<description>'Sortie PSTN '+desc</description>"+"\r\n";
			line += "		<callingpartytransformationmask>'XXXXXXXXX'</callingpartytransformationmask>"+"\r\n";
			line += "		<usefullyqualcallingpartynum>'On'</usefullyqualcallingpartynum>"+"\r\n";
			line += "	</routelist>"+"\r\n";
			line += "	<commondeviceconfiguration>"+"\r\n";
			line += "		<name>'CDC_CG92'</name>"+"\r\n";
			line += "	</commondeviceconfiguration>"+"\r\n";
			line += "	<translationpattern>"+"\r\n";
			line += "		<!--"+"\r\n";
			line += "		<tp>"+"\r\n";
			line += "			<pattern>'XXXX'</pattern>"+"\r\n";
			line += "			<description>desc+' 4 digits dialing'</description>"+"\r\n";
			line += "			<routepartition>'TP_'+nsite</routepartition>"+"\r\n";
			line += "			<callingsearchspace>'CSS_INTERNAL'</callingsearchspace>"+"\r\n";
			line += "			<urgentpriority>'true'</urgentpriority>"+"\r\n";
			line += "			<usecallingpartysexternalphonenumbermask>'On'</usecallingpartysexternalphonenumbermask>"+"\r\n";
			line += "			<discarddigits>''</discarddigits>"+"\r\n";
			line += "			<calledpartytransformmask>prefixe+'XXXX'</calledpartytransformmask>"+"\r\n";
			line += "		</tp>"+"\r\n";
			line += "		-->"+"\r\n";
			line += "	</translationpattern>"+"\r\n";
			line += "	<calledpartytranspattern>"+"\r\n";
			line += "		<!--"+"\r\n";
			line += "		<calledptp>"+"\r\n";
			line += "			<pattern>'!'</pattern>"+"\r\n";
			line += "			<description>desc+' add 0 for outgoing calls'</description>"+"\r\n";
			line += "			<routepartition>'P_'+nsite+'_CALLED_OUT'</routepartition>"+"\r\n";
			line += "			<discarddigitinstructions>''</discarddigitinstructions>"+"\r\n";
			line += "			<calledpartytransformationmask>''</calledpartytransformationmask>"+"\r\n";
			line += "			<prefixdigits>'00'</prefixdigits>"+"\r\n";
			line += "		</calledptp>"+"\r\n";
			line += "		-->"+"\r\n";
			line += "	</calledpartytranspattern>"+"\r\n";
			line += "	<callingpartytranspattern>"+"\r\n";
			line += "		<callingptp>"+"\r\n";
			line += "				<pattern>prefixe+'XXXX'</pattern>"+"\r\n";
			line += "				<description>'Affichage SDA appels sortants '+nsite</description>"+"\r\n";
			line += "				<routepartition>'P_CALLING_OUT_'+nsite</routepartition>"+"\r\n";
			line += "				<usecallingpartyexternalphonenumbermask>Off</usecallingpartyexternalphonenumbermask>"+"\r\n";
			line += "				<callingpartytransformationmask>standard</callingpartytransformationmask>"+"\r\n";
			line += "				<prefixdigits>''</prefixdigits>"+"\r\n";
			line += "				<callinglineidpresentation>Allowed</callinglineidpresentation>"+"\r\n";
			line += "				<callingpartynumbertype>Cisco CallManager</callingpartynumbertype>"+"\r\n";
			line += "				<callingpartynumberingplan>Cisco CallManager</callingpartynumberingplan>"+"\r\n";
			line += "		</callingptp>"+"\r\n";
			line += "	</callingpartytranspattern>"+"\r\n";
			line += "	<partitions>"+"\r\n";
			line += "		<part>"+"\r\n";
			line += "			<name>'P_CALLING_IN_'+nsite</name>"+"\r\n";
			line += "			<description>'Manipulation de digits appels entrants '+nsite</description>"+"\r\n";
			line += "		</part>"+"\r\n";
			line += "		<part>"+"\r\n";
			line += "			<name>'P_CALLING_OUT_'+nsite</name>"+"\r\n";
			line += "			<description>'Manipulation de digits appels sortants '+nsite</description>"+"\r\n";
			line += "		</part>"+"\r\n";
			line += "	</partitions>"+"\r\n";
			line += "	<callingsearchspaces>"+"\r\n";
			line += "		<css>"+"\r\n";
			line += "			<name>'CSS_'+nsite</name>"+"\r\n";
			line += "			<description>'CSS device du site '+nsite</description>"+"\r\n";
			line += "			<usesitepartition>false</usesitepartition>"+"\r\n";
			line += "			<P>'IPMA'</P>"+"\r\n";
			line += "			<P>'P_SDA'</P>"+"\r\n";
			line += "			<P>'P_SDA_79xx'</P>"+"\r\n";
			line += "			<P>'P_SDA_ANALOG'</P>"+"\r\n";
			line += "			<P>'P_STD_HOD'</P>"+"\r\n";
			line += "			<P>'P_MeVo'</P>"+"\r\n";
			line += "			<P>'P_UCCX'</P>"+"\r\n";
			line += "			<P>'P_HSDA'</P>"+"\r\n";
			line += "			<P>'P_'+country</P>"+"\r\n";
			line += "		</css>"+"\r\n";
			line += "		<css>"+"\r\n";
			line += "			<name>'CSS_CALLING_IN_'+nsite</name>"+"\r\n";
			line += "			<description>'CSS Transformation appels entrant '+nsite</description>"+"\r\n";
			line += "			<usesitepartition>false</usesitepartition>"+"\r\n";
			line += "			<P>'P_CALLING_IN_'+nsite</P>"+"\r\n";
			line += "		</css>"+"\r\n";
			line += "		<css>"+"\r\n";
			line += "			<name>'CSS_CALLING_OUT_'+nsite</name>"+"\r\n";
			line += "			<description>'CSS Transformation appels sortant '+nsite</description>"+"\r\n";
			line += "			<usesitepartition>false</usesitepartition>"+"\r\n";
			line += "			<P>'P_CALLING_OUT_'+nsite</P>"+"\r\n";
			line += "		</css>"+"\r\n";
			line += "	</callingsearchspaces>"+"\r\n";
			line += "</pattern>"+"\r\n";
			
			tamponCCM.write(line);
			/****************************************/
			
			/******************************
			 * Ecriture du fichier templateGW.xml
			 ******************************/
			line = "";
			line += "<!-- "+variable.getNomProg()+" - "+variable.getVersionProg()+" -->"+"\r\n";
			line += "<!--Fichier de paramétrage de la collecte-->"+"\r\n";
			line += "<!--Rappel :"+"\r\n";
			line += "Nom de la gateway = nomgw"+"\r\n";
			line += "Adresse IP = ipgw"+"\r\n";
			line += "Masque = maskgw"+"\r\n";
			line += "Passerelle par défaut = defaultgw"+"\r\n";
			line += "Interface réseau = interface"+"\r\n";
			line += "Nom de domaine = domainname"+"\r\n";
			line += "Nom du Site = nsite"+"\r\n";
			line += "Surnom du site = desc"+"\r\n";
			line += "Username = login"+"\r\n";
			line += "Mot de passe = pass"+"\r\n";
			line += "Nombre d'IT = nbit"+"\r\n";
			line += "Nom musique d'attente = mohfile"+"\r\n";
			line += "Adresse IP serveur ntp = ipntp"+"\r\n";
			line += "prefixe du site = prefixesite"+"\r\n";
			line += "sda du site = sdasite"+"\r\n";
			line += "Adresse IP ccm 1 = ccm1"+"\r\n";
			line += "Adresse IP ccm 2 = ccm2"+"\r\n";
			line += "Adresse IP ccm 3 = ccm3"+"\r\n";
			line += "Nombre maximum de session de conference = maxsession"+"\r\n";
			line += "Pays = country"+"\r\n";
			line += "Texte libre à mettre entre guillement simple, exemple = 'test'"+"\r\n";
			line += "utiliser des + pour séparer les éléments"+"\r\n";
			line += "Un chiffre placé avant une valeur indique le nombre de lettre à utiliser, exemple :"+"\r\n";
			line += "*1*prenom = On utilise la première lettre du prénom"+"\r\n";
			line += "-->"+"\r\n";
			line += "<pattern>"+"\r\n";
			line += "	<params>"+"\r\n";
			line += "		<gateway>"+"\r\n";
			line += "			<misc>"+"\r\n";
			line += "				<name>ISR</name>"+"\r\n";
			line += "			</misc>"+"\r\n";
			line += "			<configure>"+"\r\n";
			line += "				<wait_50>enable</wait_50>"+"\r\n";
			line += "				<wait_50>configure terminal</wait_50>"+"\r\n";
			line += "				<wait_50>User</wait_50>"+"\r\n";
			line += "			</configure>"+"\r\n";
			line += "			<serial>"+"\r\n";
			line += "				<wait_50>cisco</wait_50>"+"\r\n";
			line += "				<wait_50>cisco</wait_50>"+"\r\n";
			line += "				<wait_50>enable</wait_50>"+"\r\n";
			line += "				<wait_50>cisco</wait_50>"+"\r\n";
			line += "				<wait_50>configure terminal</wait_50>"+"\r\n";
			line += "				<wait_50>aaa new-model</wait_50>"+"\r\n";
			line += "				<wait_50>aaa authentication login default local</wait_50>"+"\r\n";
			line += "				<wait_50>aaa authorization console</wait_50>"+"\r\n";
			line += "				<wait_50>aaa authorization exec default local if-authenticated</wait_50>"+"\r\n";
			line += "				<wait_50>aaa session-id common</wait_50>"+"\r\n";
			line += "				<wait_50>'username '+login+' privilege 15 secret '+pass</wait_50>"+"\r\n";
			line += "				<wait_50>'interface '+interface</wait_50>"+"\r\n";
			line += "				<wait_50>'ip address '+ipgw+' '+maskgw</wait_50>"+"\r\n";
			line += "				<wait_50>no shut</wait_50>"+"\r\n";
			line += "				<wait_50>'ip default-gateway '+defaultgw</wait_50>"+"\r\n";
			line += "				<wait_50>'ip route 0.0.0.0 0.0.0.0 '+defaultgw</wait_50>"+"\r\n";
			line += "			</serial>"+"\r\n";
			line += "			<common>"+"\r\n";
			line += "				<wait_50>service password-encryption</wait_50>"+"\r\n";
			line += "				<wait_50>voice-card 0</wait_50>"+"\r\n";
			line += "				<wait_50>dsp services dspfarm</wait_50>"+"\r\n";
			line += "				<wait_50>voice service voip</wait_50>"+"\r\n";
			line += "				<wait_50>fax protocol t38 ls-redundancy 0 hs-redundancy 0 fallback none</wait_50>"+"\r\n";
			line += "				<wait_50>'ntp server '+ipntp</wait_50>"+"\r\n";
			line += "				<wait_50>ip tcp path-mtu-discovery</wait_50>"+"\r\n";
			line += "			</common>"+"\r\n";
			line += "			<network>"+"\r\n";
			line += "				<wait_50>'hostname '+nomgw</wait_50>"+"\r\n";
			line += "				<wait_50>'ip domain name '+domainname</wait_50>"+"\r\n";
			line += "			</network>"+"\r\n";
			line += "			<port>"+"\r\n";
			line += "				<wait_50>card type e1 0 0</wait_50>"+"\r\n";
			line += "				<wait_50>network-clock-participate wic 0</wait_50>"+"\r\n";
			line += "				<wait_50>network-clock-select 1 E1 0/0/0</wait_50>"+"\r\n";
			line += "				<wait_50>isdn switch-type primary-net5</wait_50>"+"\r\n";
			line += "				<wait_50>controller E1 0/0/0</wait_50>"+"\r\n";
			line += "				<wait_50>'pri-group timeslots 1-'+nbit+' service mgcp'</wait_50>"+"\r\n";
			line += "				<wait_50>interface Serial0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>isdn switch-type primary-net5</wait_50>"+"\r\n";
			line += "				<wait_50>isdn overlap-receiving T302 4000</wait_50>"+"\r\n";
			line += "				<wait_50>voice-port 0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>translation-profile incoming IN</wait_50>"+"\r\n";
			line += "				<wait_50>translation-profile outgoing OUT</wait_50>"+"\r\n";
			line += "			</port>"+"\r\n";
			line += "			<translationrule>"+"\r\n";
			line += "				<wait_50>voice translation-rule 1</wait_50>"+"\r\n";
			line += "				<wait_50>rule 1 /^0/ //</wait_50>"+"\r\n";
			line += "				<wait_50>voice translation-rule 2</wait_50>"+"\r\n";
			line += "				<wait_50>'rule 1 /^'+prefixe+'/ /'+sda+'\\1/ type unknown national plan unknown isdn'</wait_50>"+"\r\n";
			line += "				<wait_50>voice translation-rule 3</wait_50>"+"\r\n";
			line += "				<wait_50>rule 1 /^\\(.*\\)/ /000\\1/ type international international</wait_50>"+"\r\n";
			line += "				<wait_50>rule 2 /^\\(.*\\)/ /00\\1/ type national national</wait_50>"+"\r\n";
			line += "				<wait_50>rule 3 /^\\(.*\\)/ /00\\1/ type unknown unknown</wait_50>"+"\r\n";
			line += "				<wait_50>voice translation-rule 4</wait_50>"+"\r\n";
			line += "				<wait_50>'rule 1 /^..../ /'+prefixe+'\\0/'</wait_50>"+"\r\n";
			line += "				<wait_50>voice translation-profile IN</wait_50>"+"\r\n";
			line += "				<wait_50>translate calling 3</wait_50>"+"\r\n";
			line += "				<wait_50>translate called 4</wait_50>"+"\r\n";
			line += "				<wait_50>voice translation-profile OUT</wait_50>"+"\r\n";
			line += "				<wait_50>translate calling 2</wait_50>"+"\r\n";
			line += "				<wait_50>translate called 1</wait_50>"+"\r\n";
			line += "			</translationrule>"+"\r\n";
			line += "			<mgcp>"+"\r\n";
			line += "				<wait_50>'ccm-manager mgcp'</wait_50>"+"\r\n";
			line += "				<wait_50>'ccm-manager music-on-hold bind '+interface</wait_50>"+"\r\n";
			line += "				<wait_50>'ccm-manager config server '+ccm1</wait_50>"+"\r\n";
			line += "				<wait_50>ccm-manager config</wait_50>"+"\r\n";
			line += "				<wait_50>'mgcp bind control source-interface '+interface</wait_50>"+"\r\n";
			line += "				<wait_50>'mgcp bind media source-interface '+interface</wait_50>"+"\r\n";
			line += "				<wait_50>'mgcp'</wait_50>"+"\r\n";
			line += "			</mgcp>"+"\r\n";
			line += "			<sccp>"+"\r\n";
			line += "				<wait_50>'sccp local '+interface</wait_50>"+"\r\n";
			line += "				<wait_50>'sccp ccm '+ccm1+' identifier 1 version 7.0+'</wait_50>"+"\r\n";
			line += "				<wait_50>'sccp ccm '+ccm2+' identifier 2 version 7.0+'</wait_50>"+"\r\n";
			line += "				<wait_50>sccp</wait_50>"+"\r\n";
			line += "				<wait_50>sccp ccm group 1</wait_50>"+"\r\n";
			line += "				<wait_50>associate ccm 1 priority 1</wait_50>"+"\r\n";
			line += "				<wait_50>associate ccm 2 priority 2</wait_50>"+"\r\n";
			line += "				<wait_50>'associate profile 1 register CFB_'+nsite</wait_50>"+"\r\n";
			line += "				<wait_50>dspfarm profile 1 conference</wait_50>"+"\r\n";
			line += "				<wait_50>codec g711ulaw</wait_50>"+"\r\n";
			line += "				<wait_50>codec g711alaw</wait_50>"+"\r\n";
			line += "				<wait_50>codec g729ar8</wait_50>"+"\r\n";
			line += "				<wait_50>codec g729abr8</wait_50>"+"\r\n";
			line += "				<wait_50>codec g729r8</wait_50>"+"\r\n";
			line += "				<wait_50>codec g729br8</wait_50>"+"\r\n";
			line += "				<wait_50>'maximum sessions '+maxsession</wait_50>"+"\r\n";
			line += "				<wait_50>associate application SCCP</wait_50>"+"\r\n";
			line += "				<wait_50>no shut</wait_50>"+"\r\n";
			line += "			</sccp>"+"\r\n";
			line += "			<dialpeer>"+"\r\n";
			line += "				<wait_50>dial-peer voice 1 pots</wait_50>"+"\r\n";
			line += "				<wait_50>'description *** '+country+' PSTN Access in case of SRST ***'</wait_50>"+"\r\n";
			line += "				<wait_50>destination-pattern 0T</wait_50>"+"\r\n";
			line += "				<wait_50>port 0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>forward-digits all</wait_50>"+"\r\n";
			line += "				<wait_50>dial-peer voice 2 pots</wait_50>"+"\r\n";
			line += "				<wait_50>description *** Inbound Calls in case of SRST ***</wait_50>"+"\r\n";
			line += "				<wait_50>incoming called-number .</wait_50>"+"\r\n";
			line += "				<wait_50>direct-inward-dial</wait_50>"+"\r\n";
			line += "				<wait_50>port 0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>dial-peer voice 3 pots</wait_50>"+"\r\n";
			line += "				<wait_50>description *** Emergency Access in case of SRST ***</wait_50>"+"\r\n";
			line += "				<wait_50>destination-pattern 1[578]</wait_50>"+"\r\n";
			line += "				<wait_50>port 0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>forward-digits 2</wait_50>"+"\r\n";
			line += "				<wait_50>dial-peer voice 4 pots</wait_50>"+"\r\n";
			line += "				<wait_50>description *** Emergency Access in case of SRST ***</wait_50>"+"\r\n";
			line += "				<wait_50>destination-pattern 01[578]</wait_50>"+"\r\n";
			line += "				<wait_50>port 0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>forward-digits 2</wait_50>"+"\r\n";
			line += "				<wait_50>dial-peer voice 5 pots</wait_50>"+"\r\n";
			line += "				<wait_50>description *** Emergency Access in case of SRST ***</wait_50>"+"\r\n";
			line += "				<wait_50>destination-pattern 11[258]</wait_50>"+"\r\n";
			line += "				<wait_50>port 0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>forward-digits 3</wait_50>"+"\r\n";
			line += "				<wait_50>dial-peer voice 6 pots</wait_50>"+"\r\n";
			line += "				<wait_50>description *** Emergency Access in case of SRST ***</wait_50>"+"\r\n";
			line += "				<wait_50>destination-pattern 011[258]</wait_50>"+"\r\n";
			line += "				<wait_50>port 0/0/0:15</wait_50>"+"\r\n";
			line += "				<wait_50>forward-digits 3</wait_50>"+"\r\n";
			line += "			</dialpeer>"+"\r\n";
			line += "			<srst>"+"\r\n";
			line += "				<wait_50>application</wait_50>"+"\r\n";
			line += "				<wait_50>global</wait_50>"+"\r\n";
			line += "				<wait_50>service alternate Default</wait_50>"+"\r\n";
			line += "				<wait_50>ccm-manager fallback-mgcp</wait_50>"+"\r\n";
			line += "				<wait_50>call-manager-fallback</wait_50>"+"\r\n";
			line += "				<wait_50>max-conferences 4 gain -6</wait_50>"+"\r\n";
			line += "				<wait_50>transfer-system full-consult</wait_50>"+"\r\n";
			line += "				<wait_50>'ip source-address '+ipgw+' port 2000'</wait_50>"+"\r\n";
			line += "				<wait_50>max-ephones 50</wait_50>"+"\r\n";
			line += "				<wait_50>yes</wait_50>"+"\r\n";
			line += "				<wait_50>max-dn 100 dual-line</wait_50>"+"\r\n";
			line += "				<wait_50>system message primary Mode secours</wait_50>"+"\r\n";
			line += "				<wait_50>transfer-pattern .T</wait_50>"+"\r\n";
			line += "				<wait_50>keepalive 10</wait_50>"+"\r\n";
			line += "				<wait_50>call-forward pattern .T</wait_50>"+"\r\n";
			line += "				<wait_50>'moh '+mohfile</wait_50>"+"\r\n";
			line += "				<wait_50>time-format 24</wait_50>"+"\r\n";
			line += "				<wait_50>date-format dd-mm-yy</wait_50>"+"\r\n";
			line += "			</srst>"+"\r\n";
			line += "			<banner>"+"\r\n";
			line += "				<wait_50>banner exec ^</wait_50>"+"\r\n";
			line += "				<wait_50>'Connected to : '+nomgw</wait_50>"+"\r\n";
			line += "				<wait_50>************************************************************************</wait_50>"+"\r\n";
			line += "				<wait_50>*                                                                      *</wait_50>"+"\r\n";
			line += "				<wait_50>*    L'acces a cet equipement est restreint aux personnes autorisees   *</wait_50>"+"\r\n";
			line += "				<wait_50>*                Veuillez vous deconnecter immediatement               *</wait_50>"+"\r\n";
			line += "				<wait_50>*                 sous peine de poursuites judiciaires                 *</wait_50>"+"\r\n";
			line += "				<wait_50>*                                                                      *</wait_50>"+"\r\n";
			line += "				<wait_50>************************************************************************</wait_50>"+"\r\n";
			line += "				<wait_50>*                                                                      *</wait_50>"+"\r\n";
			line += "				<wait_50>*                    Unauthorised access prohibited                    *</wait_50>"+"\r\n";
			line += "				<wait_50>*                                                                      *</wait_50>"+"\r\n";
			line += "				<wait_50>*               Please, disconnect now or you'll be sued               *</wait_50>"+"\r\n";
			line += "				<wait_50>*                                                                      *</wait_50>"+"\r\n";
			line += "				<wait_50>************************************************************************</wait_50>"+"\r\n";
			line += "				<wait_50>^</wait_50>"+"\r\n";
			line += "			</banner>"+"\r\n";
			line += "			<customerspec>"+"\r\n";
			line += "				<wait_50>snmp-server community exploit RO</wait_50>"+"\r\n";
			line += "				<wait_50>snmp-server community NETfenua99 RW</wait_50>"+"\r\n";
			line += "			</customerspec>"+"\r\n";
			line += "			<authentication>"+"\r\n";
			line += "				<wait_50>line vty 0 4</wait_50>"+"\r\n";
			line += "				<wait_50>transport input telnet ssh</wait_50>"+"\r\n";
			line += "				<wait_50>line vty 5 15</wait_50>"+"\r\n";
			line += "				<wait_50>transport input telnet ssh</wait_50>"+"\r\n";
			line += "				<wait_4000>crypto key generate rsa usage-keys modulus 1024 exportable</wait_4000>"+"\r\n";
			line += "			</authentication>"+"\r\n";
			line += "			<saving>"+"\r\n";
			line += "				<wait_50>'end'</wait_50>"+"\r\n";
			line += "				<wait_2000>'copy running-config startup-config'</wait_2000>"+"\r\n";
			line += "				<wait_4000>''</wait_4000>"+"\r\n";
			line += "			</saving>"+"\r\n";
			line += "		</gateway>"+"\r\n";
			line += "	</params>"+"\r\n";
			line += "</pattern>"+"\r\n";
			
			tamponGW.write(line);
			/*****************************************/
			}
		catch(Exception e)
			{
			e.printStackTrace();
			System.out.println(e.getMessage()+"\n\n");
			JOptionPane.showMessageDialog(null,"L'erreur suivante est survenu durant la création du fichier source : \r\n"+e.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
			}
		finally
			{
			try
				{
				tamponUser.flush();
				tamponUser.close();
				tamponCCM.flush();
				tamponCCM.close();
				tamponGW.flush();
				tamponGW.close();
				fwUser.close();
				fwCCM.close();
				fwGW.close();
				System.out.println("fichier de Template fermé");
				JOptionPane.showMessageDialog(null,"Les fichiers de template ont été créer avec succès","Information",JOptionPane.INFORMATION_MESSAGE);
				}
			catch(Exception e)
				{
				e.printStackTrace();
				System.out.println("Erreur : "+e.getMessage());
				}
			}
		}
	
	public void openFile() throws Exception
		{
		//File Opening
		fileUser = new File(emplacementDest+"\\"+nomFichierUser);
		fileCCM = new File(emplacementDest+"\\"+nomFichierCCM);
		fileGW = new File(emplacementDest+"\\"+nomFichierGW);
		
		//File Writer
		fwUser = new FileWriter(fileUser, false);
		fwCCM = new FileWriter(fileCCM, false);
		fwGW = new FileWriter(fileGW, false);
		
		//Buffer definition
		tamponUser = new BufferedWriter(fwUser);
		tamponCCM = new BufferedWriter(fwCCM);
		tamponGW = new BufferedWriter(fwGW);
		}
	
	/*2012*//*RATEL Alexandre 8)*/
	}

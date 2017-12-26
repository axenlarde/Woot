
package com.alex.woot.misc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import utils.variable;

/**
 * Class used to save in an xml file the result of
 * A successful injection
 */
public class SaveResult
	{
	/**
	 * Variables
	 */
	Boolean done;
	String line;
	
	//File
	String nomFichierSave;
	File fileSave;
	BufferedWriter tamponSave;
	FileWriter fwSave;
	
	//Excel
	WritableWorkbook monWorkbook;
	WritableSheet sheet;
	WritableFont arial10font;
	WritableFont arial10font2;
	WritableCellFormat TitleFormat;
	WritableCellFormat arial10format;
	
	//Source
	String emplacementDest;
	JFileChooser fcDest;
	
	
	/**
	 * Constructeur
	 */
	public SaveResult(String nomFichierSave)
		{
		done = false;
		fcDest = new JFileChooser();
		line = "";
		this.nomFichierSave = nomFichierSave;
		
		if(variable.getTargetOption("automaticReport").compareTo("Oui") == 0)
			{
			if(variable.getEmplacementBase().compareTo("") != 0)
				{
				emplacementDest = variable.getEmplacementBase();
				}
			else
				{
				emplacementDest = ".";
				}
			done = true;
			}
		else
			{
			cheminRep();
			}
		
		
		
		if(done)
			{
			/**************************************
			 * Génération du fichier de sauvegarde
			 **************************************/
			saveXML();
			saveXLS();
			/*****************************/
			}
		}
	
	/**
	 * Method used to save result in an xml file
	 */
	private void saveXML()
		{
		try
			{
			openFile(utils.variable.getSmartFilePath(emplacementDest, nomFichierSave, "xml"));
			
			line += "<pattern>\r\n";
			line += "<save>\r\n";
			
			for(int i=0; i<utils.variable.getSarl().size(); i++)
				{
				line += "<entry>\r\n";
				line += "<requestname>"+utils.variable.getSarl().get(i).getAxlDeleteRequestName()+"</requestname>\r\n";
				line += "<requestdesc>suppression de : "+utils.variable.getSarl().get(i).getAxlRequestDesc()+"</requestdesc>\r\n";
				line += "<answerstatus>"+utils.variable.getSarl().get(i).getAxlAnswerStatus().name()+"</answerstatus>\r\n";
				line += "<answerdesc>"+utils.variable.getSarl().get(i).getAxlAnswerDesc()+"</answerdesc>\r\n";
				line += "<uid>"+utils.variable.getSarl().get(i).getUid()+"</uid>\r\n";
				line += "</entry>\r\n";
				}
			
			line += "</save>\r\n";
			line += "</pattern>\r\n";
			
			tamponSave.write(line);
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			System.out.println(exc.getMessage());
			}
		finally
			{
			try
				{
				tamponSave.flush();
				tamponSave.close();
				fwSave.close();
				System.out.println("fichier de Sauvegarde XML fermé");
				//JOptionPane.showMessageDialog(null,"Le fichier de sauvegarde XML a été créée avec succès","Information",JOptionPane.INFORMATION_MESSAGE);
				}
			catch(Exception e)
				{
				e.printStackTrace();
				System.out.println("Erreur : "+e.getMessage());
				}
			}
		}
	
	
	private void saveXLS()
		{
		try
			{
			openSheet(utils.variable.getSmartFilePath(emplacementDest, nomFichierSave, "xls"));
			
			sheet = monWorkbook.createSheet("Resultat", 0);
			
			//Définition des formats
			arial10font = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD);
			arial10font.setColour(Colour.WHITE);
			arial10font2 = new WritableFont(WritableFont.ARIAL, 10);
			arial10font2.setColour(Colour.BLACK);
			
			TitleFormat = new WritableCellFormat(arial10font);
			TitleFormat.setBackground(Colour.DARK_BLUE);
			
			arial10format = new WritableCellFormat(arial10font2);
			
			/***************
			 * Ecriture
			 ***************/
			//Titre
			sheet.addCell(new Label(0, 0, "Action", TitleFormat));
			sheet.addCell(new Label(1, 0, "Description de l'action", TitleFormat));
			sheet.addCell(new Label(2, 0, "Résultat", TitleFormat));
			sheet.addCell(new Label(3, 0, "Description du résultat", TitleFormat));
			sheet.addCell(new Label(4, 0, "UUID", TitleFormat));
			
			//Ecriture des données
			for(int i=0; i<utils.variable.getSarl().size(); i++)
				{
				sheet.addCell(new Label(0, i+1, utils.variable.getSarl().get(i).getAxlRequestName(), arial10format));
				sheet.addCell(new Label(1, i+1, utils.variable.getSarl().get(i).getAxlRequestDesc(), arial10format));
				sheet.addCell(new Label(2, i+1, utils.variable.getSarl().get(i).getAxlAnswerStatus().name(), arial10format));
				sheet.addCell(new Label(3, i+1, utils.variable.getSarl().get(i).getAxlAnswerDesc(), arial10format));
				sheet.addCell(new Label(4, i+1, utils.variable.getSarl().get(i).getUid(), arial10format));
				}
			monWorkbook.write();
			}
		catch(Exception e)
			{
			e.printStackTrace();
			System.out.println(e.getMessage());
			}
		finally
			{
			try
				{
				monWorkbook.close();
				System.out.println("fichier de Sauvegarde Excel fermé");
				if(variable.getTargetOption("automaticReport").compareTo("Oui") != 0)
					{
					JOptionPane.showMessageDialog(null,"Le fichier de sauvegarde Excel a été créée avec succès","Information",JOptionPane.INFORMATION_MESSAGE);
					}
				}
			catch(Exception e)
				{
				e.printStackTrace();
				System.out.println(e.getMessage());
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
	
	public void openFile(String path) throws Exception
		{
		//We open the file
		fileSave = new File(path);
		
		//File Writer
		fwSave = new FileWriter(fileSave, false);
		
		//Buffer definition
		tamponSave = new BufferedWriter(fwSave);
		}
	
	/***********************************************
	 * Méthode qui ouvre une nouvelle feuille excel
	 ***********************************************/
	public void openSheet(String path) throws Exception
		{
		monWorkbook = Workbook.createWorkbook(new File(path));
		}
	
	/*2012*//*RATEL Alexandre 8)*/
	}

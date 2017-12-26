package com.alex.woot.utils;

//Imports
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.JDialog;


public class Centrer 
	{
	/********
	/* Variables
	*********/
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension dimEcran = tk.getScreenSize();
	int larg = (dimEcran.width)/2;
	int haut = (dimEcran.height)/2;
	

	/********
	/* Constructeur
	********/
	public Centrer(JFrame maFenetre)
		{
		larg -= maFenetre.getSize().width/2;
		haut -= maFenetre.getSize().height/2;
		maFenetre.setBounds(larg,haut, maFenetre.getSize().width, maFenetre.getSize().height);
		}
	
	public Centrer(JDialog monDialog)
		{
		larg -= monDialog.getSize().width/2;
		haut -= monDialog.getSize().height/2;
		monDialog.setBounds(larg,haut, monDialog.getSize().width, monDialog.getSize().height);
		}
	
	public Centrer(JWindow maWindow)
		{
		larg -= maWindow.getSize().width/2;
		haut -= maWindow.getSize().height/2;
		maWindow.setBounds(larg,haut, maWindow.getSize().width, maWindow.getSize().height);
		}
	
	/*Fin classe*/
	}

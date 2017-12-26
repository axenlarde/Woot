package com.alex.woot.gui;

import javax.swing.JFrame;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author liheewe
 */

/**
 * L'icone à pour format 16 * 16 pixel au format gif (la taille n'est pas sûr)
 */

public class Aspect
	{
    public static void load(JFrame fen, String iconePath, String softName) throws Exception
    	{
        //Changement de l'icone de l'application
        Image icone = Toolkit.getDefaultToolkit().getImage(iconePath);
        fen.setIconImage(icone);


        //Charge une icone avec une description dans le Systray
        if (SystemTray.isSupported())
        	{
            try
            	{
                ImageIcon im = new ImageIcon(iconePath);
                Image image = im.getImage();
                TrayIcon tic = new TrayIcon(image, softName);
                tic.setImageAutoSize(true);
                SystemTray tray = SystemTray.getSystemTray();
                tray.add(tic);
            	}
            catch (AWTException ex)
            	{
            	throw new Exception("ERROR : Erreur lors du chargement de l'icone dans le Systray" + ex.getMessage());
            	}
        	}
        else
        	{
        	throw new Exception("ERROR : Systray not supported");
        	}
    	}

    public static void LookandFeel(JFrame fen) throws Exception
    	{
        //Change l'aspet de notre application
        try
        	{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(fen);
            //force chaque composant de la fenetre a  appeler sa methode updateUI
        	}
        catch (Exception ex) 
        	{
        	ex.printStackTrace();
        	throw new Exception(ex.getMessage());
        	}
    	}
    
    /*Fin classe*/
	}

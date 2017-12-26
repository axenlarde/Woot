package com.alex.woot.gui;
//Import
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.TitledBorder;

import com.alex.woot.utils.Centrer;
import com.alex.woot.utils.Variables;


public class WindowApropos extends JWindow implements MouseListener
	{
	/**************
	 * Variables
	 **************/
	private int larg;
	private int haut;
	
	
	private String about, softwareName, softwareVersion, author, email;
	
	//Disposition
	private JPanel principale;
	private JPanel logo;
	private JPanel texte;
	
	/***************
	 * Constructeur
	 ***************/
	public WindowApropos(String about, String softwareName, String softwareVersion, String author, String email)
		{
		super();
		
		this.about = about;
		this.softwareName = softwareName;
		this.softwareVersion = softwareVersion;
		this.author = author;
		this.email = email;
		
		larg = 500;
		haut = 160;
		
		//Disposition
		principale = new JPanel();
		logo = new JPanel();
		texte = new JPanel();
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		principale.setLayout(new BoxLayout(principale,BoxLayout.X_AXIS));
		logo.setLayout(new BoxLayout(logo,BoxLayout.Y_AXIS));
		texte.setLayout(new BoxLayout(texte,BoxLayout.Y_AXIS));
		
		//Paramètres
		principale.setBackground(Color.white);
		texte.setBackground(Color.white);
		logo.setBackground(Color.white);
		principale.setBorder(new TitledBorder(about));
		
		//Assignation
		texte.add(new JLabel(" "));
		texte.add(new JLabel(" "+softwareName));
		texte.add(new JLabel(" "));
		texte.add(new JLabel(" "+softwareVersion));
		texte.add(new JLabel(" "));
		texte.add(new JLabel(" "+author));
		texte.add(new JLabel(" "));
		texte.add(new JLabel(" "+email));
		texte.add(new JLabel(" "));
		
		logo.add(new JLabel(" "));
		logo.add(Box.createVerticalGlue());
		//logo.add(new JLabel(new ImageIcon(getClass().getResource("/art/LogoSofuto.png"))));
		logo.add(Box.createVerticalGlue());
		logo.add(new JLabel(" "));
		
		principale.add(texte);
		principale.add(Box.createHorizontalGlue());
		principale.add(Box.createRigidArea(new Dimension(60,100)));
		principale.add(Box.createHorizontalGlue());
		principale.add(logo);
		
		this.getContentPane().add(principale);
		
		//setSize(larg,haut);
		this.pack();
		
		new Centrer(this);
		
		addMouseListener(this);
		
		this.setVisible(true);
		}

	public void mouseClicked(MouseEvent evt)
		{
		this.dispose();
		}

	public void mouseEntered(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		}

	public void mouseExited(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		}

	public void mousePressed(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		}

	public void mouseReleased(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		}
	
	/*Fin classe*/
	}

package com.alex.woot.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.alex.woot.misc.Office;
import com.alex.woot.utils.Centrer;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.UsefulMethod;



public class OfficeSelectionWindow extends JDialog implements ActionListener,WindowListener
	{
	/************
	 * Variables
	 ***********/
	private ArrayList<Office> officeList;
	private String[] listO;
	
	//Panel
	private JPanel selection;
	private JPanel global;
	
	//Controle
	private JComboBox selectionCombo;
	private JButton validate;
	
	/*****************
	 * Constructeurs
	 * @throws Exception 
	 * @throws NumberFormatException 
	 *****************/
	public OfficeSelectionWindow(ArrayList<Office> officeList) throws NumberFormatException, Exception
		{
		this.setTitle(LanguageManagement.getString("invitofficeselection"));
		this.setModal(true);//To wait for the user input
		
		this.officeList = officeList;
		
		//Controle
		validate = new JButton(LanguageManagement.getString("selectButton"));
		fillListO();
		selectionCombo = new JComboBox(listO);
		selectionCombo.setSelectedIndex(Integer.parseInt(UsefulMethod.getTargetOption("customerchoice")));
		
		//Panel
		selection = new JPanel();
		global = new JPanel();
		
		//Disposition
		selection.setLayout(new BoxLayout(selection, BoxLayout.X_AXIS));
		global.setLayout(new BoxLayout(global, BoxLayout.Y_AXIS));
		
		//Association
		selection.add(selectionCombo);
		selection.add(validate);
		global.add(selection);
		this.getContentPane().add(global);
		
		//Events
		validate.addActionListener(this);
		this.addWindowListener(this);
		
		this.pack();
		new Centrer(this);
		this.setVisible(true);
		}

	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.validate)
			{
			this.setVisible(false);
			}
		}
	
	public Office getSelectedOffice()
		{
		return officeList.get(selectionCombo.getSelectedIndex());
		
		//return listO[selectionCombo.getSelectedIndex()];
		}
	
	public void fillListO()
		{
		int a = officeList.size();
		String[] list = new String[a];
		
		for(int i=0; i<a; i++)
			{
			list[i]=officeList.get(i).getName()+" - "+officeList.get(i).getFullname();
			}
		listO = list;
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowActivated(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosed(WindowEvent e)
		{
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent e)
		{
		System.exit(0);
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeactivated(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeiconified(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowIconified(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowOpened(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}

package com.alex.woot.user.misc;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.alex.woot.gui.BaseLaunchPanel;
import com.alex.woot.gui.OptionLine;
import com.alex.woot.utils.Variables;

/**********************************
 * Used to treat a user process
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserTreatmentDeletionPanel extends BaseLaunchPanel
	{
	/**
	 * Variables
	 */
	
	
	/***************
	 * Constructor
	 ***************/
	public UserTreatmentDeletionPanel(JFrame mainFrame, String panelTitle,
			ArrayList<OptionLine> myOptionList)
		{
		super(mainFrame, panelTitle, myOptionList);
		
		}
	
	
	

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.launch)
			{
			Variables.getLogger().debug("Button launch pressed");
			
			manageSelectedBox();
			
			this.disableButton();
			
			new UserDeletion();
			}
		else if(evt.getSource() == this.cancel)
			{
			Variables.getLogger().debug("Button cancel pressed");
			this.mainFrame.getContentPane().removeAll();
			this.mainFrame.repaint();
			this.mainFrame.validate();
			}
		}
	
	
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}


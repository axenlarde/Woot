package com.alex.woot.gui;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.alex.woot.gui.BaseLaunchPanel;
import com.alex.woot.gui.OptionLine;
import com.alex.woot.office.misc.OfficeTask;
import com.alex.woot.user.misc.UserTask;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.xMLReader;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.provisioningType;

/**********************************
 * Used to treat a user process
 * 
 * @author RATEL Alexandre
 **********************************/
public class OptionPanel extends BaseLaunchPanel
	{
	/**
	 * Variables
	 */
	
	
	/***************
	 * Constructor
	 ***************/
	public OptionPanel(JFrame mainFrame, String panelTitle,
			ArrayList<OptionLine> myOptionList, actionType action, provisioningType pType)
		{
		super(mainFrame, panelTitle, myOptionList, action, pType);
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
			
			if(Variables.getAllowedItemsToProcess().size() == 0)
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("atleastoneoption"),LanguageManagement.getString("error"),JOptionPane.WARNING_MESSAGE);
				}
			else
				{
				this.disableButton();
				
				try
					{
					Variables.getLogger().info("Reading the CCM Template file : "+Variables.getCcmTemplateFileName());
					String fileContent = xMLReader.fileRead(Variables.getCcmTemplateFileName());
					
					switch(pType)
						{
						case user:new UserTask(action);break;
						case office:new OfficeTask(action, false, fileContent);break;
						}
					}
				catch(Exception exc)
					{
					Variables.getLogger().error("Error : "+exc.getMessage(), exc);
					}
				}
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


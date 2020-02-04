package com.alex.woot.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.alex.woot.office.misc.OfficeTask;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;


/**********************************
 * Used to get what to inject during a quick task
 * 
 * @author RATEL Alexandre
 **********************************/
public class OfficeQuickTaskPanel extends JPanel implements ActionListener
	{
	/**
	 * Variables
	 */
	private JPanel main, title, validate;
	private JScrollPane scrollbar;
	private JButton delete, update, inject;
	private JTextArea pattern;
	private JLabel titleLabel;
	
	/***************
	 * Constructor
	 ***************/
	public OfficeQuickTaskPanel(JFrame mainFrame, String panelTitle)
		{
		delete = new JButton(LanguageManagement.getString("deleteoffice"));
		update = new JButton(LanguageManagement.getString("updateoffice"));
		inject = new JButton(LanguageManagement.getString("injectoffice"));
		titleLabel = new JLabel(panelTitle);
		
		StringBuffer str = new StringBuffer();//Just to make an example
		str.append("<location>\r\n");
		str.append("     <action>inject</action>\r\n");
		str.append("     <name>office.name+'_LOC'</name>\r\n");
		str.append("     <audiobandwidth>office.audiobandwidth</audiobandwidth>\r\n");
		str.append("     <videobandwidth>office.videobandwidth</videobandwidth>\r\n");
		str.append("</location>\r\n");
		
		pattern = new JTextArea(str.toString());
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		main = new JPanel();
		main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
		title = new JPanel();
		title.setLayout(new BoxLayout(title,BoxLayout.X_AXIS));
		title.setPreferredSize(new Dimension(600,25));
		scrollbar = new JScrollPane(pattern);
		validate = new JPanel();
		validate.setLayout(new BoxLayout(validate,BoxLayout.X_AXIS));
		validate.setPreferredSize(new Dimension(600,25));
		
		//Assignment
		title.add(Box.createHorizontalGlue());
		title.add(titleLabel);
		title.add(Box.createHorizontalGlue());
		main.add(title);
		
		main.add(scrollbar);
		
		validate.add(Box.createHorizontalGlue());
		validate.add(delete);
		validate.add(Box.createHorizontalGlue());
		validate.add(update);
		validate.add(Box.createHorizontalGlue());
		validate.add(inject);
		validate.add(Box.createHorizontalGlue());
		main.add(validate);
		
		this.add(main);
		
		//Events
		delete.addActionListener(this);
		update.addActionListener(this);
		inject.addActionListener(this);
		}
	
	
	

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.delete)
			{
			Variables.getLogger().debug("Button delete pressed");
			new OfficeTask(actionType.delete, true, pattern.getText());
			}
		else if(evt.getSource() == this.update)
			{
			Variables.getLogger().debug("Button update pressed");
			new OfficeTask(actionType.update, true, pattern.getText());
			}
		else if(evt.getSource() == this.inject)
			{
			Variables.getLogger().debug("Button inject pressed");
			new OfficeTask(actionType.inject, true, pattern.getText());
			}
		}
	
	/*2018*//*RATEL Alexandre 8)*/
	}


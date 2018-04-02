package com.alex.woot.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.provisioningType;

/**********************************
 * Used to define the basic settings of
 * the launch panel
 * 
 * This panel is used by the user to select
 * the settings and start a task
 * 
 * @author RATEL Alexandre
 **********************************/
public abstract class BaseLaunchPanel extends JPanel implements ActionListener, MouseListener
	{
	/**
	 * Variables
	 */
	protected JPanel main, title, options, validate;
	protected JScrollPane scrollbar;
	protected ArrayList<OptionLine> myOptionList;
	protected JButton launch, cancel;
	protected JLabel titleLabel;
	protected JFrame mainFrame;
	protected JCheckBox selectAll;
	protected actionType action;
	protected provisioningType pType;
	
	/***************
	 * Constructor
	 ***************/
	public BaseLaunchPanel(JFrame mainFrame, String panelTitle, ArrayList<OptionLine> myOptionList, actionType action, provisioningType pType)
		{
		this.mainFrame = mainFrame;
		this.myOptionList = myOptionList;
		launch = new JButton(LanguageManagement.getString("submitbutton"));
		cancel = new JButton(LanguageManagement.getString("cancelbutton"));
		selectAll = new JCheckBox();
		titleLabel = new JLabel(panelTitle);
		this.action = action;
		this.pType = pType;
		
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		main = new JPanel();
		main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
		title = new JPanel();
		title.setLayout(new BoxLayout(title,BoxLayout.X_AXIS));
		title.setPreferredSize(new Dimension(600,25));
		options = new JPanel();
		options.setLayout(new BoxLayout(options,BoxLayout.Y_AXIS));
		//options.setPreferredSize(new Dimension(600,300));
		scrollbar = new JScrollPane(options);
		validate = new JPanel();
		validate.setLayout(new BoxLayout(validate,BoxLayout.X_AXIS));
		validate.setPreferredSize(new Dimension(600,25));
		
		buildOptionList();
		
		//Assignment
		title.add(Box.createHorizontalGlue());
		title.add(titleLabel);
		title.add(Box.createHorizontalGlue());
		title.add(selectAll);
		main.add(title);
		
		main.add(scrollbar);
		
		validate.add(Box.createHorizontalGlue());
		validate.add(cancel);
		validate.add(Box.createHorizontalGlue());
		validate.add(launch);
		validate.add(Box.createHorizontalGlue());
		main.add(validate);
		
		this.add(main);
		
		//Events
		launch.addActionListener(this);
		cancel.addActionListener(this);
		selectAll.addMouseListener(this);
		}
	
	@Override
	public void mouseClicked(MouseEvent evt)
		{
		if(evt.getSource() == selectAll)
			{
			for(OptionLine o : myOptionList)
				{
				o.getBobox().setSelected(selectAll.isSelected());
				}
			}
		}

	@Override
	public void mouseEntered(MouseEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	@Override
	public void mouseExited(MouseEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	@Override
	public void mousePressed(MouseEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	@Override
	public void mouseReleased(MouseEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/*****
	 * used to build the options list panel
	 * according to the allowedItemsToProcess list
	 */
	private void buildOptionList()
		{
		options.removeAll();
		for(int i=0; i<myOptionList.size(); i++)
			{
			myOptionList.get(i).setBackgroundColor((i%2==0)?Color.WHITE:Color.LIGHT_GRAY);
			myOptionList.get(i).getOptionName().setFont(new Font(myOptionList.get(i).getOptionName().getFont().getFontName(), Font.PLAIN, 15));
			this.options.add(myOptionList.get(i));
			}
		}
	
	/*****
	 * Used to fill the allowedItemsToProcess list
	 * the user choices
	 */
	protected void manageSelectedBox()
		{
		for(OptionLine o : myOptionList)
			{
			if(o.getBobox().isSelected())Variables.getAllowedItemsToProcess().add(o.getType());
			}
		
		Variables.getLogger().debug("The user choosed to process the following items : ");
		for(itemType type : Variables.getAllowedItemsToProcess())
			{
			Variables.getLogger().debug("- "+type.name());
			}
		}
	
	/*****
	 * Used to disable the button
	 */
	protected void disableButton()
		{
		this.launch.setEnabled(false);
		this.cancel.setEnabled(false);
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}


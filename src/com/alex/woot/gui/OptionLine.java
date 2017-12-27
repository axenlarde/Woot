package com.alex.woot.gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * Class used to define an option line
 * in the user window
 * 
 * @author RATEL Alexandre
 **********************************/
public class OptionLine extends JPanel implements MouseListener
	{
	/**
	 * Variables
	 */
	private itemType type;
	private JLabel optionName;
	private JCheckBox bobox;
	
	/***************
	 * Constructor
	 ***************/
	public OptionLine(itemType type)
		{
		this.type = type;
		this.optionName = new JLabel(" "+UsefulMethod.convertItemTypeToVerbose(type));
		bobox = new JCheckBox();
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		this.add(optionName);
		this.add(Box.createHorizontalGlue());
		this.add(bobox);
		
		this.addMouseListener(this);
		}

	public void changeStatus()
		{
		if(bobox.isSelected())
			{
			bobox.setSelected(false);
			}
		else
			{
			bobox.setSelected(true);
			}
		}
	
	
	
	public void setBackgroundColor(Color c)
		{
		this.setBackground(c);
		this.optionName.setBackground(c);
		this.bobox.setBackground(c);
		}
	
	public JLabel getOptionName()
		{
		return optionName;
		}

	public void setOptionName(JLabel optionName)
		{
		this.optionName = optionName;
		}

	public JCheckBox getBobox()
		{
		return bobox;
		}

	public void setBobox(JCheckBox bobox)
		{
		this.bobox = bobox;
		}

	public itemType getType()
		{
		return type;
		}

	public void setType(itemType type)
		{
		this.type = type;
		}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent arg0)
		{
		this.changeStatus();
		}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}


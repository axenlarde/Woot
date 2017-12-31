package com.alex.woot.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.statusType;

/*************************************
 * Class used to display one line in
 * the AXL status window
 *************************************/
public class StatusLine extends JPanel implements ActionListener, MouseListener, ItemListener
	{
	/************
	 * variables
	 ************/
	private ItemToInject myItem;
	private StringBuffer errorBuffer;
	
	//Contrôle
	private JCheckBox select;
	private JLabel name;
	private JLabel desc;
	private JLabel info;
	private JLabel displayResult;
	private JLabel displayError;
	private JLabel descError;
	
	/***************
	 * Constructeur
	 ***************/
	public StatusLine(ItemToInject myItem) throws Exception
		{
		this.myItem = myItem;
		updateErrorBuffer();
		
		select = new JCheckBox();
		
		if((myItem.getStatus().equals(statusType.disabled)) ||
				(myItem.getStatus().equals(statusType.error)))
			{
			select.setSelected(false);
			}
		else if((myItem.getStatus().equals(statusType.injected)) &&
				(myItem.getAction().equals(actionType.inject)))
			{
			select.setSelected(false);
			}
		else
			{
			select.setSelected(true);
			}
		
		this.name = new JLabel(myItem.getName()+" "+myItem.getType().name()+" : "+myItem.getAction().name());
		//this.desc = new JLabel(myItem.getInfo());
		this.desc = new JLabel("");
		info = new JLabel(" [..] ");
		displayResult = new JLabel("waiting");
		displayError = new JLabel("| < |");
		descError = new JLabel("");
		
		//Disposition
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		
		//Assignation
		this.add(select);
		this.add(this.name);
		this.add(info);
		this.add(this.desc);
		this.add(Box.createHorizontalGlue());
		this.add(displayError);
		this.add(displayResult);
		this.add(new JLabel(" "));
		this.add(descError);
		this.descError.setVisible(false);
		
		//Events
		displayError.addMouseListener(this);
		select.addItemListener(this);
		info.addMouseListener(this);
		}
	
	public void setFond(Color couleur)
		{
		setBackground(couleur);
		select.setBackground(couleur);
		displayError.setBackground(couleur);
		}
	
	public JCheckBox getSelect()
		{
		return this.select;
		}
	
	public boolean getCheckStatus()
		{
		return select.isSelected();
		}
	
	public void enableSelect(boolean b)
		{
		select.setEnabled(b);
		}

	public String getResult()
		{
		return displayResult.getText();
		}

	public void setResult(String result)
		{
		displayResult.setText(result);
		}

	public JLabel getDescError()
		{
		return descError;
		}

	public void setDescError(String descError)
		{
		this.descError.setText(descError);
		}

	public void setName(String name)
		{
		this.name.setText(name+" | ");
		}

	public void setDesc(String desc)
		{
		this.desc.setText(desc);
		}

	public ItemToInject getItem()
		{
		return myItem;
		}

	public void actionPerformed(ActionEvent evt)
		{
		
		}
	
	/*********
	 * Used to manage when the user choose to
	 * select or deselect the item
	 */
	public void manageSelection()
		{
		if(this.select.isSelected())
			{
			myItem.setStatus(statusType.waiting);
			}
		else
			{
			myItem.setStatus(statusType.disabled);
			}
		updateStatus();
		}
	
	/*****
	 * Called when the line has to be updated
	 */
	public void updateStatus()
		{
		displayResult.setText(LanguageManagement.getString(myItem.getStatus().name()));
		updateErrorBuffer();
		descError.setText(errorBuffer.toString());
		}
	
	public void updateErrorBuffer()
		{
		errorBuffer = new StringBuffer("");
		
		if(myItem.getErrorList().size() == 0)
			{
			errorBuffer.append(LanguageManagement.getString("noerror"));
			}
		else
			{
			for(ErrorTemplate er : myItem.getErrorList())
				{
				errorBuffer.append(er.getErrorDesc());
				errorBuffer.append("\r\n");
				}
			}
		}
	
	public void mouseClicked(MouseEvent evt)
		{
		if(evt.getSource() == this.info)
			{
			try
				{
				new DisplayInfoWindow(LanguageManagement.getString("errorlist")+" : "+errorBuffer.toString());
				}
			catch (Exception exc)
				{
				exc.printStackTrace();
				}
			}
		else if(evt.getSource() == this.displayError)
			{
			if(displayError.getText().compareTo("| < |")==0)
				{
				this.desc.setVisible(false);
				this.displayResult.setVisible(false);
				this.descError.setVisible(true);
				this.displayError.setText("| > |");
				}
			else
				{
				this.desc.setVisible(true);
				this.displayResult.setVisible(true);
				this.descError.setVisible(false);
				this.displayError.setText("| < |");
				}
			}
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

	/* (non-Javadoc)
	 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
	 */
	@Override
	public void itemStateChanged(ItemEvent evt)
		{
		if(evt.getSource() == this.select)
			{
			manageSelection();
			}
		}
	
	/*2012*//*RATEL Alexandre 8)*/
	}

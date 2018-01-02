package com.alex.woot.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.misc.MainItem;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables.statusType;

/*************************************
 * Class used to display one detail line in
 * the AXL status window
 *************************************/
public class MainStatusLine extends JPanel implements ActionListener, MouseListener, ItemListener
	{
	/************
	 * variables
	 ************/
	private int step;
	private ArrayList<StatusLine> slList;
	private MainItem myItem;
	
	//Disposition
	private JPanel top;
	private JPanel center;
	private JPanel left;
	private JPanel right;
	
	//Contrôle
	private JCheckBox select;
	private JLabel expandAll;
	private JLabel statusLabel;
	private JLabel progress;
	
	/***************
	 * Constructeur
	 ***************/
	public MainStatusLine(MainItem myItem) throws Exception
		{
		this.myItem = myItem;
		step = 0;
		slList = new ArrayList<StatusLine>();
		select = new JCheckBox("",true);
		expandAll = new JLabel(" + ");
		progress = new JLabel("   ");
		statusLabel = new JLabel(LanguageManagement.getString("waiting"));
		
		//Disposition
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		top = new JPanel();
		top.setLayout(new BoxLayout(top,BoxLayout.X_AXIS));
		center = new JPanel();
		center.setLayout(new BoxLayout(center,BoxLayout.X_AXIS));
		left = new JPanel();
		left.setLayout(new BoxLayout(left,BoxLayout.Y_AXIS));
		right = new JPanel();
		right.setLayout(new BoxLayout(right,BoxLayout.Y_AXIS));
		
		//Paramètres
		remplissage();
		
		//Assignation
		top.add(select);
		top.add(expandAll);
		top.add(new JLabel(" | "));
		top.add(new JLabel(myItem.getDescription()));
		top.add(Box.createHorizontalGlue());
		top.add(progress);
		top.add(statusLabel);
		
		for(int i=0; i<slList.size(); i++)
			{
			left.add(new JLabel("   "));
			right.add(slList.get(i));
			}
		
		center.add(left);
		center.add(right);
		this.add(top);
		this.add(center);
		
		center.setVisible(false);
		
		//Events
		select.addItemListener(this);
		expandAll.addMouseListener(this);
		}
	
	private void remplissage() throws Exception
		{
		for(ItemToInject item : this.myItem.getAssociatedItems())
			{
			slList.add(new StatusLine(item));
			}
		}
	
	public void setFond(Color couleur)
		{
		this.setBackground(couleur);
		top.setBackground(couleur);
		center.setBackground(couleur);
		left.setBackground(couleur);
		right.setBackground(couleur);
		select.setBackground(couleur);
		for(StatusLine sl : slList)
			{
			//If a correction was made we choose the orange color
			if(sl.getItem().getCorrectionList().size() == 0)
				{
				sl.setFond(couleur);
				}
			else
				{
				sl.setFond(Color.ORANGE);
				}
			}
		}
	
	public void check()
		{
		select.setSelected(((select.isSelected())?false:true));
		}
	
	public void enableSelect(boolean b)
		{
		select.setEnabled(b);
		for(StatusLine sl : slList)
			{
			sl.enableSelect(b);
			}
		}

	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.select)
			{
			selectAllItem(select.isSelected());
			}
		}

	
	public void mouseClicked(MouseEvent evt)
		{
		if(evt.getSource() == this.expandAll)
			{
			expand();
			}
		}
	
	public void expand()
		{
		if(expandAll.getText().compareTo(" - ") == 0)
			{
			center.setVisible(false);
			expandAll.setText(" + ");
			}
		else
			{
			center.setVisible(true);
			expandAll.setText(" - ");
			}
		}

	/****
	 * Used to select all items
	 */
	public void selectAllItem(boolean b)
		{
		select.setSelected(b);
		for(StatusLine sl : slList)
			{
			sl.getSelect().setSelected(b);
			}
		}
	
	/******
	 * Called to update the status
	 */
	public void updateStatus()
		{
		for(StatusLine sl : slList)
			{
			sl.updateStatus();
			}
		
		for(StatusLine sl : slList)
			{
			if(sl.getItem().getStatus().equals(statusType.error))
				{
				statusLabel.setText(LanguageManagement.getString(statusType.error.name()));
				progress.setText("   ");
				break;
				}
			else if(sl.getItem().getStatus().equals(statusType.processing))
				{
				statusLabel.setText(LanguageManagement.getString(statusType.processing.name()));
				updateProgress();
				break;
				}
			else if(sl.getItem().getStatus().equals(statusType.waiting))
				{
				statusLabel.setText(LanguageManagement.getString(statusType.waiting.name()));
				progress.setText("   ");
				break;
				}
			else
				{
				statusLabel.setText(LanguageManagement.getString("terminated"));
				progress.setText("   ");
				}
			}
		}
	
	public void updateProgress()
		{
		if(progress.getText().equals("   "))progress.setText("  .");
		else if(progress.getText().equals("  ."))progress.setText(" ..");
		else if(progress.getText().equals(" .."))progress.setText("...");
		else if(progress.getText().equals("..."))progress.setText(".. ");
		else if(progress.getText().equals(".. "))progress.setText(".  ");
		else if(progress.getText().equals(".  "))progress.setText("   ");
		}
	
	public MainItem getMyItem()
		{
		return myItem;
		}

	public void setMyItem(MainItem myItem)
		{
		this.myItem = myItem;
		}

	public JCheckBox getSelect()
		{
		return select;
		}

	public void setSelect(JCheckBox select)
		{
		this.select = select;
		}

	public JLabel getExpandAll()
		{
		return expandAll;
		}

	public void setExpandAll(JLabel expandAll)
		{
		this.expandAll = expandAll;
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
			selectAllItem(select.isSelected());
			}
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}


package com.alex.woot.gui;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JWindow;

import com.alex.woot.utils.Position;

/**
 * Class used to display AXL Request Content
 */
public class DisplayInfoWindow extends JWindow implements MouseListener
	{
	/**
	 * Variables
	 */
	private String info;
	private JPanel content;
	private JScrollPane scrollbar;
	
	
	/**
	 * Constrcteurs
	 */
	public DisplayInfoWindow(String info)
		{
		super();
		this.info = info;
		
		this.setSize(new Dimension(500, 100));
		Position.center(this);
		
		//Disposition
		content = new JPanel();
		content.add(new JLabel(info));
		scrollbar = new JScrollPane(content);
		this.getContentPane().add(scrollbar);
		
		this.setVisible(true);
		
		//Events
		this.addMouseListener(this);
		content.addMouseListener(this);
		}


	public void mouseClicked(MouseEvent arg0)
		{
		this.dispose();
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
	
	/*2012*//*RATEL Alexandre 8)*/
	}

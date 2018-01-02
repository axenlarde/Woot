
package com.alex.woot.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
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
	private ArrayList<String> infos;
	private JPanel content;
	private JScrollPane scrollbar;
	
	
	/**
	 * Constrcteurs
	 */
	public DisplayInfoWindow(ArrayList<String> infos)
		{
		super();
		this.infos = infos;
		
		//Disposition
		content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		
		for(int i=0; i<infos.size(); i++)
			{
			JPanel p = new JPanel();
			p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
			p.add(new JLabel(infos.get(i)));
			p.add(Box.createHorizontalGlue());
			p.setBackground((i%2==0)?Color.WHITE:Color.LIGHT_GRAY);
			content.add(p);
			}
		
		scrollbar = new JScrollPane(content);
		this.getContentPane().add(scrollbar);
		
		this.pack();
		Position.center(this);
		
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

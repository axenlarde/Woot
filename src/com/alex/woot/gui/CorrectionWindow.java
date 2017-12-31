/**
 * 
 */
package com.alex.woot.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.alex.woot.misc.Correction;
import com.alex.woot.utils.Position;
import com.alex.woot.utils.Position.cornerType;
import com.alex.woot.utils.LanguageManagement;


/**
 * @author "Alexandre RATEL"
 *
 * Class aims to display the auto corrected errors
 */
public class CorrectionWindow extends JFrame implements ActionListener,WindowListener
	{
	/**
	 * Variables
	 */
	private JPanel informationPanel;
	private JPanel errorDisplay;
	private JScrollPane scrollbar;
	private JPanel warningPanel;
	private JPanel submitPanel;
	
	private JLabel information;
	private JLabel warning;
	private JButton submitButton;
	
	private ArrayList<Correction> correctionList;
	
	/***************
	 * Constructor
	 ***************/
	public CorrectionWindow(ArrayList<Correction> correctionList)
		{
		super(LanguageManagement.getString("correctionwindowtitle"));
		this.correctionList = correctionList;
		
		//Declaration
		submitButton = new JButton(LanguageManagement.getString("cancelbutton"));
		submitPanel = new JPanel();
		informationPanel = new JPanel();
		warningPanel = new JPanel();
		errorDisplay = new JPanel();
		information = new JLabel(LanguageManagement.getString("justtoletyouknow"));
		warning = new JLabel();
		
		//Sizing
		this.setSize(new Dimension(600,400));
		Position.corner(this, 150, cornerType.downLeft);
		
		//Layout
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		submitPanel.setLayout(new BoxLayout(submitPanel,BoxLayout.X_AXIS));
		informationPanel.setLayout(new BoxLayout(informationPanel,BoxLayout.X_AXIS));
		warningPanel.setLayout(new BoxLayout(warningPanel,BoxLayout.X_AXIS));
		errorDisplay.setLayout(new BoxLayout(errorDisplay,BoxLayout.Y_AXIS));
		
		scrollbar = new JScrollPane(errorDisplay);
		
		//Background color
		informationPanel.setPreferredSize(new Dimension(600,25));
		informationPanel.setBackground(Color.LIGHT_GRAY);
		information.setBackground(Color.LIGHT_GRAY);
		warningPanel.setPreferredSize(new Dimension(600,25));
		warning.setText(LanguageManagement.getString("correctionwarning"));
		warningPanel.setBackground(Color.ORANGE);
		warning.setBackground(Color.ORANGE);
		submitPanel.setPreferredSize(new Dimension(600,25));
		submitPanel.setBackground(Color.LIGHT_GRAY);
		
		
		//Assignation
		//informationPanel.add(Box.createHorizontalGlue());
		informationPanel.add(information);
		informationPanel.add(Box.createHorizontalGlue());
		
		warningPanel.add(Box.createHorizontalGlue());
		warningPanel.add(warning);
		warningPanel.add(Box.createHorizontalGlue());
		
		submitPanel.add(Box.createHorizontalGlue());
		submitPanel.add(submitButton);
		submitPanel.add(Box.createHorizontalGlue());
		
		this.getContentPane().add(informationPanel);
		this.getContentPane().add(warningPanel);
		this.getContentPane().add(scrollbar);
		this.getContentPane().add(submitPanel);
		
		//Event
		submitButton.addActionListener(this);
		this.addWindowListener(this);
		
		//We check if the window need to be displayed
		if(this.correctionList.size() == 0)
			{
			this.dispose();
			}
		
		fillErrorDisplayPanel();
		
		//Manage window closing
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setVisible(true);
		}
	
	
	/**
	 * Method aims to fill the errorList Panel
	 */
	private void fillErrorDisplayPanel()
		{
		//We empty the list in case of
		errorDisplay.removeAll();
		
		for(int i=0; i<correctionList.size(); i++)
			{
			CorrectionLine line = new CorrectionLine(correctionList.get(i));
			if(correctionList.get(i).isWarning())
				{
				line.setFond(Color.RED);
				}
			else
				{
				line.setFond((i%2==0)?Color.WHITE:Color.LIGHT_GRAY);
				}
			errorDisplay.add(line);
			}
		
		/**
		 * We add this to be sure each line will keep the same high
		 * even if the error list contains only a few elements
		 */
		errorDisplay.add(Box.createVerticalGlue());
		}
	

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowActivated(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosed(WindowEvent arg0)
		{
		//We do nothing
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent arg0)
		{
		//We do nothing
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeactivated(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeiconified(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowIconified(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowOpened(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0)
		{
		this.dispose();
		}

	
	
	/*2014*//*AR 8)*/
	}

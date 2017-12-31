package com.alex.woot.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.alex.woot.user.misc.UserTreatmentCreationPanel;
import com.alex.woot.user.misc.UserTreatmentDeletionPanel;
import com.alex.woot.utils.Position;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


public class MainWindow extends JFrame implements ActionListener, WindowListener
	{
	/************
	 * Variables
	 ************/
	//Dimensions
	public Dimension dimInfo;
	
	//Menu
	public JMenuBar myMenuBar;
	public JMenu menu;
	public JMenu userProvisioning;
	public JMenuItem injectUser;
	public JMenuItem updateUser;
	public JMenuItem deleteUser;
	public JMenuItem cucmInjection;
	public JMenuItem exit;
	public JMenu tools;
	public JMenuItem option;
	public JMenuItem genCollectionFile;
	public JMenuItem genTemplateFile;
	public JMenu help;
	public JMenuItem about;
	private JLabel logo;
	private JPanel main;
	
	/***************
	 * Constructor
	 ***************/
	public MainWindow()
		{
		/*************
		 * Variables
		 *************/
		//Menu
		myMenuBar = new JMenuBar();
		menu = new JMenu(LanguageManagement.getString("mainmenutitle"));
		userProvisioning = new JMenu(LanguageManagement.getString("userinjection"));
		injectUser = new JMenuItem(LanguageManagement.getString("injectuser"));
		updateUser = new JMenuItem(LanguageManagement.getString("updateuser"));
		deleteUser = new JMenuItem(LanguageManagement.getString("deleteuser"));
		cucmInjection = new JMenuItem(LanguageManagement.getString("cucminjection"));
		exit = new JMenuItem(LanguageManagement.getString("exit"));
		tools = new JMenu(LanguageManagement.getString("tools"));
		option = new JMenuItem(LanguageManagement.getString("option"));
		genCollectionFile = new JMenuItem(LanguageManagement.getString("gencollectionfile"));
		genTemplateFile = new JMenuItem(LanguageManagement.getString("gentemplatefile"));
		help = new JMenu(LanguageManagement.getString("help"));
		about = new JMenuItem(LanguageManagement.getString("about"));
		
		//Logo & icon
		try
			{
			//Aspect.load(this, getClass().getResource("/art/IconSofuto.png").getPath(), Variables.getSoftwareName());
			//logo = new JLabel(new ImageIcon(getClass().getResource("/art/LogoSofuto.png")));
			}
		catch (Exception e)
			{
			e.printStackTrace();
			}
		
		main = new JPanel();
		main.setLayout(new BoxLayout(main,BoxLayout.X_AXIS));
		main.setBackground(Color.WHITE);
		
		//Dimensions
		dimInfo = new Dimension(this.getWidth(), 100);
		
		//Titre
		setTitle(Variables.getSoftwareName()+" - "+Variables.getSoftwareVersion());
		
		//Positionnement
		this.setSize(new Dimension(600,400));
		Position.center(this);
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		//Assignation
		myMenuBar.add(menu);
		myMenuBar.add(tools);
		myMenuBar.add(help);
		userProvisioning.add(injectUser);
		userProvisioning.add(updateUser);
		userProvisioning.add(deleteUser);
		menu.add(userProvisioning);
		menu.add(cucmInjection);
		menu.add(exit);
		tools.add(option);
		tools.add(genCollectionFile);
		tools.add(genTemplateFile);
		help.add(about);
		setJMenuBar(myMenuBar);
		
		//Logo
		this.getContentPane().setBackground(Color.WHITE);
		main.add(Box.createHorizontalGlue());
		//main.add(logo);
		main.add(Box.createHorizontalGlue());
		add(Box.createVerticalGlue());
		add(main);
		add(Box.createVerticalGlue());
		
		
		//Events
		injectUser.addActionListener(this);
		updateUser.addActionListener(this);
		deleteUser.addActionListener(this);
		cucmInjection.addActionListener(this);
		exit.addActionListener(this);
		option.addActionListener(this);
		genCollectionFile.addActionListener(this);
		genTemplateFile.addActionListener(this);
		help.addActionListener(this);
		about.addActionListener(this);
		
		this.addWindowListener(this);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//setResizable(false);
		setVisible(true);
		
		Variables.setMyWindow(this);
		Variables.getLogger().info("Main window started");
		}

	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.injectUser)
			{
			Variables.getLogger().info("User injection button pressed");
			
			Variables.setAllowedItemsToProcess(new ArrayList<itemType>());
			ArrayList<OptionLine> myOptionList = new ArrayList<OptionLine>();
			myOptionList.add(new OptionLine(itemType.phone));
			myOptionList.add(new OptionLine(itemType.udp));
			myOptionList.add(new OptionLine(itemType.user));
			myOptionList.add(new OptionLine(itemType.udplogin));
			myOptionList.add(new OptionLine(itemType.callpickupgroup));
			myOptionList.add(new OptionLine(itemType.linegroup));
			myOptionList.add(new OptionLine(itemType.analog));
			
			this.getContentPane().removeAll();
			this.getContentPane().add(new UserTreatmentCreationPanel(this, LanguageManagement.getString("injectiontitle"), myOptionList));
			this.repaint();
			this.validate();
			}
		if(evt.getSource() == this.deleteUser)
			{
			Variables.getLogger().info("User deletion button pressed");
			Variables.setAllowedItemsToProcess(new ArrayList<itemType>());
			ArrayList<OptionLine> myOptionList = new ArrayList<OptionLine>();
			myOptionList.add(new OptionLine(itemType.phone));
			myOptionList.add(new OptionLine(itemType.udp));
			myOptionList.add(new OptionLine(itemType.user));
			myOptionList.add(new OptionLine(itemType.udplogin));
			myOptionList.add(new OptionLine(itemType.callpickupgroup));
			myOptionList.add(new OptionLine(itemType.linegroup));
			myOptionList.add(new OptionLine(itemType.analog));
			
			this.getContentPane().removeAll();
			this.getContentPane().add(new UserTreatmentDeletionPanel(this, LanguageManagement.getString("deletiontitle"), myOptionList));
			this.repaint();
			this.validate();
			}
		if(evt.getSource() == this.exit)
			{
			this.dispose();
			}
		if(evt.getSource() == this.about)
			{
			Variables.getLogger().info("About button pressed");
			new WindowApropos(LanguageManagement.getString("about")+Variables.getSoftwareName(),
					LanguageManagement.getString("softwarename")+Variables.getSoftwareName(),
					LanguageManagement.getString("softwareversion")+Variables.getSoftwareVersion(),
					LanguageManagement.getString("author")+"Alexandre RATEL",
					LanguageManagement.getString("contact")+"alexandre.ratel@gmail.com");
			}
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
		Variables.getLogger().info("The user exit the application willfully");
		System.exit(0);
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent arg0)
		{
		// TODO Auto-generated method stub
		
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
	
	/*2012*//*RATEL Alexandre 8)*/
	}

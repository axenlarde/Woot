
package com.alex.woot.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.peer.WindowPeer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.alex.woot.misc.databaseAccess;
import com.alex.woot.utils.Position;


/***********
 * Class used to 
 */
public class getAXLConData extends JDialog implements ActionListener, WindowListener
	{
	/************
	 * Variables
	 ***********/
	private String port; //"8443"
    private String host; //"localhost"
    private String unitHost; //"localhost"
    private String username; //null
    private String password; //null
	
    //Controle
    JTextField textPort;
    JTextField textHost;
    JTextField textUnityHost;
    JTextField textUsername;
    JPasswordField textPassword;
    JButton valider;
    
    //Panel
    JPanel centralPane;
    
    
	/***************
	 * Constructeur
	 ***************/
	public getAXLConData(JFrame myFenetre)
		{
		/*************
		 * Variables
		 *************/
		super(myFenetre,"Données de connexion aux serveurs",true);
		textPort = new JTextField();
		textHost = new JTextField();
		textUnityHost = new JTextField();
		textUsername = new JTextField();
		textPassword = new JPasswordField();
		valider = new JButton("Valider");
		
		//Positionnement
		this.setSize(new Dimension(400,175));
		new Position(this);
		
		centralPane = new JPanel();
		centralPane.setLayout(new GridLayout(5, 2));
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		//Assignation
		centralPane.add(new JLabel(" IP CUCM : "));
		centralPane.add(textHost);
		centralPane.add(new JLabel(" IP CUC : "));
		centralPane.add(textUnityHost);
		centralPane.add(new JLabel(" Port de connexion : "));
		centralPane.add(textPort);
		centralPane.add(new JLabel(" Utilisateur : "));
		centralPane.add(textUsername);
		centralPane.add(new JLabel(" Mot de passe : "));
		centralPane.add(textPassword);
		this.add(centralPane);
		this.add(valider);
		
		//Events
		valider.addActionListener(this);
		this.addWindowListener(this);
		
		getData();
		
		this.setResizable(false);
		this.setVisible(true);
		}

	private void getData()
		{
		if(variable.getTargetOption("database").compareTo("dat")==0)
			{
			if(databaseAccess.getCustomerConPref() != null)
				{
				textHost.setText(databaseAccess.getCustomerConPref().get(0)[0][1]);
				textUnityHost.setText(databaseAccess.getCustomerConPref().get(0)[1][1]);
				textPort.setText(databaseAccess.getCustomerConPref().get(0)[2][1]);
				textUsername.setText(databaseAccess.getCustomerConPref().get(0)[3][1]);
				textPassword.setText(databaseAccess.getCustomerConPref().get(0)[4][1]);
				}
			else
				{
				textHost.setText(utils.variable.getTargetOption("SOAPHost"));
				textUnityHost.setText(utils.variable.getTargetOption("SOAPUnityHost"));
				textPort.setText(utils.variable.getTargetOption("SOAPPort"));
				textUsername.setText(utils.variable.getTargetOption("SOAPUsername"));
				textPassword.setText(utils.variable.getTargetOption("SOAPPassword"));
				}
			}
		else
			{
			textHost.setText(utils.variable.getTargetOption("SOAPHost"));
			textUnityHost.setText(utils.variable.getTargetOption("SOAPUnityHost"));
			textPort.setText(utils.variable.getTargetOption("SOAPPort"));
			textUsername.setText(utils.variable.getTargetOption("SOAPUsername"));
			textPassword.setText(utils.variable.getTargetOption("SOAPPassword"));
			}
		}

	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == valider)
			{
			System.out.println("Appuie sur le bouton valider");
			launch();
			}
		}
	
	public void launch()
		{
		//On récupère les variables
		utils.variable.setHost(textHost.getText());
		utils.variable.setUnityHost(textUnityHost.getText());
		utils.variable.setPort(textPort.getText());
		utils.variable.setUsername(textUsername.getText());
		utils.variable.setPassword(textPassword.getText());
		
		//Puis on les insrits dans le fichier prefUser
		utils.variable.setTargetOption("SOAPHost", textHost.getText());
		utils.variable.setTargetOption("SOAPUnityHost", textUnityHost.getText());
		utils.variable.setTargetOption("SOAPPort", textPort.getText());
		utils.variable.setTargetOption("SOAPUsername", textUsername.getText());
		utils.variable.setTargetOption("SOAPPassword", textPassword.getText());
		
		//On ferme enfin la fenêtre de dialogue
		this.dispose();
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowActivated(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosed(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent e)
		{
		System.exit(0);
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeactivated(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeiconified(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowIconified(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}

	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowOpened(WindowEvent e)
		{
		// TODO Auto-generated method stub
		
		}
	
	/*2012*//*RATEL Alexandre 8)*/
	}

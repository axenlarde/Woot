/**
 * 
 */
package com.alex.woot.gui;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.alex.woot.misc.Correction;
import com.alex.woot.utils.LanguageManagement;

/**
 * @author "Alexandre RATEL"
 *
 * Class used to display one line in the error window
 */
public class CorrectionLine extends JPanel
	{
	/**
	 * Variables
	 */
	private JPanel descriptionPanel;
	private JLabel warning;
	private JLabel errorLine;
	private JLabel errorDesc;
	private JLabel advice;
	private Correction correction;
	
	/**
	 * Constructor
	 */
	public CorrectionLine(Correction correction)
		{
		super();
		this.correction = correction;
		
		descriptionPanel = new JPanel();
		
		warning = new JLabel("");
		if(this.correction.isWarning())warning.setText(LanguageManagement.getString("correctionalert")+" : ");
		errorLine = new JLabel(LanguageManagement.getString("correctionline")+" "+this.correction.getLine());
		errorDesc = new JLabel(" : "+this.correction.getType().toString()+" : "+this.correction.getDescription());
		advice = new JLabel(" "+this.correction.getAdvice());
		
		//Layout
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		descriptionPanel.setLayout(new BoxLayout(descriptionPanel,BoxLayout.X_AXIS));
		
		//Disposition
		descriptionPanel.add(warning);
		descriptionPanel.add(errorLine);
		descriptionPanel.add(errorDesc);
		descriptionPanel.add(advice);
		descriptionPanel.add(Box.createHorizontalGlue());
		
		this.add(descriptionPanel);
		}
	
	
	public void setFond(Color couleur)
		{
		this.setBackground(couleur);
		descriptionPanel.setBackground(couleur);
		errorLine.setBackground(couleur);
		errorDesc.setBackground(couleur);
		advice.setBackground(couleur);
		}


	public JLabel getAdvice()
		{
		return advice;
		}

	
	
	

	
	/*2014*//*AR 8)*/
	}

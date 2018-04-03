
package com.alex.woot.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import com.alex.woot.misc.Task;
import com.alex.woot.soap.misc.MainItem;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;

/*********************************************
 * Class used to display AXL insertion status
 *********************************************/
public class StatusWindow extends JPanel implements ActionListener, AncestorListener
	{
	/************
	 * Variables
	 ************/
	private ArrayList<MainItem> itemList;
	private ArrayList<MainStatusLine> lineList;
	private int step;
	private int totalItem;
	private Task myTask;
	
	//Contr�les
	private JLabel taskType;
	private JLabel Info;
	private JProgressBar progress;
	private JButton pause;
	private JLabel progressLabel;
	private JLabel progressStatus;
	private JCheckBox selectAll;
	private JCheckBox expandAll;
	private JLabel launchPopup;
	
	//Disposition
	private JPanel listRequest;
	private JScrollPane scrollbar;
	private JPanel InfoAndProgress;
	private JPanel controlProgress;
	private JPanel Principale;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public StatusWindow(ArrayList<MainItem> itemList, Task myTask) throws Exception
		{
		/****
		 * Variables
		 */
		this.itemList = itemList;
		this.myTask = myTask;
		step = 0;
		lineList = new ArrayList<MainStatusLine>();
		totalItem = myTask.getTodoList().size();
		
		buildWindow();
		}
	
	private void buildWindow() throws Exception
		{
		//Controles
		taskType = new JLabel(LanguageManagement.getString("tasktype")+" : "+myTask.getTodoList().get(0).getAction().toString());
		Info = new JLabel(" 0/0");
		progress = new JProgressBar(0,totalItem);
		pause = new JButton(LanguageManagement.getString("play"));
		progressLabel = new JLabel("./.");
		progressStatus = new JLabel(" ");
		launchPopup = new JLabel(">   ");
		selectAll = new JCheckBox(LanguageManagement.getString("selectall"),true);
		expandAll = new JCheckBox(LanguageManagement.getString("expandall"),true);
		expandAll.setSelected(false);
		
		//Disposition
		this.setSize(new Dimension(600,400));
		this.setBounds(this.getX()+300, this.getY()-50, this.getWidth(), this.getHeight());
		InfoAndProgress = new JPanel();
		controlProgress = new JPanel();
		Principale = new JPanel();
		InfoAndProgress.setPreferredSize(new Dimension(600,25));
		if(myTask.getTodoList().get(0).getAction().equals(actionType.delete))
			{
			InfoAndProgress.setBackground(Color.RED);
			}
		else
			{
			InfoAndProgress.setBackground(Color.LIGHT_GRAY);
			}
		controlProgress.setPreferredSize(new Dimension(600,25));
		controlProgress.setBackground(Color.GRAY);
		pause.setBackground(Color.GRAY);
		pause.setForeground(Color.RED);
		selectAll.setBackground(Color.GRAY);
		expandAll.setBackground(Color.GRAY);
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		InfoAndProgress.setLayout(new BoxLayout(InfoAndProgress,BoxLayout.X_AXIS));
		controlProgress.setLayout(new BoxLayout(controlProgress,BoxLayout.X_AXIS));
		Principale.setLayout(new BoxLayout(Principale,BoxLayout.Y_AXIS));
		listRequest = new JPanel();
		listRequest.setLayout(new BoxLayout(listRequest,BoxLayout.Y_AXIS));
		scrollbar = new JScrollPane(listRequest);
		
		//Assignation
		InfoAndProgress.add(Box.createHorizontalGlue());
		InfoAndProgress.add(taskType);
		InfoAndProgress.add(Box.createHorizontalGlue());
		InfoAndProgress.add(new JLabel("Info : "));
		InfoAndProgress.add(Box.createHorizontalGlue());
		InfoAndProgress.add(progress);
		InfoAndProgress.add(Info);
		InfoAndProgress.add(Box.createHorizontalGlue());
		InfoAndProgress.add(progressLabel);
		InfoAndProgress.add(Box.createHorizontalGlue());
		InfoAndProgress.add(progressStatus);
		controlProgress.add(selectAll);
		controlProgress.add(expandAll);
		controlProgress.add(Box.createHorizontalGlue());
		controlProgress.add(launchPopup);
		controlProgress.add(pause);
		Principale.add(scrollbar);
		this.add(InfoAndProgress);
		this.add(controlProgress);
		this.add(Principale);
		
		remplissage();
		
		//Events
		pause.addActionListener(this);
		selectAll.addActionListener(this);
		expandAll.addActionListener(this);
		this.addAncestorListener(this);
		}
	
	/***********************************************
	 * Methode qui remplie le centre de la fenetre
	 * avec une ligne pour chaque device
	 * @throws Exception 
	 ***********************************************/
	
	private void remplissage() throws Exception
		{
		listRequest.removeAll();
		for(int i=0; i<itemList.size(); i++)
			{
			MainStatusLine msl = new MainStatusLine(itemList.get(i));
			msl.setFond((i%2==0)?Color.WHITE:Color.LIGHT_GRAY);
			lineList.add(msl);
			listRequest.add(msl);
			}
		this.repaint();
		this.validate();
		}

	public void actionPerformed(ActionEvent evt)
		{
		if(evt.getSource() == this.pause)
			{
			pause.setForeground(Color.BLACK);
			if(!myTask.isPause())
				{
				myTask.setPause(true);
				pause.setText(LanguageManagement.getString("play"));
				enableSelect(true);
				}
			else
				{
				myTask.setPause(false);
				pause.setText(LanguageManagement.getString("pause"));
				enableSelect(false);
				}
			}
		
		if(evt.getSource() == this.selectAll)
			{
			for(MainStatusLine msl : lineList)
				{
				msl.getSelect().setSelected(selectAll.isSelected());
				}
			}
		
		if(evt.getSource() == this.expandAll)
			{
			for(MainStatusLine msl : lineList)
				{
				msl.expand();
				}
			}
		}

	public void updateProgress(int count)
		{
		Info.setText(" "+count+"/"+totalItem);
		progress.setValue(count);
		
		for(MainStatusLine msl : lineList)
			{
			msl.updateStatus();
			}
		
		if(!myTask.isAlive())
			{
			progressStatus.setText(LanguageManagement.getString("terminated"));
			}
		else
			{
			progressStatus.setText(LanguageManagement.getString("waiting"));
			}
		
		switch(step)
			{
			case 0:
				if(myTask.isPause())
					{
					launchPopup.setText(">   ");
					}
				else
					{
					launchPopup.setText("    ");
					}
				progressLabel.setText("./.");
				step = 1;
				break;
				
			case 1:
				if(myTask.isPause())
					{
					launchPopup.setText(" >  ");
					}
				else
					{
					launchPopup.setText("    ");
					}
				progressLabel.setText(".|.");
				step = 2;
				break;
				
			case 2:
				if(myTask.isPause())
					{
					launchPopup.setText("  > ");
					}
				else
					{
					launchPopup.setText("    ");
					}
				progressLabel.setText(".\\.");
				step = 3;
				break;
				
			case 3:
				if(myTask.isPause())
					{
					launchPopup.setText("   >");
					}
				else
					{
					launchPopup.setText("    ");
					}
				progressLabel.setText(".|.");
				step = 0;
				break;
			}
		}
	
	/*****
	 * Used to freeze everything needed to prevent
	 * the user to start the task again
	 */
	public void freeze()
		{
		pause.setEnabled(false);
		}
	
	public void enableSelect(boolean b)
		{
		selectAll.setEnabled(b);
		for(MainStatusLine msl : lineList)
			{
			msl.enableSelect(b);
			}
		}

	/* (non-Javadoc)
	 * @see javax.swing.event.AncestorListener#ancestorAdded(javax.swing.event.AncestorEvent)
	 */
	@Override
	public void ancestorAdded(AncestorEvent arg0)
		{
		
		}

	/* (non-Javadoc)
	 * @see javax.swing.event.AncestorListener#ancestorMoved(javax.swing.event.AncestorEvent)
	 */
	@Override
	public void ancestorMoved(AncestorEvent arg0)
		{
		
		}

	/* (non-Javadoc)
	 * @see javax.swing.event.AncestorListener#ancestorRemoved(javax.swing.event.AncestorEvent)
	 */
	@Override
	public void ancestorRemoved(AncestorEvent arg0)
		{
		Variables.getLogger().debug("The user exit the statut panel so we clean the current task");
		//We stop the current task
		if((myTask != null) && (myTask.isAlive()))
			{
			myTask.setStop(true);
			myTask.setPause(false);
			}
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}

package com.alex.woot.gui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Pattern;

import javax.swing.JPanel;

import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.Task;
import com.alex.woot.utils.Variables;


/****************************************************
 * Classe qui gère la mise à jour de la fenêtre pour
 * afficher graphiquement l'état d'avancement
 ****************************************************/
public class ProgressUpdater extends Thread
	{
	/************
	 * Variables
	 ************/
	private boolean done;
	private float progress;
	private int count;
	private StatusWindow sw;
	private Task myTask;
	
	//To display the elapsed time
	private long startTime;
	private long elapsedTime;
	private Date myDate;
	private SimpleDateFormat timeFormat;
	
	/***************
	 * Constructeur
	 ***************/
	public ProgressUpdater(StatusWindow sw, Task myTask)
		{
		this.sw = sw;
		this.myTask = myTask;
		count = 0;
		done = true;
		
		//On récupère l'heure de début de l'injection
		startTime = System.currentTimeMillis();
		timeFormat = new SimpleDateFormat("mm:ss:SSS");
		timeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		myDate = new Date();
		myDate.setTime(startTime);
		
		start();
		}
	
	public void run()
		{
		while(done)
			{
			if((!myTask.isStarted()) || (myTask.isAlive()))
				{
				sw.updateProgress(myTask.getProgress());
				}
			else
				{
				//The last update
				sw.updateProgress(myTask.getProgress());
				sw.freeze();//Freeze the user interface
				Variables.getLogger().debug("End of the ProgressUpdater thread");
				elapsedTime = System.currentTimeMillis() - startTime;
				myDate.setTime(elapsedTime);
				Variables.getLogger().debug("Total processing time : "+timeFormat.format(myDate));
				break;
				}
			
			try
				{
				sleep(200);
				}
			catch(Exception e)
				{
				Variables.getLogger().error(e.getMessage(), e);
				}
			}
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}

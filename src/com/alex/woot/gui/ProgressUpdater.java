package com.alex.woot.gui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.Task;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.statusType;


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
		done = true;
		
		startTime = 0;
		timeFormat = new SimpleDateFormat("mm:ss:SSS");
		timeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		myDate = new Date();
		
		start();
		}
	
	public void run()
		{
		while(done)
			{
			if((!myTask.isStarted()) || (myTask.isAlive()))
				{
				if((!myTask.isPause())&&(startTime == 0))
					{
					startTime = System.currentTimeMillis();
					myDate.setTime(startTime);
					}
				
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
				
				/**
				 * We display the task infos
				 */
				if(myTask.getProgress() != 0)
					{
					ArrayList<String> infos = new ArrayList<String>();
					infos.add(LanguageManagement.getString("tasksummary")+" :");
					infos.add(LanguageManagement.getString("tasktype")+" : "+myTask.getTodoList().get(0).getAction());
					infos.add(LanguageManagement.getString("totalitem")+" : "+myTask.getTodoList().size());
					
					//We gather the required informations
					int disabledItem = 0;
					int errorItem = 0;
					for(ItemToInject iti : myTask.getTodoList())
						{
						if(iti.getStatus().equals(statusType.disabled))disabledItem++;
						if(iti.getStatus().equals(statusType.error))errorItem++;
						}
					
					infos.add(LanguageManagement.getString("disableditem")+" : "+disabledItem);
					infos.add(LanguageManagement.getString("erroritem")+" : "+errorItem);
					infos.add(LanguageManagement.getString("elapsedtime")+" : "+timeFormat.format(myDate));
					
					new DisplayInfoWindow(infos);
					}
				
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

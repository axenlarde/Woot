package com.alex.woot.misc;

import java.util.ArrayList;

import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.statusType;

/**********************************
 * Class used to store a list of todo
 * 
 * It also allowed to launch the task
 * 
 * @author RATEL Alexandre
 **********************************/
public class Task extends Thread
	{
	/**
	 * Variables
	 */
	private ArrayList<ItemToInject> todoList;
	private statusType status;
	private boolean pause, stop, started, end;
	private int progress;
	
	/***************
	 * Constructor
	 ***************/
	public Task(ArrayList<ItemToInject> todoList)
		{
		this.todoList = todoList;
		this.status = statusType.init;
		stop = false;
		pause = true;
		started = false;
		end = false;
		progress = 0;
		}
	
	/******
	 * Used to start the build process
	 */
	public void startBuildProcess()
		{
		try
			{
			//Build
			Variables.getLogger().info("Beginning of the build process");
			for(ItemToInject myToDo : todoList)
				{
				myToDo.build();
				
				if(myToDo.getErrorList().size() != 0)
					{
					//Something happened during the building process so we disable the item
					Variables.getLogger().info("The following item has been disabled because some errors occurs during its preparation process : "+myToDo.getType().name()+" "+myToDo.getName());
					for(ErrorTemplate e : myToDo.getErrorList())
						{
						Variables.getLogger().debug("- "+e.getTargetName()+" "+e.getIssueName()+" "+e.getErrorDesc()+" "+e.getError().name()+" "+e.getIssueType().name());
						}
					myToDo.setStatus(statusType.disabled);
					}
				}
			Variables.getLogger().info("End of the build process");
			}
		catch (Exception e)
			{
			Variables.getLogger().debug("ERROR in the build process : "+e.getMessage(),e);
			}
		}
	
	public void run()
		{
		started = true;
		try
			{
			Variables.getLogger().info("Task begins");
			
			//Execution
			for(ItemToInject myToDo : todoList)
				{
				while(pause)
					{
					this.sleep(200);
					}
				
				if(!stop)
					{
					try
						{
						if(myToDo.getStatus().equals(statusType.disabled))
							{
							Variables.getLogger().debug("The item \""+myToDo.getName()+"\" has been disabled so we do not process it");
							}
						else if(myToDo.getAction().equals(actionType.inject))
							{
							if(myToDo.getStatus().equals(statusType.waiting))
								{							
								myToDo.inject();
								}
							else
								{
								Variables.getLogger().debug("The status of the item \""+myToDo.getName()+"\" is different than waiting (Current status \""+myToDo.getStatus().name()+"\" so we do not inject it)");
								myToDo.setStatus(statusType.disabled);
								}
							}
						else if(myToDo.getAction().equals(actionType.delete))
							{
							if(myToDo.getStatus().equals(statusType.waiting))
								{
								myToDo.delete();
								}
							else
								{
								Variables.getLogger().debug("The status of the item \""+myToDo.getName()+"\" is different than waiting (Current status \""+myToDo.getStatus().name()+"\" so we do not delete it)");
								myToDo.setStatus(statusType.disabled);
								}
							}
						else if(myToDo.getAction().equals(actionType.update))
							{
							if(myToDo.isExisting())
								{
								myToDo.update();
								}
							else
								{
								Variables.getLogger().debug("The status of the item \""+myToDo.getName()+"\" is different than injected (Current status \""+myToDo.getStatus().name()+"\" so we do not update it)");
								myToDo.setStatus(statusType.disabled);
								}
							}
						else
							{
							Variables.getLogger().debug("The following item has not been processed because of its status \""+myToDo.getStatus().name()+"\" : "+myToDo.getName());
							}
						}
					catch (Exception e)
						{
						Variables.getLogger().error("An error occured with the item \""+myToDo.getName()+"\" : "+e.getMessage(), e);
						myToDo.setStatus(statusType.error);
						}
					}
				else
					{
					Variables.getLogger().debug("The Administrator asked to stop the process");
					break;
					}
				progress++;
				}
			end = true;
			Variables.getLogger().info("Task ends");
			Variables.setUuidList(new ArrayList<storedUUID>());//We clean the UUID list
			Variables.getLogger().info("UUID list cleared");
			Variables.getMyWorkbook().close();
			Variables.setMyWorkbook(null);//We reset the workbook
			Variables.getLogger().info("Workbook closed");
			}
		catch (Exception e)
			{
			Variables.getLogger().debug("ERROR : "+e.getMessage(),e);
			}
		}

	public ArrayList<ItemToInject> getTodoList()
		{
		return todoList;
		}

	public void setTodoList(ArrayList<ItemToInject> todoList)
		{
		this.todoList = todoList;
		}

	public statusType getStatus()
		{
		return status;
		}

	public void setStatus(statusType status)
		{
		this.status = status;
		}

	public void Stop()
		{
		this.stop = true;
		}

	public boolean isPause()
		{
		return pause;
		}

	public void setPause(boolean pause)
		{
		this.pause = pause;
		
		if(this.pause)
			{
			Variables.getLogger().debug("The user asked to pause the task");
			}
		else
			{
			Variables.getLogger().debug("The user asked to resume the task");
			}
		}

	public boolean isStop()
		{
		return stop;
		}

	public void setStop(boolean stop)
		{
		this.stop = stop;
		}

	public int getProgress()
		{
		return progress;
		}

	public boolean isStarted()
		{
		return started;
		}

	public boolean isEnd()
		{
		return end;
		}

	public void setEnd(boolean end)
		{
		this.end = end;
		}
	
	
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}


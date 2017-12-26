
package com.alex.woot.gui;

import utils.variable;

/**
 * 
 */
public class pwwNotifyer extends Thread
	{
	/**
	 * Variables
	 */
	private prepareWaitingWindow pww;
	private boolean done;
	
	/**
	 * Constructeurs
	 */
	public pwwNotifyer(prepareWaitingWindow pww)
		{
		done = true;
		this.pww = pww;
		start();
		}
	
	public void run()
		{
		try
			{
			while(done)
				{
				if(variable.getSarl().size() != 0)
					{
					pww.setAvancement(variable.getSarl().get(variable.getSarl().size()-1).getAxlRequestName()+" : "+variable.getSarl().get(variable.getSarl().size()-1).getAxlRequestDesc());
					pww.setSarlSize(variable.getSarl().size());
					}
				this.sleep(100);
				}
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			System.out.println(exc.getMessage());
			}
		}
	
	public void shutdown()
		{
		done = false;
		}
	
	/*2012*//*RATEL Alexandre 8)*/
	}

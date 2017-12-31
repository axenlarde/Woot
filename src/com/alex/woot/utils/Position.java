package com.alex.woot.utils;

//Imports
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.JDialog;

/**
 * Static method to define the window position easily
 * 
 * @author Alexandre
 */
public class Position 
	{
	/********
	/* Variables
	*********/
	public enum cornerType
		{
		upRight,
		downRight,
		upLeft,
		downLeft
		};
	
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	private static Dimension dimEcran = tk.getScreenSize();
	private static int centerX = (dimEcran.width)/2;
	private static int centerY = (dimEcran.height)/2;
	
	public static void center(JFrame myFrame)
		{
		int newX = centerX - myFrame.getSize().width/2;
		int newY = centerY - myFrame.getSize().height/2;
		myFrame.setBounds(newX, newY, myFrame.getSize().width, myFrame.getSize().height);
		}
	
	public static void center(JDialog myFrame)
		{
		int newX = centerX - myFrame.getSize().width/2;
		int newY = centerY - myFrame.getSize().height/2;
		myFrame.setBounds(newX, newY, myFrame.getSize().width, myFrame.getSize().height);
		}
	
	public static void center(JWindow myFrame)
		{
		int newX = centerX - myFrame.getSize().width/2;
		int newY = centerY - myFrame.getSize().height/2;
		myFrame.setBounds(newX, newY, myFrame.getSize().width, myFrame.getSize().height);
		}
	
	public static void upper(JFrame myFrame, int value)
		{
		center(myFrame);
		myFrame.setBounds(myFrame.getX(), myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
		}
	
	public static void upper(JDialog myFrame, int value)
		{
		center(myFrame);
		myFrame.setBounds(myFrame.getX(), myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
		}
	
	public static void upper(JWindow myFrame, int value)
		{
		center(myFrame);
		myFrame.setBounds(myFrame.getX(), myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
		}
	
	public static void lower(JFrame myFrame, int value)
		{
		center(myFrame);
		myFrame.setBounds(myFrame.getX(), myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
		}
	
	public static void lower(JDialog myFrame, int value)
		{
		center(myFrame);
		myFrame.setBounds(myFrame.getX(), myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
		}
	
	public static void lower(JWindow myFrame, int value)
		{
		center(myFrame);
		myFrame.setBounds(myFrame.getX(), myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
		}
	
	public static void corner(JFrame myFrame, int value, cornerType type)
		{
		center(myFrame);
		switch(type)
			{
			case downLeft:
				myFrame.setBounds(myFrame.getX()-value, myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case downRight:
				myFrame.setBounds(myFrame.getX()+value, myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case upLeft:
				myFrame.setBounds(myFrame.getX()-value, myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case upRight:
				myFrame.setBounds(myFrame.getX()+value, myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
				break;
			}
		}
	
	public static void corner(JDialog myFrame, int value, cornerType type)
		{
		center(myFrame);
		switch(type)
			{
			case downLeft:
				myFrame.setBounds(myFrame.getX()-value, myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case downRight:
				myFrame.setBounds(myFrame.getX()+value, myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case upLeft:
				myFrame.setBounds(myFrame.getX()-value, myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case upRight:
				myFrame.setBounds(myFrame.getX()+value, myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
				break;
			}
		}
	
	public static void corner(JWindow myFrame, int value, cornerType type)
		{
		center(myFrame);
		switch(type)
			{
			case downLeft:
				myFrame.setBounds(myFrame.getX()-value, myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case downRight:
				myFrame.setBounds(myFrame.getX()+value, myFrame.getY()+value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case upLeft:
				myFrame.setBounds(myFrame.getX()-value, myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
				break;
			case upRight:
				myFrame.setBounds(myFrame.getX()+value, myFrame.getY()-value, myFrame.getWidth(), myFrame.getHeight());
				break;
			}
		}
	
	/*2017*//*8)*/
	}

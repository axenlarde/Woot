
package com.alex.woot.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*********************************************
 * Class used to send eMail
 *********************************************/
public class eMailSender
	{
	/**
	 * Variables
	 */
	private String port, protocol, server, user, password;
	
	/**
	 * Constructeur
	 */
	public eMailSender(String port, String protocol, String server, String user, String password)
		{
		this.port = port;
		this.protocol = protocol;
		this.server = server;
		this.user = user;
		this.password = password;
		}
	
	/**
	 * Method used to send an eMail
	 */
	public void send(String sendTo, String subject, String content, String eMailDesc) throws Exception
		{
		try
			{
			// Get system properties
			Properties props = System.getProperties();
			String proto = new String("");
			
			if (protocol.compareTo("TLS")==0)
	        	{
	        	proto = "smtps";
	        	}
			else
				{
				proto = "smtp";
				}
			
			// Setup mail server
			props.put("mail.transport.protocol", proto);
	        props.put("mail."+proto+".host", server);
	        props.put("mail."+proto+".port", port);
	        
	        if((password != null) && (!password.equals("")))
	        	{
	        	props.put("mail."+proto+".auth", "true");
	        	}
	        else
	        	{
	        	props.put("mail."+proto+".auth", "false");
	        	}
			
			// Get session
			Session session = Session.getDefaultInstance(props, null);
			session.setDebug(false);
			
			//Get Transport Object
			Transport transport = session.getTransport();
			
			// Define message
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendTo));
			message.setSubject(subject,"utf-8");
			message.setText(content+"\r\n\r\nEmail sent with "+Variables.getSoftwareName()+" "+Variables.getSoftwareVersion(),"utf-8");
			
			//Connection
			transport.connect(server, Integer.parseInt(port), user, password);
			
			//Send message
			transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
			transport.close();
			Variables.getLogger().info("Email sent ! Subject : "+subject+" To : "+sendTo+ " Type : "+eMailDesc+" Content : "+content);
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc);
			
			throw new Exception("Error while sending the email : "+exc.getMessage());
			}
		}

	
	/**
	 * Getters and Setters
	 */
	
	public String getPort()
		{
		return port;
		}

	public void setPort(String port)
		{
		this.port = port;
		}

	public String getProtocol()
		{
		return protocol;
		}

	public void setProtocol(String protocol)
		{
		this.protocol = protocol;
		}

	public String getServer()
		{
		return server;
		}

	public void setServer(String server)
		{
		this.server = server;
		}

	public String getUser()
		{
		return user;
		}

	public void setUser(String user)
		{
		this.user = user;
		}

	public String getPassword()
		{
		return password;
		}

	public void setPassword(String password)
		{
		this.password = password;
		}
	
	/*****
	 * End of getters and Setters 
	 */
	
	
	
	
	
	
	
	
	
	
	
	/*2013*//*RATEL Alexandre 8)*/
	}

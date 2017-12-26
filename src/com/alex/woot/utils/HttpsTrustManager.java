package com.alex.woot.utils;
//Imports
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;




/************************************************************
 * This class is used to generate a new certificate manager.
 * This way it is possible to sign itself certificate
 ***********************************************************/

public class HttpsTrustManager implements X509TrustManager
	{
	/*************
	 * Variables
	 *************/
	
	
	/***************
	 * Constructeur
	 ***************/
	public HttpsTrustManager()
		{
		
		}

	public void checkClientTrusted(X509Certificate chain[], String authType) throws CertificateException {}
    public void checkServerTrusted(X509Certificate chain[], String authType) throws CertificateException {}
    public X509Certificate[] getAcceptedIssuers()
    	{
        return null;
    	}
	
	/*2012*//*RATEL Alexandre 8)*/
	}

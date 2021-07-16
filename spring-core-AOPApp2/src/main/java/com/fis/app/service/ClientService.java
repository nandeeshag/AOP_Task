package com.fis.app.service;


import org.springframework.stereotype.Component;

import com.fis.app.util.LoggingClass;
import com.fis.app.util.SecurityClass;

@Component
public class ClientService {

	public void doSearchMovie()
	{
		
		System.out.println(" searching movie code executing .... ");
		
	}
	
	public void doDownload(String DownloadQuality)
	{
	
		System.out.println(" Downloading code executing .... "+DownloadQuality);
		
	}
	
	public void doStreaming(String StreamQuality)
	{
	
		System.out.println(" Streaming code executing .... "+StreamQuality);
	
	}
	
	
	
}
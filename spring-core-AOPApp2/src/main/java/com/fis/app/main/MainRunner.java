package com.fis.app.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Client;
import com.fis.app.service.BuySubscriptionPlan;
import com.fis.app.service.ClientService;

public class MainRunner {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		
		
		ClientService clientService = (ClientService)spring.getBean("clientService");
		
		BuySubscriptionPlan subscription=(BuySubscriptionPlan)spring.getBean("subscription");
		
		subscription.MakePayment();
		
		clientService.doSearchMovie();
		
		
		clientService.doDownload("720p");
		
	
		clientService.doStreaming("480p");
		
		
	
		
	}
}

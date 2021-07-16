package com.fis.app.service;

import org.springframework.stereotype.Component;

@Component
public class BuySubscriptionPlan {

	private int SubscrptionDuration;
	private int SubscriptionCost;
	
	public void MakePayment()
	{
		
		System.out.println("-----make Subscription Payment-----\n");
		
	}

	public BuySubscriptionPlan(int subscrptionDuration, int subscriptionCost) {
		super();
		SubscrptionDuration = subscrptionDuration;
		SubscriptionCost = subscriptionCost;
	}

	public int getSubscrptionDuration() {
		return SubscrptionDuration;
	}

	public void setSubscrptionDuration(int subscrptionDuration) {
		SubscrptionDuration = subscrptionDuration;
	}

	public int getSubscriptionCost() {
		return SubscriptionCost;
	}

	public void setSubscriptionCost(int subscriptionCost) {
		SubscriptionCost = subscriptionCost;
	}

	@Override
	public String toString() {
		return "BuySubscriptionPlan [SubscrptionDuration=" + SubscrptionDuration + ", SubscriptionCost="
				+ SubscriptionCost + "]";
	}

	public BuySubscriptionPlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

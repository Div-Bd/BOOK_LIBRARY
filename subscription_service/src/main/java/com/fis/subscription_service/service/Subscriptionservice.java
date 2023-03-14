package com.fis.subscription_service.service;

import java.util.List;

import com.fis.subscription_service.model.Subscription;

public interface Subscriptionservice {
	
	List<Subscription> getSubscriptions();
	
	void postSubscription(Subscription subscription) throws Exception;

}

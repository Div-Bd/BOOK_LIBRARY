package com.fis.subscription_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.subscription_service.model.Subscription;
import com.fis.subscription_service.service.Subscriptionservice;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/subscriptionService")
public class SubscriptionController {
	
	@Autowired Subscriptionservice subscriptionservice;
	
	@GetMapping("/subscriptions")
	public List<Subscription> getSubscriptions() {
		
		return subscriptionservice.getSubscriptions();
		
	}
	
	@PostMapping("/postSubscriptions")
	public void postSubscription(@RequestBody Subscription subscription) throws Exception {
		
		try {
			subscriptionservice.postSubscription(subscription);
		} catch (Exception e) {
			throw new Exception ("Already Record Exist");
		}
		
	}

}
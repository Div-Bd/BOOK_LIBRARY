package com.fis.subscription_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.subscription_service.model.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

}

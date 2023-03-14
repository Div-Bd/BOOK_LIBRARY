package com.fis.subscription_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SUBSCRIPTION")
public class Subscription {

	@Id
	@Column(name = "SUBSCRIPTION_NAME")
	private String subscriptionName;
	
	@Column(name = "DATE_SUBSCRIBED")
	private String subscribedDate;
	
	@Column(name = "DATE_RETURNED")
	private String returnedDate;
	
	@Column(name = "BOOK_ID")
	private String bookId;

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public String getSubscribedDate() {
		return subscribedDate;
	}

	public void setSubscribedDate(String subscribedDate) {
		this.subscribedDate = subscribedDate;
	}

	public String getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	
	
}

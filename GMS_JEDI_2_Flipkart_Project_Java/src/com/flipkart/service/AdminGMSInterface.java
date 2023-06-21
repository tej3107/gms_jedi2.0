package com.flipkart.service;




public interface AdminGMSInterface {
	
	
	
	public void seePendingRequest();
	
	public  boolean approveRequest(String requestId);
	
	public  boolean approveAllRequests();
}
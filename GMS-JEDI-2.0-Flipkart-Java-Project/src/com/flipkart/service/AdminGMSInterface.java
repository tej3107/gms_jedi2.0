/**
 * 
 */
package com.flipkart.service;

/**
 * 
 */
public interface AdminGMSInterface {
	
	public void seePendingRequest();
	public  boolean approveAllRequests();
	public  boolean approveRequest(String requestId);
	
}

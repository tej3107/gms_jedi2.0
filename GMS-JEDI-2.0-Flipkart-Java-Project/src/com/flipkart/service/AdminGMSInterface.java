/**
 * 
 */
package com.flipkart.service;

/**
 * 
 */
public interface AdminGMSInterface {
	
	public void viewGymPendingRequest();
	public void viewGymOwnerPendingRequest();
	public  boolean approveAllGymOwnerRequests();
	public  boolean approveAllGymRequests();
	public  boolean approveGymRequest(String requestId);
	public  boolean approveGymOwnerRequest(String requestId);
	
}

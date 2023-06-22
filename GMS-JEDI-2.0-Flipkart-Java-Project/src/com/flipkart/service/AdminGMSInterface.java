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
	public  boolean approveGymRequest(int requestId);
	public  boolean approveGymOwnerRequest(int requestId);
	
}

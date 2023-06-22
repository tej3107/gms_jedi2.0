/**
 * 
 */
package com.flipkart.service;

/**
 * 
 */
public interface AdminGMSInterface {
	
	public void seeGymPendingRequest();
	public void seeGymOwnerPendingRequest();
	public  boolean approveAllGymOwnerRequests();
	public  boolean approveAllGymRequests();
	public  boolean approveGymRequest(String requestId);
	public  boolean approveGymOwnerRequest(String requestId);
	
}

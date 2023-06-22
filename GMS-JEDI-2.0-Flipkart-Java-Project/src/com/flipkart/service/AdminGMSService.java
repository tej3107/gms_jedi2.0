/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.*;
import com.flipkart.dao.*;

import java.util.*;

/**
 * 
 */
public class AdminGMSService implements AdminGMSInterface {
	
	User user2 = new User("Tej", "s123", 1);
	User user3 = new User("Lokesh", "s123", 1);
	AdminGMSDao admin_gms_dao = new AdminGMSDaoImpl();
	
	
	
	
	public void viewGymPendingRequest() {
		
		
		
		System.out.println("List of pending Gym registration :- ");
		Registration[] pendingRegistration  =  admin_gms_dao.getGymPendingRequest();
		
		for(Registration val : pendingRegistration) {
			
			System.out.println(val.getName()+" - regid: "+val.getUserName());
			
		}
		
	}
	

	public void viewGymOwnerPendingRequest() {
		
		
		System.out.println("List of pending registration :- ");
		Registration[] pendingRegistration  =  admin_gms_dao.getGymOwnerPendingRequest();
		
		for(Registration val : pendingRegistration) {
			
			System.out.println(val.getName()+" - regid: "+val.getUserName());
			
		}
		
		
	}
	
	public boolean approveGymRequest(String requestId) {

		admin_gms_dao.changeGymStatus(requestId,1);	
		System.out.println("The Gym  has been approved.");
		return true;
	}
	
	
	public boolean approveGymOwnerRequest(String requestId) {

		admin_gms_dao.changeGymOwnerStatus(requestId,1);
		
		System.out.println("The Gym owner has been approved.");
		return true;
	}
	
	
	public boolean approveAllGymRequests() {
		
		
		
		return true;
	}
	
	public boolean approveAllGymOwnerRequests() {
		
		
		
		return true;
	}
} 

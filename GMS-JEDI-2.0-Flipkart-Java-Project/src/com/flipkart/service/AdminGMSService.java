/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.*;

import java.util.*;

/**
 * 
 */
public class AdminGMSService implements AdminGMSInterface {
	
	User user2 = new User("Tej", "s123", 1);
	User user3 = new User("Lokesh", "s123", 1);
	
	
	Registration register1 = new Registration("abc1", "abc", 1, "abc");
	Registration register2 = new Registration("abc2", "abc", 1, "abc");
	Registration register3 = new Registration("abc3", "abc", 1, "abc");
							
	List<Registration> pendingRegistration  = new ArrayList<>(Arrays.asList(register1,register2,register3));

	List<Registration> approved  = new ArrayList<>(Arrays.asList());
	
	public void seeGymPendingRequest() {
		
		
		
		System.out.println("List of pending Gym registration :- ");
		for(Registration val : pendingRegistration) {
			
			System.out.println(val.getName()+" - regid: "+val.getUserName());
			
		}
		
		
	}
	
	public void seeGymOwnerPendingRequest() {
		
		
		
		System.out.println("List of pending registration :- ");
		for(Registration val : pendingRegistration) {
			
			System.out.println(val.getName()+" - regid: "+val.getUserName());
			
		}
		
		
	}
	
	public boolean approveGymRequest(String requestId) {

		for (int i = 0; i < pendingRegistration.size(); i++) {
			Registration register = pendingRegistration.get(i);
		    if (register.getUserName().equals(requestId)) {
		    	
		    	approved.add(register);
		    	
		    	pendingRegistration.remove(i);
		    	System.out.println("Registration with request id " + requestId + " is approved ");
		    	break;
		    	
		    }
		}
		
	
		
		System.out.println("The Gym  has been approved.");
		return true;
	}
	
	
	public boolean approveGymOwnerRequest(String requestId) {

		for (int i = 0; i < pendingRegistration.size(); i++) {
			Registration register = pendingRegistration.get(i);
		    if (register.getUserName().equals(requestId)) {
		    	
		    	approved.add(register);
		    	
		    	pendingRegistration.remove(i);
		    	System.out.println("Registration with request id " + requestId + " is approved ");
		    	break;
		    	
		    }
		}
		
	
		
		System.out.println("The Gym owner has been approved.");
		return true;
	}
	
	public boolean approveAllGymRequests() {
		
		
		for (int i = 0; i < pendingRegistration.size(); i++) {
			Registration register = pendingRegistration.get(i);
		   	
		    approved.add(register);
		 }
		
		pendingRegistration.clear();
		
		
		
		return true;
	}
	
	public boolean approveAllGymOwnerRequests() {
		
		
		for (int i = 0; i < pendingRegistration.size(); i++) {
			Registration register = pendingRegistration.get(i);
		   	
		    approved.add(register);
		 }
		
		pendingRegistration.clear();
		
		
		
		return true;
	}
} 

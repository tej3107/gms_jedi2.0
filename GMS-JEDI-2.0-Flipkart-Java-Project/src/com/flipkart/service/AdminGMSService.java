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
	
	
	Registration register1 = new Registration("abc1", "abc", 1, "abc");
	Registration register2 = new Registration("abc2", "abc", 1, "abc");
	Registration register3 = new Registration("abc3", "abc", 1, "abc");
							
	List<Registration> pendingRegistration  = new ArrayList<>(Arrays.asList(register1,register2,register3));

	List<Registration> approved  = new ArrayList<>(Arrays.asList());
	
	public void seeGymPendingRequest() {
		
		
		
		System.out.println("List of pending Gym registration :- ");
		Registration[] pendingRegistration  =  admin_gms_dao.getGymPendingRequest();
		
		for(Registration val : pendingRegistration) {
			
			System.out.println(val.getName()+" - regid: "+val.getUserName());
			
		}
		
		
	}
	
<<<<<<< HEAD
	public boolean approveRequest(String requestId) {

		for (int i = 0; i < pendingRegistration.size(); i++) {
			
			Registration register = pendingRegistration.get(i);
		    if (register.getUserName().equals(requestId)) {
		    	
		    	approved.add(register);
		    	
		    	pendingRegistration.remove(i);
		    	System.out.println("Registration with request id " + requestId + " is approved ");
		    	break;
		    	
		    }
=======
	public void seeGymOwnerPendingRequest() {
		
		
		
		System.out.println("List of pending registration :- ");
		Registration[] pendingRegistration  =  admin_gms_dao.getGymOwnerPendingRequest();
		for(Registration val : pendingRegistration) {
			
			System.out.println(val.getName()+" - regid: "+val.getUserName());
			
>>>>>>> b5076dc0cef37724db6b180bf858dd53b7d87273
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
		
		
		//	to do
		
		
		return true;
	}
	
	public boolean approveAllGymOwnerRequests() {
		
		
//		to do
		
		
		return true;
	}
} 

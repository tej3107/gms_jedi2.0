/**
 * 
 */
package com.flipkart.service;
import com.flipkart.bean.*;
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */



public class CustomerGMSService implements CustomerGMSInterface { 
	
	Gymnasium gym1 = new Gymnasium("A1","Lokesh");
	Gymnasium gym2 = new Gymnasium("A2","Sokesh");
	Gymnasium gym3 = new Gymnasium("A3","Bokesh");
	
	List<Gymnasium> GymList = new ArrayList<>(Arrays.asList(gym1, gym2, gym3));
	
	
	public Customer fetchCustomerDetails(String customerId) {
		
		return new Customer();
	}
	
	public void fetchGymList(LocalDate date) {
		
		System.out.println("The gym list is : ");
		for(Gymnasium gym : GymList) {
			
			System.out.println("Gym id : "+ gym.getGymId() + " Name : " + gym.getName());
			
			
		}
		
	}
	
	public Slots selectSlot() {
		return new Slots();
	}
}

/**
 * 
 */
package com.flipkart.service;
import com.flipkart.bean.*;
import java.time.LocalDate;

/**
 * 
 */


public class CustomerGMSService implements CustomerGMSInterface { 
	public Customer fetchCustomerDetails(String customerId) {
		return new Customer();
	}
	
	public void fetchGymList(LocalDate date) {
		
	}
	
	public Slots selectSlot() {
		return new Slots();
	}
}

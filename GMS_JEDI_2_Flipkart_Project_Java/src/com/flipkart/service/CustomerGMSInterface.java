package com.flipkart.service;

import java.time.LocalDate;

import com.flipkart.bean.Customer;
import com.flipkart.bean.Slots;

interface CustomerGMSInterface {
	
	public static Customer fetchCustomerDetails(String customerId) {
		return new Customer();
	}
	
	
	public static void fetchGymList(LocalDate date) {
		
	}
	
	public static Slots selectSlot() {
		return new Slots();
	}
}
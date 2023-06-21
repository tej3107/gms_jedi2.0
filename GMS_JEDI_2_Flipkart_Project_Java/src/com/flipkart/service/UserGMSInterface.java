package com.flipkart.service;

import com.flipkart.bean.Registration;
import com.flipkart.bean.User;

interface UserGMSInterface {
	
	public static boolean registerCustomer(Registration customerData) {
		return true;
	}
	
	public static boolean registerGymOwner(Registration ownerData) {
		return true;
	}
	
	public static boolean authenticateUser(User userData) {
		return true;
	}
	
	public static boolean logout(User userData) {
		return true;
	}

}
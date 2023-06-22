/**
 * 
 */
package com.flipkart.service;
import java.util.List;
import com.flipkart.dao.UserGMSDao;
import com.flipkart.dao.UserGMSDaoImpl;

import java.util.ArrayList;
import java.util.Arrays;

import com.flipkart.bean.*;

/**
 * 
 */
public class UserGMSService implements UserGMSInterface {
	
	
	UserGMSDao userGMSDao;
	public void registerCustomer(Registration customerData) {
		userGMSDao.registerCustomer(customerData);
;	}
	
	public void registerGymOwner(Registration ownerData) {
		
		userGMSDao.registerGymOwner(ownerData);
	}
	
	public boolean authenticateUser(User userData) {
		return userGMSDao.isAuthenticated(userData);
	}
	
	public void registerUser(User userData) {
		userGMSDao.registerUser(userData);
	}
	
	public boolean logout(User userData) {
		return true;
	}
	
}
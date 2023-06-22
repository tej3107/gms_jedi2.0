package com.flipkart.service;

import com.flipkart.bean.Registration;
import com.flipkart.bean.User;
import com.flipkart.dao.UserGMSDao;

public interface UserGMSInterface {
	
	public void registerCustomer(Registration customerData) ;
	
	public void registerGymOwner(Registration ownerData) ;
	
	public boolean authenticateUser(User userData) ;
	
	public void registerUser(User userData) ;
	
	public boolean logout(User userData);
}

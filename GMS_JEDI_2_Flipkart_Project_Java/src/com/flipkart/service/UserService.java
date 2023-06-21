/**
 * 
 */
package com.flipkart.service;
import com.flipkart.bean.*;

import java.util.*;


/**
 * 
 */
public class UserService implements UserGMSInterface{
	
	
	
	User user1 = new User("Shubham", "s123", 1);
	User user2 = new User("Tej", "s123", 2);
	User user3 = new User("Lokesh", "s123", 2);

	List<User> userList = new ArrayList<>(Arrays.asList(user1, user2, user3));
	
	public boolean registerCustomer(Registration customerData) {
	
		
		
		return true;
	}
	
	public boolean registerGymOwner(Registration ownerData) {
		return true;
	}
	
	public boolean authenticateUser(User userData) {
	
		System.out.println(userData.getUserName()+" - "+ userData.getRoleId()+" - "+ userData.getPassword()+"\n");

		for(User val : userList) {

			if(userData.getUserName().equals(val.getUserName()) && userData.getRoleId()==val.getRoleId() && userData.getPassword().equals(val.getPassword())) {
				return true;
			}
		}
		return false;
	
	}
	
	public boolean logout(User userData) {
		return true;
	}
}

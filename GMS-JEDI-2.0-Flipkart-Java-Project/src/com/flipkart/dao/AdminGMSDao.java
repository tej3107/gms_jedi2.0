

/**
 * 
 * 
 * Method has to be designed similar to service class with DAO
 */
package com.flipkart.dao;

import java.util.ArrayList;

import com.flipkart.bean.Registration;

/**
 * 
 */
public interface AdminGMSDao {
	
	public ArrayList<Registration> getGymPendingRequest();
	public ArrayList<Registration> getGymOwnerPendingRequest();
	public void changeGymOwnerStatus(int id,int status);
	public void changeGymStatus(int id,int status);
	
}

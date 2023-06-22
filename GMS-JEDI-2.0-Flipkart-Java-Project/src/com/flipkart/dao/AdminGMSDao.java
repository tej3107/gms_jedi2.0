

/**
 * 
 * 
 * Method has to be designed similar to service class with DAO
 */
package com.flipkart.dao;

import com.flipkart.bean.Registration;

/**
 * 
 */
public interface AdminGMSDao {
	
	public Registration[] getGymPendingRequest();
	public Registration[] getGymOwnerPendingRequest();
	public void changeGymOwnerStatus(String id,int status);
	public void changeGymStatus(String id,int status);
	
	
	
}

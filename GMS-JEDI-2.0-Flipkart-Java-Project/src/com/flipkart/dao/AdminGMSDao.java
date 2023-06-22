

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
	
<<<<<<< HEAD
=======
	public Registration[] getGymPendingRequest();
	public Registration[] getGymOwnerPendingRequest();
	public void changeGymOwnerStatus(String id,int status);
	public void changeGymStatus(String id,int status);
	
	
	
>>>>>>> b5076dc0cef37724db6b180bf858dd53b7d87273
}

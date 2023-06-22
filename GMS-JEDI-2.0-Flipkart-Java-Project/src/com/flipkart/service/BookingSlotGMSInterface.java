/**
 * 
 */
package com.flipkart.service;

import java.util.List;

import com.flipkart.bean.Slots;
import com.flipkart.bean.User;

/**
 * 
 */

public interface BookingSlotGMSInterface {
	
	public boolean checkAvailability(Slots slot);
	
	public List<Slots> anotherSlotAtSameTime(User userData, Slots slot) ;
	
	public boolean bookSlot(User userData, Slots slot) ;
	
	public boolean cancelSlot(User userData, Slots slot);
}

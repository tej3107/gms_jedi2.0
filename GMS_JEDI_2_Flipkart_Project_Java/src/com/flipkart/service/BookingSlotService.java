/**
 * 
 */
package com.flipkart.service;
import com.flipkart.bean.*;

/**
 * 
 */
public class BookingSlotService implements BookingSlotGMSInterface{
	public boolean checkAvailability(Slots slot) {
		return true;
	}
	
	public boolean anotherSlotInSameTime(User userData, Slots slot) {
		return true;
	}
	
	public boolean bookSlot(User userData, Slots slot) {
		return true;
	}
	
	public boolean cancelSlot(User userData, Slots slot) {
		return true;
	}
}

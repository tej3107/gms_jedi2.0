/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.*;
import com.flipkart.dao.*;

import java.util.*;

/**
 * 
 */
public class BookingSlotService implements BookingSlotGMSInterface{
	
	
	BookingSlotsGMSDao booking_slot_gms_dao = new BookingSlotsGMSDaoImpl();
	
	
	public boolean checkAvailability(Slots slot) {
		
		
		Slots slt=booking_slot_gms_dao.getSlotById(slot.getSlotId());
		return true;
		//return slot.getAvailabe()!=0;
	}
	
	public List<Slots> anotherSlotAtSameTime(User userData, Slots slot) {
		
		return booking_slot_gms_dao.anotherSlotAtSameTime(userData, slot);
	}
	
	
	public boolean bookSlot(User userData, Slots slot) {
		
		return booking_slot_gms_dao.bookSlot(userDatam, slot);
		
//		if(slot.getAvailabe()!=0)
//		{
//			int curAvailable=slot.getAvailabe();
//			//slot.setAvailabe(curAvailable-1);
//			booking_slot_gms_dao.changeAvailableById(slot.getSlotId(), curAvailable-1);
//			
//			List<Integer>curUsers = slot.getBookedUserIds();
//			curUsers.add(userData.getUserId());
//			slot.setBookedUserIds(curUsers);
//			//should add userdata to the booked users of current slot
//			return true;
//		}
//		return false;
	}
	
	
	public boolean cancelSlot(User userData, Slots slot) {
		
		return booking_slot_gms_dao.cancelSlot(userData, slot);
		
//		if(slot.getAvailabe()!=slot.getCapacity())
//		{
//			int curAvailable=slot.getAvailabe();
//			slot.setAvailabe(curAvailable+1);
//			
//			List<Integer>curUsers = slot.getBookedUserIds();
//			curUsers.remove(userData.getUserId());
//			slot.setBookedUserIds(curUsers);
//			//should remove userdata to the booked users of current slot
//			return true;
//		}
//		return false;
	}
}

/**
 * 
 */
package com.flipkart.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.flipkart.bean.*;

/**
 * 
 */
public class BookingSlotService implements BookingSlotGMSInterface{
	
	
	List<Slots>allSlots  = new ArrayList<>(Arrays.asList());
	
	public boolean checkAvailability(Slots slot) {
		
		return slot.getAvailabe()!=0;
	}
	
	
	public List<Slots> anotherSlotAtSameTime(User userData, Slots slot) {
		
		List<Slots>slotsAtSameTime  = new ArrayList<>(Arrays.asList());
		
		for(int i=0;i<allSlots.size();i++)
		{
			Slots cur=allSlots.get(i);
			
			if(cur.getDate().equals(slot.getDate()) && cur.getTime().equals(slot.getTime()) && cur.getAvailabe()!=0)
			{
				slotsAtSameTime.add(cur);
			}
		}
		return slotsAtSameTime;
	}
	
	
	public boolean bookSlot(User userData, Slots slot) {
		
		if(slot.getAvailabe()!=0)
		{
			int curAvailable=slot.getAvailabe();
			slot.setAvailabe(curAvailable-1);
			
			List<Integer>curUsers = slot.getBookedUserIds();
			curUsers.add(userData.getUserId());
			slot.setBookedUserIds(curUsers);
			//should add userdata to the booked users of current slot
			return true;
		}
		return false;
	}
	
	
	public boolean cancelSlot(User userData, Slots slot) {
		
		if(slot.getAvailabe()!=slot.getCapacity())
		{
			int curAvailable=slot.getAvailabe();
			slot.setAvailabe(curAvailable+1);
			
			List<Integer>curUsers = slot.getBookedUserIds();
			curUsers.remove(userData.getUserId());
			slot.setBookedUserIds(curUsers);
			//should remove userdata to the booked users of current slot
			return true;
		}
		return false;
	}
}

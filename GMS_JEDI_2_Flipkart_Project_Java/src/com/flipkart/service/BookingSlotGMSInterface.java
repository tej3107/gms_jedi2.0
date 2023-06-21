package com.flipkart.service;

import com.flipkart.bean.Slots;
import com.flipkart.bean.User;

interface BookingSlotGMSInterface {
	
	public static boolean checkAvailability(Slots slot) {
		return true;
	}
	
	public static boolean anotherSlotInSameTime(User userData, Slots slot) {
		return true;
	}
	
	public static boolean bookSlot(User userData, Slots slot) {
		return true;
	}
	
	public static boolean cancelSlot(User userData, Slots slot) {
		return true;
	}

}
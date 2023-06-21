package com.flipkart.service;

import com.flipkart.bean.GymOwner;
import com.flipkart.bean.Gymnasium;

interface GymOwnerGMSInterface {
	public static GymOwner fetchOwnerDetails() {
		return new GymOwner();
	}
	
	public static Gymnasium addGymDetails() {
		return new Gymnasium();
	}
	
	
	public static void publishGymDetails(Gymnasium gym) {
		
	}
}
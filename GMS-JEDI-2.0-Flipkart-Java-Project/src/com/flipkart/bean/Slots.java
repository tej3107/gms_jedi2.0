/**
 * 
 */
package com.flipkart.bean;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

public class Slots {
	
	private String slotId;
	private String gymId;
	private int capacity;
	private LocalDate date;
	private LocalTime time;
    private int availabe;
    
    private List<Integer> bookedUserIds = new ArrayList<Integer>(); // To be made ArrayList
    // List<Object> anyObject = new ArrayList<Object>();
	
	public List<Integer> getBookedUserIds() {
		return bookedUserIds;
	}

	public void setBookedUserIds(List<Integer> bookedUserIds) {
		this.bookedUserIds = bookedUserIds;
	}

	public int getAvailabe() {
		return availabe;
	}

	public void setAvailabe(int availabe) {
		this.availabe = availabe;
	}
	
	
	public String getSlotId() {
		return slotId;
	}
	
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalTime getTime() {
		return time;
	}
	
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public String getGymId() {
		return gymId;
	}

	public void setGymId(String gymId) {
		this.gymId = gymId;
	}
}
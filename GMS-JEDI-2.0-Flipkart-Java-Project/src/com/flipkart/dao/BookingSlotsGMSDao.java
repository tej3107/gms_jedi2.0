package com.flipkart.dao;

import com.flipkart.bean.*;
import com.flipkart.dao.*;

import java.util.*;

public interface BookingSlotsGMSDao {
	
	
	public Slots getSlotById(int id);
	public List<Slots> anotherSlotAtSameTime(User userData, Slots slot);
	public void changeAvailableById(int id, int avail);
	public boolean bookSlot(User userData, Slots slot);
	public boolean cancelSlot(User userData, Slots slot);
	
}

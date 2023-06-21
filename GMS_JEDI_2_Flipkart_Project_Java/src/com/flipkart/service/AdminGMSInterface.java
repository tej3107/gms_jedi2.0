package com.flipkart.service;


interface AdminGMSInterface {
	
	public static void seePendingRequest() {
		
	}
	
	public static boolean approveRequest(String requestId) {
		return true;
	}
	
	public static boolean approveAllRequests(String requestId) {
		return true;
	}

}
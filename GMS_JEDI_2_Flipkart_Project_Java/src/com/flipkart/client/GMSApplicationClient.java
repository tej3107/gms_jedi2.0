package com.flipkart.client;

import java.util.Scanner;

//import com.flipkart.client.AdminGMSMenu;

import com.flipkart.bean.User;
import com.flipkart.service.UserService;

public class GMSApplicationClient {
	
	static AdminGMSMenu admin = new AdminGMSMenu();
	static GymnasiumGMSMenu gym = new GymnasiumGMSMenu();
	static CustomerGMSMenu cust = new CustomerGMSMenu();
	
	public static void LoginMenu(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("Login Credentials:-");
		System.out.print("Username: ");
		String username = in.next();
		System.out.print("Password: ");
		String password = in.next();
		System.out.print("Select Role:-\n1.Admin\n2.Customer\n3.Gym Onwer ");
		
		int role = in.nextInt();
		
		User user = new User(username,password,role);
		UserService authentication = new UserService();
		if(authentication.authenticateUser(user)) {
			System.out.println("Logged In");
			switch(role) {
			case 1: admin.AdminActionPage(in); //done
			break;
			break;
			case 3: gym.GymOwnerActionPage(in); //done
			break;
			}
		}else {
			System.out.println("Invalid Creentials");
		}
		
	}
	
	public static void main(String args[]) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.Login \n2.Customer Registration\n3.GymOwner Registration\n4.Update Password\n5.Exit");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			LoginMenu(in);
			break;
		case 2:
			cust.CustomerRegistration(in);
			break;
		case 3:
			gym.GymOwnerRegistration(in);
			break;
		case 4:
			cust.CustomerRegistration(in);
			break;
		case 5:
			System.exit(0);
			break;
		// Default case statement
		default:
			System.out.println("incorrect choice");
		}
		in.close();
	}
	
}

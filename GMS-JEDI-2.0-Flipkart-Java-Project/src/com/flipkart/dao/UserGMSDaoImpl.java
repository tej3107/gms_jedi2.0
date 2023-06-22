//package com.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;
import com.flipkart.bean.*;


public class UserGMSDaoImpl implements UserGMSDao{
	
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/test";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Tej@1234";
    
    
    
	public boolean isAuthenticated(User userData) {
		
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
	   
	   try{
		   
		   // Step 3 Regiater Driver here and create connection 
		   
		   Class.forName("com.mysql.jdbc.Driver");

		   // Step 4 make/open  a connection 
		   
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   
		   
		   // Let us update age of the record with ID = 102;
		      int rows = stmt.executeUpdate();
		      System.out.println("Rows impacted : " + rows );

		      // Let us select all the records and display them.
		      String sql = "SELECT id, password, roleId FROM User WHERE name = '"+ userData.getUserName() + "'";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int uid  = rs.getInt("id");
		         String  password = rs.getString("password");
		         int roleId = rs.getInt("roleId");
		         
		         if( password.equals(userData.getPassword()) && roleId == userData.getRoleId()) {
		        	 
		        	 return true;
		        	 
		        	 
		         }
		         else return false;
		        
		      }
		      //STEP 6: Clean-up environment
		     // rs.close();
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   System.out.println("Goodbye!");
		
		
		
		return false;
	}
	
	public void registerCustomer(Registration customerData) {
		

//		Connection conn = null;
//		PreparedStatement stmt = null;
//	   
//	   try{
//		
//
//		   Class.forName("com.mysql.jdbc.Driver");
//
//		   // Step 4 make/open  a connection 
//		   
//		      System.out.println("Connecting to database...");
//		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
//		   
//		   
//		   // Let us update age of the record with ID = 102;
//		      int rows = stmt.executeUpdate();
//		      System.out.println("Rows impacted : " + rows );
//
//		      // Let us select all the records and display them.
//		      String sql = "INSERT INTO CustomerRegistration (custid, name, username, email, address, mobile, dob) VALUES ('"
//		    		  + customerData. ', 'John Doe', '1234567890', 'johndoe@example.com', '123 Main St, City, Country', '1990-01-01');\n"
//		      		+ ";
//		      ResultSet rs = stmt.executeQuery(sql);
//
//		      //STEP 5: Extract data from result set
//		      while(rs.next()){
//		         //Retrieve by column name
//		         int uid  = rs.getInt("id");
//		         String  password = rs.getString("password");
//		         int roleId = rs.getInt("roleId");
//		         
//		         if( password.equals(userData.getPassword()) && roleId == userData.getRoleId()) {
//		        	 
//		        	 return true;
//		        	 
//		        	 
//		         }
//		         else return false;
//		        
//		      }
//		      //STEP 6: Clean-up environment
//		     // rs.close();
//		      stmt.close();
//		      conn.close();
//		   }catch(SQLException se){
//		      //Handle errors for JDBC
//		      se.printStackTrace();
//		   }catch(Exception e){
//		      //Handle errors for Class.forName
//		      e.printStackTrace();
//		   }finally{
//		      //finally block used to close resources
//		      try{
//		         if(stmt!=null)
//		            stmt.close();
//		      }catch(SQLException se2){
//		      }
//		      try{
//		         if(conn!=null)
//		            conn.close();
//		      }catch(SQLException se){
//		         se.printStackTrace();
//		      }
//		   }
		return;
	}
	
	public void registerGymOwner(Registration ownerData) {
		// todo
		
//		
//		Connection conn = null;
//		PreparedStatement stmt = null;
//	   
//	   try{
//		
//
//		   Class.forName("com.mysql.jdbc.Driver");
//
//		   // Step 4 make/open  a connection 
//		   
//		      System.out.println("Connecting to database...");
//		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
//		   
//		   
//		   // Let us update age of the record with ID = 102;
//		      int rows = stmt.executeUpdate();
//		      System.out.println("Rows impacted : " + rows );
//
//		      // Let us select all the records and display them.
//		      String sql = "INSERT INTO GymOwnerRegistration (gymownerid, name, username, address, dob, mobile, email, aadhar, pan, gst) VALUES ('"
//		    		  + ownerData.get. ', 'John Doe', '1234567890', 'johndoe@example.com', '123 Main St, City, Country', '1990-01-01');\n"
//		      		+ ";
//		      ResultSet rs = stmt.executeQuery(sql);
//
//		      //STEP 5: Extract data from result set
//		      while(rs.next()){
//		         //Retrieve by column name
//		         int uid  = rs.getInt("id");
//		         String  password = rs.getString("password");
//		         int roleId = rs.getInt("roleId");
//		         
//		         if( password.equals(userData.getPassword()) && roleId == userData.getRoleId()) {
//		        	 
//		        	 return true;
//		        	 
//		        	 
//		         }
//		         else return false;
//		        
//		      }
//		      //STEP 6: Clean-up environment
//		     // rs.close();
//		      stmt.close();
//		      conn.close();
//		   }catch(SQLException se){
//		      //Handle errors for JDBC
//		      se.printStackTrace();
//		   }catch(Exception e){
//		      //Handle errors for Class.forName
//		      e.printStackTrace();
//		   }finally{
//		      //finally block used to close resources
//		      try{
//		         if(stmt!=null)
//		            stmt.close();
//		      }catch(SQLException se2){
//		      }
//		      try{
//		         if(conn!=null)
//		            conn.close();
//		      }catch(SQLException se){
//		         se.printStackTrace();
//		      }
//		   }
//	   
		return;
	}
	
	public void registerUser(User userData) {
		// todo
		
		return;
	}
	
}

package com.flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.flipkart.bean.Registration;
import com.mysql.cj.xdevapi.Statement;

import java.sql.ResultSet;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminGMSDaoImpl implements AdminGMSDao{

	
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver" ;  
		static final String DB_URL = "jdbc:mysql://localhost/GMS_DB" ;

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "Tej@1234";
	
//	public Registration[] getGymPendingRequest() {
   public ArrayList<Registration> getGymPendingRequest() {
		Connection conn = null;

	   PreparedStatement stmt = null;
	   ArrayList<Registration> reqList = new ArrayList<>();

	   
	   try{
		   
		  
		   	Class.forName("com.mysql.jdbc.Driver");

		
		    System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   
		   
		    PreparedStatement statement = conn.prepareStatement("SELECT id, name FROM gym WHERE approved=?");
		    statement.setInt(1, 0);

		    ResultSet rs = statement.executeQuery();

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int eid  = rs.getInt("id");
		         String name1 = rs.getString("name");
//		         String address1 = rs.getString("email");
		         
		         
		         Registration reg = new Registration();
		         reg.setName(name1);
//		         reg.setEmail(address1);
		         reg.setRegId(eid);
		         
		         reqList.add(reg);
//		         String location1 = rs.getString("location");

		         //Display values
		         System.out.print("ID: " + eid);
		         System.out.print(", Age: " + name1);
//		         System.out.print(", First: " + address1);
		         System.out.println("\n");
//		         System.out.println(", Last: " + location1);
		      }
		      //STEP 6: Clean-up environment
		     // rs.close();
		      statement.close();
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
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		   
		   return reqList;
	}
	
	public ArrayList<Registration> getGymOwnerPendingRequest() {
		Connection conn = null;
		   PreparedStatement stmt = null;
		   ArrayList<Registration> reqList = new ArrayList<>();
		   
		   try{
			   
			  
			   Class.forName("com.mysql.jdbc.Driver");


			   
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);

			      PreparedStatement statement = conn.prepareStatement("SELECT id, name ,email FROM gymOwner WHERE approved=?");
			      statement.setInt(1, 0);

			      
			      
			      ResultSet rs = statement.executeQuery();


			      //STEP 5: Extract data from result set
			      while(rs.next()){
			         //Retrieve by column name
			         int eid  = rs.getInt("id");
			         String name1 = rs.getString("name");
			         String address1 = rs.getString("email");
			         
			         
			         Registration reg = new Registration();
			         reg.setName(name1);
			         reg.setEmail(address1);
			         reg.setRegId(eid);
			         
			         reqList.add(reg);
//			         String location1 = rs.getString("location");

			         //Display values
			         System.out.print("ID: " + eid);
			         System.out.print(", Age: " + name1);
			         System.out.print(", First: " + address1);
			         System.out.println("\n");
//			         System.out.println(", Last: " + location1);
			      }
			      //STEP 6: Clean-up environment
			     // rs.close();
			      statement.close();
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
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
			   
			   return reqList;
	}
	
	
	public void changeGymOwnerStatus(int id,int status) {
		// Step 2 
				
				   Connection conn = null;
				   PreparedStatement preparedStatement = null;
//				   java.sql.Statement statement = null;
				   
				   try{
					   
					   
					   
					   Class.forName("com.mysql.jdbc.Driver");

					   // Step 4 make/open  a connection 
					   
					      System.out.println("Connecting to database...");
					      conn = DriverManager.getConnection(DB_URL,USER,PASS);
					   
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      
					      String updateQuery = "UPDATE gymOwner SET approved = ? WHERE id = ?";
			            preparedStatement = conn.prepareStatement(updateQuery);

			            // Set the values at specific positions
//			            if(status==0) 
			            preparedStatement.setInt(1, status);  // Set value for the first question mark (?)
//			            else preparedStatement.setInt(1, 0);
			            preparedStatement.setInt(2, id);  // Set value for the second question mark (?)

			            // Execute the update query
			            int rowsAffected = preparedStatement.executeUpdate();
					      
					      
			            preparedStatement.close();
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
					         if(preparedStatement!=null)
					        	 preparedStatement.close();
					      }catch(SQLException se2){
					      }// nothing we can do
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
					   System.out.println("Goodbye!");
	}
	
	public void changeGymStatus(int id,int status) {
		// Step 2 
				   Connection conn = null;
		   PreparedStatement preparedStatement = null;
//		   java.sql.Statement statement = null;
		   
		   try{
			   
			   // Step 3 Regiater Driver here and create connection 
			   
			   Class.forName("com.mysql.jdbc.Driver");

			   // Step 4 make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      
			      String updateQuery = "UPDATE gym SET approved = ? WHERE id = ?";
	            preparedStatement = conn.prepareStatement(updateQuery);

	            // Set the values at specific positions
	            preparedStatement.setInt(1, status);  // Set value for the first question mark (?)
//	            preparedStatement.setInt(1, 0);
	            preparedStatement.setInt(2, id);  // Set value for the second question mark (?)


	            // Execute the update query
	            int rowsAffected = preparedStatement.executeUpdate();
			      
	            preparedStatement.close();
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
			         if(preparedStatement!=null)
			        	 preparedStatement.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
	}
}

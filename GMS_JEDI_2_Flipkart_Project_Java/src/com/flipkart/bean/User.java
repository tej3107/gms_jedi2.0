/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class User {
	private String userName;
	private String password;
	private int roleId;
	
	public User (String userName,String password,int roleId) {
		this.userName=userName;
		this.password=password;
		this.roleId=roleId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getRoleId() {
		return roleId;
	}
	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}

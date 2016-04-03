package com.ntier.fff;

public class User {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String phone;

	public User(){
		
	}
	
	public User(String email, String password){
		this.email = email;
		this.password = password;
	}
	
	public User(String fname, String lname, String email){
		this.fname = fname;
		this.lname = lname;
		this.email = email;

		
	}
	
/*	public User(String fname, String lname, String email, String phone){
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}*/
	
	public User(String fname, String lname, String email, String password){
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}


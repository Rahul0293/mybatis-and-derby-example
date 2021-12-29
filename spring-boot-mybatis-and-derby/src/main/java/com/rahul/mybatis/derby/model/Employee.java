package com.rahul.mybatis.derby.model;

public class Employee {
	private long id;
	private String firstname;
	private String lastname;
	private String emailId;
	
	
	public Employee() {
		super();
	}


	public Employee(long id, String firstname, String lastname, String emailId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
	}


	public long getId() {
		return id;
	}


	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

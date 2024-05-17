package com.bean;

public class UserBean {

	private String firstName;//admin1
	private String lastName;//admin2

	public UserBean(){
		System.out.println("UserBean()");
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
  
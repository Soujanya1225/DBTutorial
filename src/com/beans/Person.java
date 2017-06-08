package com.beans;

public class Person{

	private String firstName;
	private String LastName;
	private String designation;
	private int age;
	private int supervisorID;
	
	public Person(String firstName, String LastName){
		this.firstName=firstName;
		this.LastName=LastName;
		/*this.supervisorID=supervisorID;
		this.age=age;
		this.designation=designation;*/
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", LastName=" + LastName + ", designation=" + designation + ", age="
				+ age + ", supervisorID=" + supervisorID + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSupervisorID() {
		return supervisorID;
	}
	public void setSupervisorID(int supervisorID) {
		this.supervisorID = supervisorID;
	}
	
	

	}



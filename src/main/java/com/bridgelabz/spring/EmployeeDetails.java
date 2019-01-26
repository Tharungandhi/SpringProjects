package com.bridgelabz.spring;

public class EmployeeDetails {
	private int id;  
	private String name;  
	private Address address;//Aggregation  
	  
	public EmployeeDetails() {}  
	  
	public EmployeeDetails(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
		System.out.println("dependencyinjection constructor");
	    System.out.println("id of "+ name + " is "+id);  
	    System.out.println(address.toString());  
	}  
}

package com.bridgelabz.spring;

public class Employee {
	private int id;  
	private String name;  
	  
	public Employee() {}  
	  
	public Employee(int id) {this.id = id;}  
	  
	public Employee(String name) {  this.name = name;}  
	  
	public Employee(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	 public void display(){  
		 System.out.println("dependencyinjection constructor");
	    System.out.println("id of "+ name + " is "+id);  
	} 
}

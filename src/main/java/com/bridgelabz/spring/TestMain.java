package com.bridgelabz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.spring.Employee;
public class TestMain {
	public static void main(String[] args) {
		
	      
      ApplicationContext factory=new ClassPathXmlApplicationContext("hello.xml");
      Employee service=(Employee) factory.getBean("employee");
      service.display();
      
      


        

}}

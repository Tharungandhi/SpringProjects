package com.bridgelabz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpAddDetailsMain {
public static void main(String[] args) {
	ApplicationContext appcont= new ClassPathXmlApplicationContext("hello.xml");
	EmployeeDetails emp=(EmployeeDetails) appcont.getBean("empdetails");
	emp.show();
}
}

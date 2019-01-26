package com.bridgelabz.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ListMain {

	public static void main(String[] args) {
		
		Resource res= new ClassPathResource("hello.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		QuestionList dilist=(QuestionList) factory.getBean("list");
		dilist.displayInfo();
//		
//		ApplicationContext appcont=new ClassPathXmlApplicationContext("hello.xml");
//		QuestionList ql=(QuestionList) appcont.getBean("list");
//		ql.displayInfo();

	}

}

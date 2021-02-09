package com.spring.Basics.RefTypes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/spring/Basics/RefTypes/inject.xml");
		Student student12 = (Student)ap.getBean("student");
			System.out.println(student12);
	
	}

}

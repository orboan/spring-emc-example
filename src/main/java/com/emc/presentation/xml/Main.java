package com.emc.presentation.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	//XML DI Examples
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		// Property Dependency Injection
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld);
        
        // Constructor Dependency Injection
        HelloWorld helloWorldConst = (HelloWorld) context.getBean("helloWorldConst");
        System.out.println(helloWorldConst);
        
        context.close();
	}

}

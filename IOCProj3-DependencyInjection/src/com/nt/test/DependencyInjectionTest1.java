package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		// create IOC container
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		System.out.println("Setter Injection");
		// get spring bean class obj
		Person person =(Person)factory.getBean("per");
		System.out.println(person);
		System.out.println("=====================================");
		
		
		System.out.println("Constructor Injection..");
		// Consructor-arg
		Person1 person1 =(Person1)factory.getBean("per1");
		
		System.out.println(person1+"\n");
		
		Class c = Person.class;
		Class c1 = Person1.class;
		System.out.println("C object class Name:: "+c.getClass()+" C obj data:: "+c.toString());
		System.out.println("C object class Name:: "+c1.getClass()+" C obj data:: "+c1.toString());
	}

}

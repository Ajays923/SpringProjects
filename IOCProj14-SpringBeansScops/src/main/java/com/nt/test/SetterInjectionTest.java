package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// create IOC container
		
		  DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		  XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		  /*
		  ClassPathXmlApplicationContext ctx = new
		  ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		  System.out.println("IOC container created...");
		 
		// get TargetBean class Object
		
		/*
		 * WishMessageGenerator generator1 =
		 * factory.getBean("wmg",WishMessageGenerator.class); WishMessageGenerator
		 * generator2 = factory.getBean("wmg",WishMessageGenerator.class);
		 * System.out.println(generator1.hashCode()+" "+generator2.hashCode());
		 * System.out.println("generator1==generator2? "+(generator1==generator2));
		 * System.out.println("------------------------------------------");
		 * WishMessageGenerator generator11 = factory.getBean("wmg1",
		 * WishMessageGenerator.class); WishMessageGenerator generator12 =
		 * factory.getBean("wmg1", WishMessageGenerator.class);
		 * System.out.println(generator11.hashCode()+" "+generator12.hashCode());
		 * System.out.println("generator11==generator12? "+(generator11==generator12));
		 * System.out.println("-----------------------------------------");
		 */
		/*
		 * Printer p1 = factory.getBean("p1",Printer.class); Printer p2 =
		 * factory.getBean("p1",Printer.class);
		 * System.out.println(p1.hashCode()+" "+p2.hashCode());
		 * System.out.println("p1==p2?"+(p1==p2));
		 */ 
		/*
		 * System.out.println("-------------------------------------------");
		 * 
		 * Printer p11 = factory.getBean("p22",Printer.class); Printer p22 =
		 * factory.getBean("p22",Printer.class);
		 * System.out.println(p11.hashCode()+" "+p22.hashCode());
		 * System.out.println("p11==p22?"+(p11==p22));
		 * System.out.println("-------------------------------------------");
		 * 
		 * Printer p23 = factory.getBean("p23",Printer.class); Printer p24 =
		 * factory.getBean("p23",Printer.class);
		 * System.out.println(p23.hashCode()+" "+p24.hashCode());
		 * System.out.println("p11==p22?"+(p11==p22));
		 * System.out.println("-------------------------------------------");
		 */
	}
}

package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nit.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// Locate and hold spring cgf file
		FileSystemResource res = new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
		
		// create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		// get TargetBean class Object
		Object obj =factory.getBean("wmg");
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		// invoke b.method 
		String result = generator.generateWishMessage("Ajay");
		System.out.println(result);
		
	}
}

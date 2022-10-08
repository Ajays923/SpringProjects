package com.nt.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		// locate and hold spring cfgs file
			FileSystemResource res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		// creates IOC container
			XmlBeanFactory factory = new XmlBeanFactory(res);
		// get target bean class object	
			Object obj = factory.getBean("wmg");
		// type casting
			WishMessageGenerator generator = (WishMessageGenerator)obj;
		// invoke business method
			String 	result = generator.GenerateWishMessage("Ajay");
			System.out.println("Result :: "+result);
	}

}

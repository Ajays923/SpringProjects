package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		// Create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// get Target class object
		Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
		// inovke b. method
		String result=fpkt.shopping(new String[]{"Mangoes","KIVI","Watermelon"},
									new float[] {900.0f,400.0f,500.0f});
		
		System.out.println(result);

	}
}

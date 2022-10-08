package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		// Read inputs from enduser as String values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer name");
		String name= sc.next();
		System.out.println("enter customer addrs");
		String addrs = sc.next();
		System.out.println("enter customer principle amount");
		String pAmt=sc.next();
		System.out.println("enter Time (In Months)");
		String time =sc.next();
		System.out.println("enter Rate of interest");
		String 	rate=sc.next();
		
		
		// create Customer VO class obj
		CustomerVO vo = new CustomerVO();
		vo.setCustName(name);
		vo.setCustAddrs(addrs);
		vo.setPamt(pAmt);
		vo.setTime(time);
		vo.setRate(rate);
		
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		// get controller class object
		MainController controller = ctx.getBean("controller",MainController.class);
		// invoke the methods 
		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("internal Problem --> try Again"+e.getMessage());
		}
	}

}

package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class CoronaPatient {

	public static void main(String[] args) {
		// Read inputs from enduser as string values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Corona Patient Name");
		String name = sc.next();
		System.out.println("Enter Corona Patient Addrs");
		String addrs = sc.next();
		System.out.println("Enter Mobile Number");
		String Mob_number = sc.next();
		System.out.println("How many days hospitalized");
		String patient = sc.next();
		System.out.println("Enter per day bill of corona patient");
		String Per_bill = sc.next();
		
		// Create CustomerVo class obj
		CustomerVO vo = new CustomerVO();
		vo.setPatientName(name);
		vo.setPatientAddrs(addrs);
		vo.setMobile_Number(Mob_number);
		vo.setNo_Of_patientHospitalized(patient);
		vo.setBill_Per_Day(Per_bill);
		
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		// get controller class obj
		MainController controller = factory.getBean("controller",MainController.class);
		
		// invoke b.method
		try {
			String result = controller.processCoronaPatientBill(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem --> try Again"+e.getMessage());
		}
	}
}

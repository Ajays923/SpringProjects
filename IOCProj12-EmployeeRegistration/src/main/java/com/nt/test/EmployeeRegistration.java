package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmployeeRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee addrs");
		String addrs = sc.next();
		System.out.println("Enter Basic Salary of Employee");
		String salary = sc.next();
		
		// create EmployeeVO class obj
		EmployeeVO vo = new EmployeeVO();
		vo.setEname(name);
		vo.setEaddrs(addrs);
		vo.setBasic_salary(salary);
		
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		// get Controller class obj
		MainController controller = factory.getBean("controller",MainController.class);
		
		// invoke b.method
		try {
			String result = controller.processGrossSalaryAndNetSalary(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal problem --> try again"+e.getMessage());
		}
		
	}

}

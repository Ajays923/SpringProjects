package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class JavaConfigAppTest {

	public static void main(String[] args) {
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//get target class
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		// invoke b.method
		System.out.println(generator.generate("Ajay"));
		
		// close container
		ctx.close();
	}
}

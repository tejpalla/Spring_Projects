package com.in28min.learnspringframework.example;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LauncherApplication {

    	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(LauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

            System.out.println(context.getBean(BusinessLogic.class).findMax());
		}
	}
    
}

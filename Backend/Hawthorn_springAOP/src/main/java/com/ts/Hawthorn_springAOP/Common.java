package com.ts.Hawthorn_springAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {
	
	@Before("execution (public void helloBatch())")
	public void welcome() {
		System.out.println("Welcome");
	}
	
	@After("execution (public void helloBatch())")
	public void Bye() {
		System.out.println("Bye bye");
	}

}

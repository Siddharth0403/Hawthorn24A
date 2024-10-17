package com.ts.Hawthorn_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	Common tc1  = new Teacher();
    	System.out.println(tc1);
    	Common tc2  = new Teacher();
    	System.out.println(tc2);
    	Common tc3  = new Teacher();
    	System.out.println(tc3);
    	Common tc4  = new Teacher();
    	System.out.println(tc4);
    	
    	
    	System.out.println("========================================");
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Common t = ac.getBean("tch",Common.class);
    	System.out.println(t);
    	Common t1 = ac.getBean("tch",Common.class);
    	System.out.println(t1);
    	Common t2 = ac.getBean("tch",Common.class);
    	System.out.println(t2);
    	Common t3 = ac.getBean("tch",Common.class);
    	System.out.println(t3);
    	
    	
    	
    }
}

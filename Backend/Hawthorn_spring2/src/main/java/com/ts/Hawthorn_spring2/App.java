package com.ts.Hawthorn_spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        Teacher t = ac.getBean("tch2",Teacher.class);
        System.out.println(t.getName());
    }
}

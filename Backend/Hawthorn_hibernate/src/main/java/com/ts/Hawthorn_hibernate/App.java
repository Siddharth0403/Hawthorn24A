package com.ts.Hawthorn_hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		session.beginTransaction();
		
		Teacher t1 = new Teacher("Ram", "English");
		Teacher t2 = new Teacher("Sham", "Maths");
		Teacher t3 = new Teacher("Damu", "SST");
		Teacher t4 = new Teacher("Gopu", "History");
		
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		session.persist(t4);
	
		
		session.getTransaction().commit();
		  session.close();
	}

}

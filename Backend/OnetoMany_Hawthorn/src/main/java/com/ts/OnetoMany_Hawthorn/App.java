package com.ts.OnetoMany_Hawthorn;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(Document.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		session.beginTransaction();
		
    
		User u = new User();
		u.setId(1);
		u.setName("Sham");
		
		Document doc1 = new Document();
		doc1.setId(101);
		doc1.setNumber("xyz123");
		doc1.setType("pan");
		
		Document doc2 = new Document();
		doc2.setId(102);
		doc2.setNumber("abc789");
		doc2.setType("aadhar");
		
		List<Document> docs = new ArrayList<>();
		docs.add(doc1);
		docs.add(doc2);
		
		u.setDocument(docs);
		
		session.persist(u);
		session.persist(doc1);
		session.persist(doc2);
		
	
		
		session.getTransaction().commit();
		  session.close();
    }
}

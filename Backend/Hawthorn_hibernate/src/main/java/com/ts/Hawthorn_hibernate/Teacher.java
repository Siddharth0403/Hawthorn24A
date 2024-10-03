package com.ts.Hawthorn_hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Student")
public class Teacher {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private int id;
	private String name;
	@Column(name="School")
	private String subject;
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	
	}
	public Teacher() {}
	public Teacher(int id, String name, String subject) {
		
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	public Teacher( String name, String subject) {
		
		this.name = name;
		this.subject = subject;
	}

}

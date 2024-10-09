package com.ts.ManytoMany_Hawthorn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Batch {
@Id
	private int Id;
	private String subject;
	private String sir;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSir() {
		return sir;
	}
	public void setSir(String sir) {
		this.sir = sir;
	}
	
	public Batch() {}
	public Batch(int id, String subject, String sir) {
		
		Id = id;
		this.subject = subject;
		this.sir = sir;
	}
	
	
}

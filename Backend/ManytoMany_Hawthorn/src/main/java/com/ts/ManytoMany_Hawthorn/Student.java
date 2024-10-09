package com.ts.ManytoMany_Hawthorn;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int Rollno;
	private String name;
	
	@ManyToMany
	private List<Batch> batch;
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Batch> getBatch() {
		return batch;
	}
	public void setBatch(List<Batch> batch) {
		this.batch = batch;
	}
	
	public Student () {}
	public Student(int rollno, String name, List<Batch> batch) {
		
		Rollno = rollno;
		this.name = name;
		this.batch = batch;
	}
	
	
	
	
}

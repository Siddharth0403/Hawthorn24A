package com.ts.OnetoOne_Hawthorn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	private int Id;
	private String name;
	
	@OneToOne
	private Aadhar aadhar;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	public User() {}
	public User(int id, String name, Aadhar aadhar) {
		
		Id = id;
		this.name = name;
		this.aadhar = aadhar;
	}
	

	
}

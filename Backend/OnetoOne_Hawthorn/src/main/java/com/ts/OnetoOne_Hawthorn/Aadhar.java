package com.ts.OnetoOne_Hawthorn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Aadhar {
	
	@Id
	private int Id;
	private String number;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Aadhar() {}
	public Aadhar(int id, String number) {
	
		Id = id;
		this.number = number;
	}
	
	
	

}

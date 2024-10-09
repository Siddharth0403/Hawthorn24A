package com.ts.OnetoMany_Hawthorn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Document {
	
	@Id
	private int Id;
	private String type;
	private String number;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	
	public Document() {}
	public Document(int id, String type, String number) {
		
		Id = id;
		this.type = type;
		this.number = number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	

}

package com.ts.OnetoMany_Hawthorn;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class User {
	
	@Id
	private int Id;
	private String name;
	
	@OneToMany
	private List<Document> document;
	
	public List<Document> getDocument() {
		return document;
	}
	public void setDocument(List<Document> document) {
		this.document = document;
	}
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
	
	public User() {}
	public User(int id, String name, List<Document> document) {
		
		Id = id;
		this.name = name;
		this.document = document;
	}
	
	

}

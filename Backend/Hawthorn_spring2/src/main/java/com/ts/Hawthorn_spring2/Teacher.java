package com.ts.Hawthorn_spring2;

public class Teacher {
	
	private int Id;
	private String name;
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
	public Teacher() {}
	public Teacher(int id, String name) {
		
		Id = id;
		this.name = name;
	}

}

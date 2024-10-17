package com.ts.Hawthorn_springAOP;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	@Autowired
	private Batch batch;
	
	public void helloStudent() {
		System.out.println("I am student");
		batch.helloBatch();
	}

}

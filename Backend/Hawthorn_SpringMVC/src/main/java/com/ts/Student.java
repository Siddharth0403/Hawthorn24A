package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



//Controller + responseBody = RestApi (RestController)

@RestController
public class Student {
	
	@GetMapping("/std")
	public  String std() {
		return ("Hello there, How are you");
	}
	
	@GetMapping("/std2")
	public  String std2() {
		return ("I am std 2");
	}

}

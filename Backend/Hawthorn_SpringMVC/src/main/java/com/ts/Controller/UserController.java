package com.ts.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.Student;
import com.ts.Model.User;

@RestController
public class UserController {
	
	@GetMapping("/usr")
	public User usr() {
		return new User(1,"Ram","Pune");
	}

	
	
	@PostMapping("/usrs")
	public List<User> usrs() {
		User u1 = new User(2,"Sham","Nashik");
		User u2 = new User(3,"Vijay","Kalyan");
		User u3 = new User(4,"Binod","Fulera");
		
		List<User> users = Arrays.asList(u1,u2,u3);
		return users;
		
	}
	
	@GetMapping("/hello/{nm}")
	public String hello(@PathVariable("nm") String name) {
		
		return "Hello "+name;
	}
	
	@GetMapping("/hello2")
	public String Hello2(@RequestParam("fnm") String fname) {
		return "Hello "+ fname ;
	}
	
	@GetMapping("/user")
	public String user(@RequestBody User user) {
		
		return "You have added "+ user.getAdd(); 
	}

	
	
}

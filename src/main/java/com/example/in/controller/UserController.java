package com.example.in.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.in.model.Doctor;
import com.example.in.model.user;
import com.example.in.repository.userrepository;
//import com.example.in.repository.userrepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api/v1")
public class UserController {
	
//	@Autowired
//	private userrepository userrepo;
	
	@Autowired
	private userrepository userrepo;
	
	@GetMapping("/user")
	public List<user> getalluser() {
		return userrepo.findAll();
	}
	
	@PostMapping("/user")
	public ResponseEntity<user> registration(@RequestBody user user) {
		return ResponseEntity.ok(userrepo.save(user));
		}
	
	@PostMapping("login")
	public boolean login(@RequestBody user users){
		String email=users.getEmailid();
		System.out.println(email);
		Optional<user> userdata1=userrepo.findById(email);
		user userdata=userrepo.findByEmailid(email);
		System.out.println(userdata);
		System.out.println(users.getPassword());
		System.out.println(userdata.getPassword());
		if(users.getPassword().equals(userdata.getPassword()))
		{
			System.out.println("hey...");
			return true;
		}
		else {
			System.out.println("bye...");
			return false;
		}
	}

}

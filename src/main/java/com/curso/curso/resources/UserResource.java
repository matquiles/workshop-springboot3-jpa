package com.curso.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Matheus", "mquiles@gmail.com", "2222", "1111");
		
		return ResponseEntity.ok().body(u);
		
	}
	

}

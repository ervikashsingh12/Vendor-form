package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	@Autowired
	private UserDao service;
	
	//retriveAllUser
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id){
		User user = service.findOne(id);
		if(user == null)
			throw new UserNotFoundException("id-" + id);
			return user;
	}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		User user = service.deleteById(id);
		if(user == null)
			throw new UserNotFoundException("id-" + id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> creatUser(@Validated @RequestBody User user) {
		User savedUser = service.save(user);
		//Created
		java.net.URI location = ServletUriComponentsBuilder.fromCurrentRequest()
		.path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	//retriveUser{id}

}
package com.paypal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.model.User;

@RestController
public class TaskController {

	@PostMapping("/addTask")
	public ResponseEntity<User> addTaskHandler(@RequestBody User user){
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
}

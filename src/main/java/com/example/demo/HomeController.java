package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CRUD;

@RestController("/home")
public class HomeController {
	//Using generated security password: e171408d-95d3-48eb-80da-f5f21c53dfd3
	@Autowired
	CrudService cs;
	
	@PostMapping("/add")
	public CRUD add(@RequestBody CRUD obj) {
		return cs.add(obj);
	}

	@GetMapping("/find/{username}")
	public CRUD find(@PathVariable("username") String  username){
		CRUD obj = cs.find(username);
		return obj;
	}
}

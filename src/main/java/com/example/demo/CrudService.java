package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CRUD;

@Service
public class CrudService {
	
	@Autowired
	Repo repo;
	
	public CRUD add(CRUD obj) {
		return repo.save(obj);
	}
	
	public CRUD find(String username) {
		return repo.findCrudByUsername(username).orElseThrow(()-> new UserNotFound("user not found"));
	}

}

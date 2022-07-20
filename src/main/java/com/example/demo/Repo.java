package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CRUD;


@Repository
public interface Repo extends JpaRepository<CRUD, Integer> {
	
	Optional<CRUD> findCrudByUsername(String username);

	

}

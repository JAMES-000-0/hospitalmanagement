
package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.sampleentity;
import com.example.demo.repository.samplerepository;

@RestController
public class samplecontroller {

@Autowired
public samplerepository repo;


@PostMapping("/add")
public String addanimal(@RequestBody sampleentity ae) {
try {
	repo.save(ae);
	return "animal added sucessfully";
}catch(Exception e) {
	e.printStackTrace();
}

return null;
}

@PutMapping("/update")
public String updateanimal(@RequestBody sampleentity ae) {
try {
	repo.save(ae);
	return "animal update sucessfully";
}catch(Exception e) {
	e.printStackTrace();
}

return null;
}

@GetMapping("/get")
public List<sampleentity> updateanimal() {
try {
	return repo.findAll();
}catch(Exception e) {
	e.printStackTrace();
}

return null;
}


@DeleteMapping("/deletesample/{id}")
public String deleteanimal(@PathVariable int id) {
	try {
		sampleentity en = repo.getById(id);
		repo.delete(en);
		return "animal deleted successfully";
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}

@GetMapping("/getsample/{id}")
public List<sampleentity> updateanimal(@PathVariable int id){
	try {
		return repo.findById(id);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
		
}
}




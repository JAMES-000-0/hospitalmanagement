package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class sampleentity {
	@Id
private int id;
private String name;
private int age;

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public sampleentity(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public sampleentity() {
	super();
	// TODO Auto-generated constructor stub
}

}

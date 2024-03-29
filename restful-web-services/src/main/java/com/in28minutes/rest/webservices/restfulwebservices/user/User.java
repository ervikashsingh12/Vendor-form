package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

//import javax.validation.constraints.Size;
//import javax.validation.constraints.Past;

public class User {
	private Integer id;
	
	//@Size(min=2, message=""Name should have 2 characters)
	private String name;
	//@Past
	private Date birthdate;
	
	public User(Integer id, String name, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

}

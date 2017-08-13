package com.demo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/*
@NamedQueries(
		{
			@NamedQuery(
					name = "findPersonByName",
					query = "from Person p where p.name = :name"
					
					)
			
		}
		)
	*/
@Entity
@Table(name="person_details")
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

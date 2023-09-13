package com.rahul.CrudOperation.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subject")//table name as SUbject--it is use of hibernate to create table through boot
public class Subject {
	
	@Id //used for primary key-ths annoation works has primarykey, id has a attribute
	private String id;
	public Subject() {
		
	}
	public Subject(String id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;

}

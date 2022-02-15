package com.te.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
public class Employees {
	@Id
	private int id;
	private String name;
	private String phoneNumber;

//	public Employees(int id, String name, String phoneNumber) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//	}
//
//	@Override
//	public String toString() {
//		return "Employees [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
//	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}

}

package com.te.Hibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HibernateSecond {
	@Id
	private int id;
	private String name;

	public HibernateSecond(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public HibernateSecond() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "HibernateSecond [id=" + id + ", name=" + name + "]";
	}

}

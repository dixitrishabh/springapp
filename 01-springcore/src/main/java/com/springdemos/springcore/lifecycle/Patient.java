package com.springdemos.springcore.lifecycle;

public class Patient {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside method");
	}
	
	public void hi() {
		System.out.println("Inside method .. hi");
	}
	
	public void bye() {
		System.out.println("Inside method..bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	

}

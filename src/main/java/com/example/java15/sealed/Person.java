package com.example.java15.sealed;

public abstract sealed class Person permits Employee, Manager {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

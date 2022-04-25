package com.example.java15.sealed;

public final class Employee extends Person {
	private String sector;

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
}

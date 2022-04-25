package com.example.java15.sealed;

public non-sealed class Manager extends Person {
	private String sector;

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
}

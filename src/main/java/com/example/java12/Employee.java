package com.example.java12;

public class Employee {
	private int id;
	private String rank;
	private int salary;

	public Employee(int id, String rank, int salary) {
		super();
		this.id = id;
		this.rank = rank;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

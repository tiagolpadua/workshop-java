package com.example.java14;

public class Records {
	
	public record User(int id, String password) { };
	
	public static void main(String[] args) {
		User user1 = new User(0, "UserOne");
		
		System.out.println(user1);
	}
}

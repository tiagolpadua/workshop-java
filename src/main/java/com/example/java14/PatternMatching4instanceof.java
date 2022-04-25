package com.example.java14;

public class PatternMatching4instanceof {
	public static void main(String[] args) {
		Object obj = "foo";
		
		// Old
		if (obj instanceof String) {
		    String str = (String) obj;
		    int len = str.length();
		    System.out.println(len);
		}
		
		// New
		if (obj instanceof String str) {
		    int len = str.length();
		    System.out.println(len);
		}
	}
}

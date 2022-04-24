package com.example.java12;

public class NewStringMethods {
	public static void main(String[] args) {
		String text = "Hello!\nThis is Java 12.";

		text = text.indent(4);
		System.out.println(text);

		text = text.indent(-2);
		System.out.println(text);
		
		text = "Java 12";
	    String transformed = text.transform(value ->
	      new StringBuilder(value).reverse().toString()
	    );
	    
	    System.out.println(text + " - " + transformed);
	}
}

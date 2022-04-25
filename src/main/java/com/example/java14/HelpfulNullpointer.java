package com.example.java14;

public class HelpfulNullpointer {
	
	public record User(int id, String password) { };
	
	public static void main(String[] args) {
		int[] arr = null;
		arr[0] = 1;
		
//      Antes:
//		  Exception in thread "main" java.lang.NullPointerException
//		  at com.example.java14.HelpfulNullpointer.main(HelpfulNullpointer.java:9)
		
//		Agora:
//		  Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "arr" is null
//		  at com.example.java14.HelpfulNullpointer.main(HelpfulNullpointer.java:9)
		
		System.out.println(arr);
	}
}

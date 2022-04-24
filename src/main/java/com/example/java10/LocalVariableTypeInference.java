package com.example.java10;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalVariableTypeInference {
	
//	public var = "hello"; // error: 'var' is not allowed here

	public static void main(String[] args) {
//		String message = "Tchau Java 9";
		var message = "Tchau Java 9";
		
		System.out.println(message);
		System.out.println(message.getClass().toString());
		
//		Map<Integer, String> idToNameMap = new HashMap<>();
		var idToNameMap = new HashMap<Integer, String>();
		
		System.out.println(idToNameMap.getClass().toString());
		
//		Usos não permitidos:
		
//		var n; // error: cannot use 'var' on variable without initializer
		
//		var emptyList = null; // error: variable initializer is 'null'
		
//		var p = (String s) -> s.length() > 10; // error: lambda expression needs an explicit target-type
		
//		var arr = { 1, 2, 3 }; // error: array initializer needs an explicit target-type
		
//		Atenção:
		var numList1 = new ArrayList<>();		
		numList1.add(10);
		numList1.add("Foo");
		
		var numList2 = new ArrayList<Integer>();
		numList2.add(10);
//		numList2.add("Foo");
	}
}

package com.example.extra;

import java.util.List;

public class ToArrayGenerator {
	public static void main(String[] args) {
		var l = List.of(1, 2, 3, 4, 5, 6);
		var arr1 =  l.toArray();
		var arr2 =  l.toArray(Integer[]::new);
		var arr3 =  l.stream()
				.map(x -> x.toString())
//				.map(Object::toString)
				.toArray((x) -> new String[x]);
//				.toArray(String[]::new);
		
		System.out.println(arr1.getClass().getTypeName());
		System.out.println(arr2.getClass().getTypeName());
		System.out.println(arr3.getClass().getTypeName());
	}
}

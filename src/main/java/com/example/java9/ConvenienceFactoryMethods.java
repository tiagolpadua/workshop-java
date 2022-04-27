package com.example.java9;

import java.util.ArrayList;
import java.util.List;

public class ConvenienceFactoryMethods {
	
	static final double PI = 3.14;

	public static void main(String[] args) {
		// ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("ArrayList : " + list.toString());

		List<Integer> unmodifiableList = List.of(1, 2, 3);
		
//		unmodifiableList.add(10);

		List<Integer> modifiableList = new ArrayList<>(List.of(1, 2, 3));
//
		modifiableList.add(4);

		System.out.println("unmodifiableList : " + unmodifiableList.toString());
		System.out.println("modifiableList : " + modifiableList.toString());
	}

}

package com.example.java9;

import java.util.ArrayList;
import java.util.List;

public class JEP269 {

	public static void main(String[] args) {
		// ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		System.out.println("ArrayList : " + list.toString());

		// List.of

		// ---
		List<Integer> unmodifiableList = List.of(1, 2, 3);

		List<Integer> modifiableList = new ArrayList<>(unmodifiableList);

		modifiableList.add(4);

		System.out.println("unmodifiableList : " + unmodifiableList.toString());
		System.out.println("modifiableList : " + modifiableList.toString());
		// ---
	}

}

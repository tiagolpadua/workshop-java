package com.example.java11lts;

import java.util.List;
import java.util.stream.Collectors;

public class NewStringMethods {
	public static void main(String[] args) {
		// isBlank, lines, strip, stripLeading, stripTrailing e repeat.

		String multilineString = "This example helps \n \n developers \n explore Java.";
		List<String> lines = multilineString.lines() //
				.filter(line -> !line.isBlank()) //
				.map(String::strip) //
				.collect(Collectors.toList());

		System.out.println(lines);
	}
}

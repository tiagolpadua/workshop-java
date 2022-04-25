package com.example.modules.matching4switch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatternMatching4Switch {

	public static String typedPatternMatching(Object o) {
		return switch (o) {
		case null -> "I am null";
		case String s -> "I am a String. My value is " + s;
		case Integer i -> "I am an int. My value is " + i;
		default -> "I am of an unknown type. My value is " + o.toString();
		};
	}

	public static void main(String[] args) {
		System.out.println(typedPatternMatching(null));
		System.out.println(typedPatternMatching("Foo"));
		System.out.println(typedPatternMatching(10));
		System.out.println(typedPatternMatching(false));
	}
}

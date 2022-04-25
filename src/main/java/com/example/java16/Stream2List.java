package com.example.java16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2List {
	public static void main(String[] args) {
		List<String> integersAsString = new ArrayList<>(Arrays.asList("1", "2", "3"));
		
		// Old
		List<Integer> ints1 = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
		
		// New
		List<Integer> ints2 = integersAsString.stream().map(Integer::parseInt).toList();
	}
}

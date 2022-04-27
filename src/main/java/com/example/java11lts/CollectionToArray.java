	package com.example.java11lts;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
	public static void main(String[] args) throws IOException {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = sampleList.toArray(String[]::new);

		System.out.println(Arrays.toString(sampleArray));
	}
}

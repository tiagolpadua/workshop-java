package com.example.java11lts;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarForLambda {
	public static void main(String[] args) throws IOException {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String resultString = sampleList.stream()
		  .map((var x) -> x.toUpperCase())
//		  .map((x) -> x.toUpperCase())
//		  .map((@Nonnull var x) -> x.toUpperCase())
		  .collect(Collectors.joining(", "));

		System.out.println(resultString);
	}
}

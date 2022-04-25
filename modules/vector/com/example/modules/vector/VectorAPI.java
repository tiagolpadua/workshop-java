package com.example.modules.vector;

import java.util.Arrays;

import jdk.incubator.vector.IntVector;

public class VectorAPI {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = {5, 6, 7, 8};
		var c = new int[a.length];

		var vectorA = IntVector.fromArray(IntVector.SPECIES_128, a, 0);
		var vectorB = IntVector.fromArray(IntVector.SPECIES_128, b, 0);
		var vectorC = vectorA.mul(vectorB);
		vectorC.intoArray(c, 0);
		
		System.out.println(Arrays.toString(c));
	}
}

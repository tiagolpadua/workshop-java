package com.example.extra;

import java.util.Random;

public class VarInterface {

	public static void main(String[] args) {
		var myShape = getShape((new Random()).nextBoolean());
		System.out.println(myShape.getClass().getName());
	}
	
	public static Shape getShape(boolean option) {
		if(option == true) {
			return new Square();
		} else {
			return new Circle();
		}
	}

}

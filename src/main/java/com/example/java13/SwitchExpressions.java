package com.example.java13;

public class SwitchExpressions {
	public static void main(String[] args) {
		var me = 4;
		var operation = "squareMe";
		var result = switch (operation) {
		case "doubleMe" -> {
			yield me * 2;
		}
		case "squareMe" -> {
			yield me * me;
		}
		default -> me;
		};

		System.out.println(result);
	}
}

package com.example.java13;

import java.time.Month;

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

		System.out.println("result: " + result);

		var month = Month.AUGUST;

		// Switch Expression deve ser exaustivo
		var mres = switch (month) {
		case JANUARY, JUNE, JULY -> 3;
		case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
		case MARCH, MAY, APRIL, AUGUST -> 2;
		};

		System.out.println("mres: " + mres);
	}
}

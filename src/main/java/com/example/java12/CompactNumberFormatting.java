package com.example.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {
	public static void main(String[] args) {
		print("en", "US");
		System.out.println("\n");
		print("pt", "BR");
	}

	public static void print(String language, String country) {
		System.out.println("language: " + language + " - country: " + country);
		NumberFormat likesShort = NumberFormat.getCompactNumberInstance(new Locale(language, country),
				NumberFormat.Style.SHORT);
		likesShort.setMaximumFractionDigits(2);

		System.out.println("likesShort.format(2592): " + likesShort.format(2592));

		NumberFormat likesLong = NumberFormat.getCompactNumberInstance(new Locale(language, country),
				NumberFormat.Style.LONG);
		likesLong.setMaximumFractionDigits(2);

		System.out.println("likesLong.format(2592): " + likesLong.format(2592));
	}
}

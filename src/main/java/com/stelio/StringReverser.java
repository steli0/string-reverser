package com.stelio;

import java.security.InvalidParameterException;

public class StringReverser {
	public static String reverseString(String s) {
		if (s == null) {
			throw new NullPointerException("Parameter cannot be null");
		} else if (s.equalsIgnoreCase("")) {
			throw new InvalidParameterException("Parameter cannot be empty");
		}

		StringBuilder result = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			result.append(s.charAt(i));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverseString("Reverse this"));
	}
}

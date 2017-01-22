package edu.wit.cs.comp1050;

import java.util.Scanner;

public class LA2a {
	
	/**
	 * Number of digits in a valid value sequence
	 */
	public static final int SEQ_DIGITS = 10;
	
	/**
	 * Error for an invalid sequence
	 * (not correct number of characters
	 * or not made only of digits)
	 */
	public static final String ERR_SEQ = "Invalid sequence";
	
	/**
	 * Error for an invalid pin
	 * (not made entirely of 
	 * uppercase letters)
	 */
	public static final String ERR_PIN = "Invalid PIN";
	
	/**
	 * Converts an uppercase letter
	 * to the corresponding number on
	 * a standard phone...
	 * 
	 * 1:
	 * 2: ABC
	 * 3: DEF
	 * 
	 * 4: GHI
	 * 5: JKL
	 * 6: MNO
	 * 
	 * 7: PQRS
	 * 8: TUV
	 * 9: WXYZ
	 * 
	 * *:
	 * 0: +
	 * #:
	 * 
	 * @param c assumed to be uppercase letter
	 * @return corresponding phone number
	 */
	public static int letterToPhone(char c) {
		return 0; // replace with your code
	}
	
	/**
	 * Takes an input PIN and produces a response
	 * via first converting each character via phone
	 * number, then using that as an index
	 * to a value sequence
	 * 
	 * @param pin input PIN (assumed to be uppercase letters)
	 * @param values input value sequence
	 * @return response
	 */
	public static int[] getResponse(String pin, int[] values) {
		int[] response = new int[pin.length()];
		
		// write your code here
		
		return response;
	}
	
	/**
	 * Returns true if the length of the
	 * input string is equal to the input
	 * parameter
	 * 
	 * @param s input string
	 * @param k length to check
	 * @return true if length of string 
	 */
	public static boolean stringIsKDigits(String s, int k) {
		return false; // replace with your code
	}
	
	/**
	 * Returns true if all the characters
	 * in the input string are '0' through '9'
	 * 
	 * @param s input string
	 * @return true if all characters in s are digits
	 */
	public static boolean allDigits(String s) {
		return false; // replace with your code
	}
	
	/**
	 * Returns true if all the characters
	 * in the input string are 'A' through 'Z'
	 * 
	 * @param s input string
	 * @return true if all characters are uppercase letters
	 */
	public static boolean allUppercaseLetters(String s) {
		return false; // replace with your code
	}
	
	/**
	 * Converts a string of digits to an
	 * array of integers (e.g. "12" -> {1, 2})
	 * 
	 * Assumes string is comprised of only digits!
	 * 
	 * @param s digit string
	 * @return corresponding integer array
	 */
	public static int[] digitStringToIntArray(String s) {
		return null; // replace with your code
	}
	
	/**
	 * Returns how many times a value
	 * occurs within an array
	 * 
	 * @param value needle
	 * @param values haystack
	 * @return how many times the needle occurs in the haystack
	 */
	public static int countValues(int value, int[] values) {
		return 0; // replace with your code
	}
	
	/**
	 * Returns how many ways the response could have been
	 * produced from a given value sequence
	 * 
	 * @param response output
	 * @param values value sequence
	 * @return how many PINs could have produced the same response given the value sequence
	 */
	public static int numPossible(int[] response, int[] values) {
		return 0; // replace with your code
	}
	
	/**
	 * Inputs a value sequence and PIN,
	 * outputs challenge response
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter value sequence: ");
		final String seq = in.nextLine();
		
		System.out.printf("Enter PIN: ");
		final String pin = in.nextLine();
		
		// write your code here
	}

}

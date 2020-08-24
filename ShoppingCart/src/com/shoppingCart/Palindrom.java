package com.shoppingCart;

import java.util.Scanner;
import java.util.Stack;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("Enter any String :");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		Stack<Character> stack = new Stack<>();

		// Push all chars in stack
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}

		String reverseString = "";
		// Pop all chars from stack one by one and build reverse string
		while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}

		// check palindrome string
		if (input.equals(reverseString)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
		sc.close();
	}

}

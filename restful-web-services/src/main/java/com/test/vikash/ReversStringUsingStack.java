package com.test.vikash;

import java.util.*;

public class ReversStringUsingStack {
	
	private static String reverseString(String str) {
		char[] reverseString = new char[str.length()];
		Stack<Character> stack= new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		int i=0;
		while(!stack.isEmpty()) {
			reverseString[i++]= stack.pop();
		}
		
		return new String(reverseString) ;
	}

	public static void main(String[] args) {
		String str="Vikash";
		System.out.println("Original String==> " + str);
		System.out.println("Reverse String==> "+reverseString(str));
	}

	

	

}

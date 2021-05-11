package com.test.vikash;

import java.util.Arrays;
import java.util.List;

public class StringMethods {
	public static void main(String[] args) {
		Integer [] arr = {19,20,25,35,22,34,43};
		List<Integer> ls= Arrays.asList(arr);
		ls.stream().filter(l -> l%2==0).forEach(System.out::println);
				
		
	}

}

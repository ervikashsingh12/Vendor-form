package com.test.vikash;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestStringJava8 {

	public static void main(String[] args) {

		List<String> alist= Arrays.asList("Bangalore", "Etawah", "UttarPradesh") ;
		Stream<String> s1 = alist.stream().filter(list ->  list.startsWith("U")); 
		List<String> test = s1.collect(Collectors.toList());
		System.out.println(test);
		 for(String num: test){
	            System.out.println(num.length());
	        }
	}

}

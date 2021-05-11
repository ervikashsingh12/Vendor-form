package com.test.vikash;

import java.util.*;

public class PrintDuplicate {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Vikash");
		list.add("Singh");
		list.add("Harsh");
		list.add("Singh");
		
		Set<String> s1 = new HashSet<>();
		for(String name: list) {
			if(s1.add(name)==false);
			System.out.println(name);
		}
	}

}

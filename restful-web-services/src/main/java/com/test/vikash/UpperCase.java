package com.test.vikash;

import java.util.*;

public class UpperCase {

	public static void main(String[] args) {
		  
			    List<String> friends = Arrays.asList("Ross", "Chandler", "CSS",
			        "Monica", "Joey", "Rachel");

			    friends.stream().map(name -> name.toUpperCase())
			        .forEach(name -> System.out.print(name + " "));

			  }

}

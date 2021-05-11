package com.test.vikash;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class Employee 
{
	public static void main(String[] args) 
    {
		 List<User> persons = Arrays.asList(
	                new User("Jack", "pete2@post.com", 5000),
	                new User("Peter", "pete2@post.com", 60000),
	                new User("Lucy", "lucy17@gmail.com", 2000),
	                new User("Robert", "bob56@post.com",500000),
	                new User("Martin", "mato4@imail.com", 40000)
	        );
	        
	        List<User> result = persons.stream()
	                .filter(person -> person.getEmail().matches(".*post\\.com"))
	                .collect(Collectors.toList());
	        
	        result.forEach(p -> System.out.println(p.getName()));
       
    }
 
	
}
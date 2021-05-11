package com.test.vikash;

public class ReverseWord {
	 static String reverseWord(String str) {
		 int i = str.length() - 1; 
		 
		    int start, end = i + 1; 
		    String result = ""; 
		      
		    while(i >= 0) 
		    {
		        if(str.charAt(i) == ' ') 
		        { 
		            start = i + 1; 
		            System.out.println(start);
		            while(start != end) 
		                result += str.charAt(start++); 
		              
		            result += ' '; 
		              
		            end = i; 
		        } 
		        i--; 
		    } 
		      
		    start = 0; 
		    while(start != end) 
		        result += str.charAt(start++); 
		      
		    return result; 
		}
		 
	
	public static void main(String[] args) {
		String str= "My Name is Vikash";
		 System.out.print(reverseWord(str));
	}

	

}

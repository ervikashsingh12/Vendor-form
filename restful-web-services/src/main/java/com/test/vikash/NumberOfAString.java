package com.test.vikash;

public class NumberOfAString {
	static int MAX = 26;
	static void numbersString(String str, int n)
	{
		int max[] = new int[MAX] ; 
		 for (int i = 0; i < n; i++)  
	        {  
	            max[str.charAt(i) - 'a']++;  
	        } 
		  for (int i = 0; i < MAX; i++) 
	        {   
	            if (max[i] == 0)
	                continue;  
	            System.out.print((char)(i + 'a') +""+ max[i]);  
	        } 
	}
	  public static void main (String[] args) 
	    {  
	        String str = "geeksforgeeks";  
	        int n = str.length();
	        numbersString(str, n);  
	    }

	
}

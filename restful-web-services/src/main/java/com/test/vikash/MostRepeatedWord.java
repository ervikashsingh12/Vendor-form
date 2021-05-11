package com.test.vikash;

import java.util.Arrays;

public class MostRepeatedWord {
	static int mostRepeated(int[] arr, int len) {
		Arrays.sort(arr); 
		int max_count = 1, res = arr[0], curr_count = 1; 
		 for (int i = 1; i < len; i++) 
	        { 
	            if (arr[i] == arr[i - 1]) 
	                curr_count++; 
	            else 
	            { 
	                if (curr_count > max_count) 
	                { 
	                    max_count = curr_count; 
	                    res = arr[i - 1]; 
	                } 
	                curr_count = 1; 
	            } 
	        } 
		 if (curr_count > max_count) 
	        { 
	            max_count = curr_count; 
	            res = arr[len - 1]; 
	        } 
		
		
		return res;
	}
	public static void main(String[] args) {
		 int arr[] = {1, 5, 2, 1, 3, 2, 1}; 
		 int len= arr.length;
		 System.out.println(mostRepeated(arr, len));
		
	}


	
}

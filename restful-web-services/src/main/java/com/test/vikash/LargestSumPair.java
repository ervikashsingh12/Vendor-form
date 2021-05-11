package com.test.vikash;

public class LargestSumPair {
	static int largestSumPair(int[] arr) {

		int maxFirst, maxSec;
		if(arr[0]>arr[1]) {
			maxFirst = arr[0]; 
			maxSec = arr[1];
			
		}else {
			maxFirst = arr[1]; 
			maxSec = arr[0]; 
			
		}
		for(int i=2; i<arr.length; i++) {
			if(arr[i]>maxFirst) {
				maxSec = maxFirst; 
				maxFirst = arr[i]; 
			}
			else if(arr[i]>maxSec && arr[i]!= maxFirst)
			maxSec = arr[i];
			
		}
		return (maxFirst + maxSec);
	}
	public static void main(String[] args) {
		int arr[]= {1,4,6,7,2,9,3};
		System.out.println(largestSumPair(arr));
	}

	

}
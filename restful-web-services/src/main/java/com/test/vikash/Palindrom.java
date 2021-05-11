package com.test.vikash;

public class Palindrom {
	 
	public static void main(String[] args) {
		int sum = 0;
		int n= 4541;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			sum=(sum*10)+rem; 
			n=n/10;  
		}
		if(temp==sum) {
			System.out.println(temp+"Number is Palindrom");
		}else
			System.out.println(temp+"Not Palindrom");
	}

}

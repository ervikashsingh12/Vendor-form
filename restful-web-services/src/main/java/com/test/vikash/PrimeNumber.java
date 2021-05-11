package com.test.vikash;

public class PrimeNumber {
	private static void checkPrime(int n) {
		int flag = 0;
		int m=n/2;
		if(n==0|| n==1) {
			System.out.println(n+ "Number is not a prime");
		}
		else {
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.println(n+ "Number is not a prime");
					flag=1;      
				    break;  
				}
			}
			if(flag==0) {
				System.out.println(n+ "Number is prime");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		checkPrime(1);  
		  checkPrime(3);  
		  checkPrime(17);  
		  checkPrime(20);  
		
	}

	

}

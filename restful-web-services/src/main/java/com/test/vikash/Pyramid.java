package com.test.vikash;

public class Pyramid {
	public static void main(String[] args) {
		int n=7; int k=0;
		for(int i=1; i<=n; i++, k=0) {
			for(int j=1; j<=n-i; j++) {
			System.out.print("  ");	
			}
			while(k != 2 * i-1) {
				System.out.print("* ");
				++k;
			}
			System.out.println(" ");
		}
		System.out.println("Reverse Pyramid");
		
		for(int i=n; i>=1; i--, k=0) {
			for(int j=1; j<=n-i; j++) {
			System.out.print("  ");	
			}
			 for(int j=i; j <= 2 * i - 1; j++) {
			        System.out.print("* ");
			      }

			      for(int j = 0; j < i - 1; j++) {
			        System.out.print("* ");
			      }
			System.out.println(" ");
		
		}
		
		System.out.println("Testing");
		for(int t=1; t<=n; ++t) {
			System.out.print(t);
		}
	}

}

package com.test.vikash;

public class PatternProgram {
	public static void main(String[] args) {
		int n=5; int k=0;
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("# ");
			}
			System.out.println(" ");
		}
		System.out.println("Reverse Tringle");
		for(int i1=n; i1>=1; --i1) {
			for(int j1=1; j1<=i1; ++j1) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Tringle Pyramid");
		
		for(int i2=1; i2<=n; i2++, k=0) {
			for(int j2=1; j2<=n-i2; j2++) {
				System.out.print("  ");				
			}
			while (k != 2 * i2 - 1) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();
		}
			
	}

}

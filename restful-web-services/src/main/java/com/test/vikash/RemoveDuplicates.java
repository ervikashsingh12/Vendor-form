package com.test.vikash;

public class RemoveDuplicates {
	public static String removeDuplicates(String str) {
	    if (str.isEmpty()) {
	        return str;
	    }
	    char[] c1 = str.toCharArray();
	    char lastchar = c1[0];

	    int k = 1;
	    for (int i = 1; i < c1.length; i++) {
	        if (k > 0 && c1[i] == c1[k - 1]) {
	            lastchar = c1[k - 1];
	            while (k > 0 && c1[k - 1] == lastchar) {
	                k--;
	            }
	        } else if (c1[i] == lastchar) {
	            // Don't copy to output
	        } else {
	            c1[k++] = c1[i];
	        }
	    }
	    return new String(c1, 0, k);
	}
	
	

	public static void main(String[] args) {
		String str= "acaaabbbacdddd";
		System.out.println(removeDuplicates(str));
	}

}

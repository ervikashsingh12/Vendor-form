package com.test.vikash;

public class BracketBlance {
	static boolean idBalance(String exp1) {
		boolean flag = true;  
	    int count = 0; 
	    for(int i = 0; i < exp1.length(); i++) {
	    	if (exp1.charAt(i) == '(')  
	        {  
	            count++;  
	        }  
	        else
	        {  
	            count--;  
	        } 
	    	 if (count < 0) 
	         {    
	             flag = false;  
	             break;  
	         }
	    	
	    }
	    if (count != 0)  
	    {  
	        flag = false;  
	    } 
		
		return flag;
	}
	public static void main(String[] args) {
		String exp1 = "((()))()()"; 
		if(idBalance(exp1)) {
			System.out.println("Balanced");
		}else
			System.out.println("Not Balance");
		
	}

	

}
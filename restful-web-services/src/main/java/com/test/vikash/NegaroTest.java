package com.test.vikash;

public class NegaroTest {

	public static void main(String[] args) {
		String str = "my_name_is_vikash";
		
		String arr[] = str.split("_");
		String result=  arr[0];
		int count = 0;
		for( String name: arr){
		if(count>0){
		result += name.substring(0,1).toUpperCase() + name.substring(1);
		}
		count++;
		}
		System.out.println(result);
		
		String str1="myNameIsVikash";
		String newStr1 = "";
		for(int i=0; i<str1.length();i++){
		if(Character.isUpperCase(str1.charAt(i))) {
		           String newStr =   "_" + str1.charAt(i);
		             newStr1 += newStr.toLowerCase();
		        }
		else {
			newStr1 += result.charAt(i);
		}
		}
		System.out.println(newStr1);
	}

}

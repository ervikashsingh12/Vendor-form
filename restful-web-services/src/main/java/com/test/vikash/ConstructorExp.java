package com.test.vikash;

class  Test{
	int num;
	String name;
	
		Test(String name){
			this.name=name;
	}	
}
public class ConstructorExp{
	public static void main(String[] args) {
		Test exp= new Test("Vikash");
		System.out.println(exp.num);
		System.out.println(exp.name);
}	
}

	



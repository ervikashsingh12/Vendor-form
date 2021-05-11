package com.test.vikash;

public class IntrTest {
	class Parent {

		int x;
		private int y;

		void m1(){
		}

		public void m2(){
		}

		private void m3(int x){
		System.out.println("x = " + x);
		}

		}//end Parent

		class Child extends Parent{

		public void main(String[] args){
		Parent p1 = new Parent();
		p1.x = 10;
		p1.y = 20;
		p1.m3(p1.x);
		p1.m3(p1.y);
		}//end main

		void someMethod(){

		Parent p1 = new Parent();
		Child c1 = new Child();
		Parent p2 = new Child();
		Child c2 = (Child) new Parent();

		}//end someMethod

		}//end Child

}

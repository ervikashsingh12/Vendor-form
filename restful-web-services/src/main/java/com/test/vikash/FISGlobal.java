package com.test.vikash;

import java.util.*;

public class FISGlobal {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		System.out.println(Collections.binarySearch(list, 2));
	}

}

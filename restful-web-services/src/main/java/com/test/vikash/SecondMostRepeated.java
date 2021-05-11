package com.test.vikash;

import java.util.*;

public class SecondMostRepeated {
	static String secMostRepeated(Vector<String> ls1) {
	HashMap<String, Integer> hm= new HashMap<String, Integer>(ls1.size()){
	@Override
	 public Integer get(Object key) { 
        return containsKey(key) ? super.get(key) : 0; 
   } 
	};
	for(int i=0; i<ls1.size(); i++) 
		hm.put(ls1.get(i), hm.get(ls1.get(i))+1);
	int first_max = Integer.MIN_VALUE, sec_max= Integer.MIN_VALUE;
	Iterator<Map.Entry<String, Integer>> itr= hm.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<String, Integer> entry= itr.next();
		int value = entry.getValue();
		if(value>first_max) {
			sec_max=first_max;
			first_max=value;
		}
		else if
		(value > sec_max && value != first_max);
		 sec_max = value;
	}
	itr=hm.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<String, Integer> entry= itr.next();
		int value = entry.getValue();
		if(value==sec_max)
			return entry.getKey();
	}
		
	

		
		return null;
	}
	public static void main(String[] args) {
		String arr[]= {"aaa", "bbb", "ccc", "bbb", 
		         "aaa", "aaa"};
		List<String> ls1= Arrays.asList(arr);
		System.out.println(secMostRepeated(new Vector<> (ls1)));
	}

	

}

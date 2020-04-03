package com.streamjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashmapeDemo {

	private int x=10;
	
	class Testdata{
		
		int yy=x+1;
	}
	
	public static void revers() {
		
		List list =  new ArrayList<>();
		list.add("a1aa");
		list.add("bbb");
		

		System.out.println("===1==>>"+list);
		
		Collections.reverse(list);
		
		
		System.out.println("===2==>>"+list);
	}
	public static void main(String[] args) {
		
		revers();
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("aaa", "aaa");
		hm.put("aaa", "bbb");
	//	System.out.println(hm);
		//System.out.println(hm.get("aaa"));
		//System.out.println("======>>>>"+Sayhi("manish"));
		
		testString();
		
	}
	public static void testString() {
		
		String x="abc";
		
		String y="abc";
		String z=new  String("abc");
		System.out.println(x.equals(y));
		System.out.println(x==y);

		System.out.println(x.equals(z));
		System.out.println(x==z);

	}

	public static String Sayhi(String name) {

		try {
			return "Hi " + name;
		} finally {
			// TODO: handle finally clause
			System.out.println("Finally block ....");
		}
	}
}

package com.streamjava8;

public class testjava {
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}

	private static long factorial(int i) {
		// TODO Auto-generated method stub
		if (i==1) return 1;
		
		return i*factorial(i-1);
	}

}

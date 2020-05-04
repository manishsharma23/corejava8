package com.polymorphism;

public class Child extends Parent{

	@Override
	public void display(int x, String y) {
		// TODO Auto-generated method stub
		//super.display(x, y);
		System.out.println("Child...display..");
	}
	private void privateData() {
		System.out.println(" provate data from P");
	}

	
	public void xyz(int x, String y) {

		System.out.println("Child..xyz....");
	}

}

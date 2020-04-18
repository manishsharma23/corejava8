package com.forloop.pattern;

public class TriagleShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// simpleTriagle();
		// System.out.println("=============================");

		// simpleTriagle1();

		// System.out.println("=============================");

		//simpleTriagle3();

		System.out.println("=============================");

		// simpleTriagle4();

		 showDiamond();
	}

	private static void showDiamond() {
		int n = 10;
		char c = '*';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	
	public static void simpleTriagle3() {
		for (int x = 1; x < 10; x++) {
			for (int y = 10; y >= x; y--)
				System.out.print(" ");

			for (int z = 10; z <= x; z--)
				System.out.print(" * ");

			for (int z1 = 2; z1 <= x; z1++)
				System.out.print(" * ");

			System.out.println(" ");
		}
		

		for (int x = 9; x >0; x--) {
			for (int y = 10; y >= x; y--)
				System.out.print(" ");

			for (int z = 10; z <= x; z--)
				System.out.print(" * ");

			for (int z1 = 2; z1 <= x; z1++)
				System.out.print(" * ");

			System.out.println(" ");
		}
		
		

	

	}

	public static void simpleTriagle1() {
		for (int x = 1; x < 5; x++) {
			for (int y = 5; y >= x; y--)
				System.out.print("*");
			System.out.println(" ");
		}
	}

	public static void simpleTriagle() {
		for (int x = 1; x <= 5; x++) {
			for (int y = 0; y < x; y++)
				System.out.print("*");
			System.out.println(" ");
		}
	}

}

package me;

import java.util.Scanner;

public class xd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("True or False Logic");
		System.out.println("Choose a Logic-Operation "
				+ " [1. A > B]"
				+ " [2. A < B]"
				+ " [3. A = B]");
		int a = sc.nextInt();
		switch (a) {
		case 1: //A>B
			System.out.println("You Choose A > B");
			System.out.println("Insert First Number (A)");
			double numA1 = sc.nextDouble();
			System.out.println("Inesrt Second Number (B)");
			double numA2 = sc.nextDouble();
			boolean c = numA1 > numA2;
			System.out.println("Result " +c);
			break;
			//A>B
		case 2: //A<B
			System.out.println("You Choose A < B");
			System.out.println("Insert First Number (A)");
			double numB1 = sc.nextDouble();
			System.out.println("Inesrt Second Number (B)");
			double numB2 = sc.nextDouble();
			boolean e = numB1 < numB2;
			System.out.println("Result " +e);
			break;
			//A<B
		case 3: //A=B
			System.out.println("You Choose A = B");
			System.out.println("Insert First Number (A)");
			double numC1 = sc.nextDouble();
			System.out.println("Inesrt Second Number (B)");
			double numC2 = sc.nextDouble();
			boolean f = numC1 == numC2;
			System.out.println("Result " +f);
			break;
			//A=B
		}
	}

}

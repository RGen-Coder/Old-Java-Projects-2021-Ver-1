//Boolean and inputs
package me;
import java.util.Scanner;

public class inputtrueorflase {

	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			System.out.println("Boolean Statements a > b");//Question
			
			System.out.println("Enter First Number (a)"); //First Number
			int a = in.nextInt();//First Number Trigger
			System.out.println("Enter Second Number (b)");//Second Number
			int b = in.nextInt();//Second Number Trigger
			
			boolean c = (a>b);//Boolean Process
			System.out.println("The Answer is " +c);//The answer
		}
			
		
		
		
		
		
		
		
		

	}

}

//Calculator using switches instead of else if cause else if is longer
package me;
import java.util.Scanner;
public class switchstatmentcalcu {

	public static void main(String[] args) {
		Scanner XD = new Scanner(System.in);
		
	System.out.println("Select a Operation "
			+ " [1.Addtion]"
			+ " [2.Subratction]"
			+ " [3.Multiplication]"
			+ " [4.Division]"
			+ " [5.Exit]");
	int a = XD.nextInt();
	switch (a) {
	case 1: //Addition
		System.out.println("You Seleted Addition");
		System.out.println("Enter Your First Number");
		double num1 = XD.nextDouble();
		System.out.println("Enter Your Second Number");
		double num2 = XD.nextDouble();
		double c = num1 + num2;
		System.out.println("Your answer " +c);
		break;
		//Addition
	
	case 2: //Subtraction
		System.out.println("You Seleted Subtraction");
		System.out.println("Enter Your First Number");
		double x = XD.nextDouble();
		System.out.println("Enter Your Second Number");
		double y = XD.nextDouble();
		double z = x - y;
		System.out.println("Your answer " +z);
		break;
		//Subtraction
	
	case 3: //Multiplication
		System.out.println("You Seleted Multiplication");
		System.out.println("Enter Your First Number");
		double f = XD.nextDouble();
		System.out.println("Enter Your Second Number");
		double g = XD.nextDouble();
		double h = f * g;
		System.out.println("Your answer " +h);
		break;
		//Multiplication
	case 4: //Division
		System.out.println("You Seleted Division");
		System.out.println("Enter Your First Number");
		double q = XD.nextDouble();
		System.out.println("Enter Your Second Number");
		double w = XD.nextDouble();
		double e = q / w;
		System.out.println("Your answer " +e);
		break;
	case 5: //Exit quit
		System.out.println("Thank You");
		break;
		//Exit
	
	default:
		System.out.println("You didn't follow instructions");
		}
	

	

	}

}

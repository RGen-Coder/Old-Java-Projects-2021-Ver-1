package me;
import java.util.Scanner;
public class mathoperations {

	public static void main(String[] args) {

		      Scanner XD = new Scanner (System.in);
		      
		      System.out.println("Choose Math Operation [1. Abosulte Value] [2.Rounding Up] [3.Rounding Down]");
		      System.out.println("Choose Math Operation [4. Finding the Maximum] [5. Finding the Minimum] [6.Power Function] [7.Square Root]");
		      int a = XD.nextInt();
		      
		      
		      switch (a){
		          case 1: //Abosulte Value
		          System.out.println("You Choose Abosulte Value");
		          System.out.println("Enter Number");
		          double b = XD.nextDouble();
		          double c = Math.abs (b);
		          System.out.println("Results " +c);
		          break;         
		          //Abosulte Value
		          
		          case 2: //Rounding up
		          System.out.println("You Choose Rounding up");
		          System.out.println("Enter a Number");
		          double b1 = XD.nextDouble();
		          double c1 = Math.ceil(b1);
		          System.out.println("Results " +c1);
		          //Rounding up
		          
		          case 3://Rounding Down
		        System.out.println("You Choose Rounding down");
		        System.out.println("Enter Number");
		        double b2 = XD.nextDouble();
		        double c2 = Math.floor(b2);
		        System.out.println("Result "+c2);
		        break;   
		        //Rounding Down
		        
		        case 4://Finding the Maximum
		        System.out.println("You Choose Finding the Maximum");
		        System.out.println("Enter Number for A");
		        double b3 = XD.nextDouble();
		        System.out.println("Enter Number for B");
		        double c3 = XD.nextDouble();
		        double d3 = Math.max (b3 , c3);
		        System.out.println("The Maximum number is "+d3);
		        break;
		        //Rounding Down
		        
		        case 5: //Finding the Minimum
		        System.out.println("You choose Finding the Minimum");
		        System.out.println("Enter Number for A");
		        double b4 = XD.nextDouble();
		        System.out.println("Enter Number for B");
		        double c4 = XD.nextDouble();
		        double d4 = Math.min (b4 , c4);
		        System.out.println("The Minimum Number is "+d4);
		        break;
		        //Finding the Minimum
		        
		        case 6://Power Function
		        System.out.println("You Choose Power Function");
		        System.out.println("Enter Number");
		        double b5 =  XD.nextDouble();
		        System.out.println("To the Power of (^)");
		        double c5 =  XD.nextDouble();
		        double d5 = Math.pow (b5 , c5);
		        System.out.println("Result "+d5);
		        break;
		        //Pwer Function
		        
		        case 7: //Square root
		        System.out.println("You Choose Square root");
		        System.out.println("Enter Number");
		        double b6 = XD.nextDouble();
		        double c6 = Math.sqrt(b6);
		        System.out.println("Result " +c6);
		        break;
		      }

	}

}

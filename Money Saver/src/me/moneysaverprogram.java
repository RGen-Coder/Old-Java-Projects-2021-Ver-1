package me;
import java.util.Scanner;
public class moneysaverprogram {

	public static void main(String[] args) {
		Scanner XD = new Scanner(System.in);
        System.out.println("Welcome to Money Saver");
        System.out.println("Computation subtracted by 1 day");
        
        System.out.println("Please Enter the Amount of money you want to save");
        int a = XD.nextInt();
        
        System.out.println("Enter how many days you want to save money");
        int b = XD.nextInt();{
            for (int day = 1; day <=b; day++){
                if(day == b){
                    break;
                }
              int d = a * day;
              System.out.println("Days you saved:"+ day +" Amount of Money:" +d);
              if (day == b){
                  break;
                  
                  
              }
             
                
            }
        }

	}

}

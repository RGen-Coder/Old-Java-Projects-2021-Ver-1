package me;
//Simple Calculator Wiht Gui//
import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {
		
		//String x = JOptionPane.showInputDialog("Choose Your Operation");
		
		
			String x = JOptionPane.showInputDialog("Choose Your Operation  " 
					+  " [1(Addition)]"
					+  " [2(Subtraction)]"
					+  " [3(Multiplication)]"
					+  " [4(Division)]"
					+ "  NOTE: NO DECIMALS");
			String a = JOptionPane.showInputDialog("Enter First Number");
			String b = JOptionPane.showInputDialog("Enter Second Number");
			
			Integer.parseInt(x);
			
			
			//Add//
				if (Integer.parseInt(x) == 1) {
					Integer.parseInt(a);
					Integer.parseInt(b);
					int num1 = Integer.parseInt(a);
					int num2 = Integer.parseInt(b);
					
					int sum = num1 + num2;
					
				JOptionPane.showMessageDialog(null, "The Answer is " +sum, "The title", JOptionPane.PLAIN_MESSAGE);
					
				} 
				//Add//
				
				//Sub//
				else if (Integer.parseInt(x) == 2){
					Integer.parseInt(a);
					Integer.parseInt(b);
					int num1 = Integer.parseInt(a);
					int num2 = Integer.parseInt(b);
					
					int sum = num1 - num2;
					
				JOptionPane.showMessageDialog(null, "The Answer is " +sum, "The title", JOptionPane.PLAIN_MESSAGE);
					
				}
				//sub//
				
				//Mul//
				else if (Integer.parseInt(x) == 3){
					Integer.parseInt(a);
					Integer.parseInt(b);
					int num1 = Integer.parseInt(a);
					int num2 = Integer.parseInt(b);
					
					int sum = num1 * num2;
					
				JOptionPane.showMessageDialog(null, "The Answer is " +sum, "The title", JOptionPane.PLAIN_MESSAGE);
					
				}
				//Mul//
				
				//Div//
				else if (Integer.parseInt(x) == 4){
					Integer.parseInt(a);
					Integer.parseInt(b);
					int num1 = Integer.parseInt(a);
					int num2 = Integer.parseInt(b);
					
					int sum = num1 / num2;
					
				JOptionPane.showMessageDialog(null, "The Answer is " +sum, "The title", JOptionPane.PLAIN_MESSAGE);
					
				}
				//Div//
				
				//End program//
				
				
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
			
			
			
				
			
		
			
		
		
		
		
		
		
		
		
		
			

	}

}

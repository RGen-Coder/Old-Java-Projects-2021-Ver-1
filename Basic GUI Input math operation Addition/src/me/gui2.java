package me;

import javax.swing.JOptionPane;

public class gui2 {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Enter First Number");
		String b = JOptionPane.showInputDialog("Enter Second Number");
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The Answer is " +sum, "The title", JOptionPane.PLAIN_MESSAGE);
		
		

	}

}

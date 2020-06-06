package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
	String answer =	JOptionPane.showInputDialog("How many nickels do you have?");
	int number = Integer.parseInt(answer);
	String dime = JOptionPane.showInputDialog("How many dimes do you have?");
	int cents = Integer.parseInt(dime);
	String quarter = JOptionPane.showInputDialog("How many quarters do you have?");
	int twenty = Integer.parseInt(quarter);
	double total = 0.05*number + 0.10*cents + 0.25*twenty;
	JOptionPane.showMessageDialog(null, "Your total is: $" + total);
	}
}


/*
	Core Java 2 Cornell Hortsman 5th edition
	Example 3-2 InputTest.java
	pp-83
*/
import javax.swing.*;

public class InputTest
{
	public static void main(String[] args)
	{
		// get first input
		String name = JOptionPane.showInputDialog
		("What is your name?");

		// get second input
		String input = JOptionPane.showInputDialog
		("How old are you?");

		// convert string to integer value
		int age = Integer.parseInt(input);

		// display output on console
		System.out.println("Hello, " + name +
		". Next year, you'll be " + (age + 1));

	System.exit(0);
	}
}
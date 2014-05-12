/*********************************************
//Title: Pay.java
//Name(not really the author): Robert Payne
//Date: 5/23/2012
//Purpose: Calculates the pay for the user.
//			Input: Pay rate and hours worked
//			Output: The amount of money earned
////////////////////////////////////////////*/


import java.util.Scanner;

public class Pay
{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		//declare variables
		double hours;	//hours worked
		double rate; 	//hourly pay rate
		double salary; //gross salary
		//displays prompts and get input
		System.out.print("How many hours did you work? ");
		hours = keyboard.nextDouble();
		System.out.print("How much are you paid per hour? ");
		rate = keyboard.nextDouble();
		//processing
		if(hours <= 40)
			salary = hours * rate;
		else
			salary = ((hours - 40)*(1.5 * rate)) + 40 * rate;
		//display results
		System.out.print("You earned $" + salary);
	}
}//4.a. Pay.java:25: package system does not exist
//							system.out.print("You earned $" + salary);
//4.b. Pay.java:25: ';' expected
//		System.out.print("You earned $" + salary)
//4.c. Pay.java:26: reached end of file while parsing
//
//4.d. It compiles but, when it tries to run it says:
//		java.lang.NoSuchMethodError: main
/***********************************************
//Title: Gpa.java
//Author: Robert Payne
//Date: 5/23/2012
//Class: ITCS 1213L-L02
//Purpose: Prompts the user to enter their GPA
//			and then tells them if they made the
//			Dean's List.			
/////////////////////////////////////////////*/
import java.util.Scanner;

public class Gpa
{
	public static void main(String[] args)
	{
		//creates a Scanner object to read input from the keyboard
		Scanner keyboard = new Scanner(System.in);
		//GPA declaration
		double userGpa;
		//do while loop that keeps asking the user for GPA until -1 is entered
		do{
			//Prompts user for GPA
			System.out.print("Enter a GPA (-1 to end): ");
			userGpa = keyboard.nextDouble();
			//Checks to see if the user made the Dean's List
			if(userGpa >= 3.8)
				System.out.print("You made the Dean's List");
			System.out.println();
		}while(userGpa != -1);//Terminates when -1 is entered
	}//Method checks to see if the user's GPA puts them on the Dean's List
}
/***********************************************
//Title: Gpa.cpp
//Author: Robert Payne
//Date: 5/23/2012
//Class: ITCS 1213L-L02
//Purpose: Prompts the user to enter their GPA
//			and then tells them if they made the
//			Dean's List.			
/////////////////////////////////////////////*/
#include <iostream>

using namespace std;

int main()
{
	//GPA declaration
	double userGpa;
	//do while loop that keeps asking the user for GPA until -1 is entered
	do{
		//Prompts user for GPA
		cout<<"Enter a GPA (-1 to end): ";
		cin>>userGpa;
		//Checks to see if the user made the Dean's List
		if(userGpa >= 3.8)
			cout<<"You made the Dean's List";
		cout<<endl;
	}while(userGpa != -1);//Terminates when -1 is entered
	
	return 0;
}
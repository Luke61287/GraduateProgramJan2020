package com.mastek.training.packone;

import java.util.Scanner;

public class StringExceptionExample {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
			String name = "";
			String firstName = "";
			String lastName = "";
			
				try 
			
				{
					System.out.println("Enter Forename: ");
					firstName = (sc.nextLine()); //fetch the String from console and parse to integer.
					while (!sc.nextLine().matches(toString()));

			    }
					
				catch (Exception exp)	
				
				{
					System.out.println("Invalid input: Enter name in alpha characters");
					System.out.println();		
				}
				
				try
				
				{		
					System.out.println("Enter Surname: ");
					lastName = (sc.nextLine());
					while (!sc.nextLine().matches(toString()));

				}
				
				catch (Exception exp)
				
				{		
					System.out.println("Invalid input: Enter name in alpha characters ");	
				
				}
			
				

			finally { // block will be executed in all the scenarios of success or failure of application.
					// in case the exception not handled, it will abort the application after the finally block.
					System.out.println("Scanner Closed");
					sc.close();
				
			}
				
				{
				
					// represents the rest of code.
					System.out.println("Program Completed");	}
				
				{
					name = firstName+" " + lastName;
				
					System.out.println(name);
				
				}
				
		}
	}
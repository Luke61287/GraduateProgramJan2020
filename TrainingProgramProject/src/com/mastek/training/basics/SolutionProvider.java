package com.mastek.training.basics;

public class SolutionProvider {
	
	/*take two numbers from the user and display the maximum number as output.
	 * 
	 * 
	 */
	// public static <return-datatype> <name>(<param_type1> <param_name>, ...)
	public static int getMaxNumber(int num1,int num2) {// declare inputs as params.
		int max=0; // declare output as local variable
		if (num1>num2) { // validate the conditions for logical result.
			max=num1;
		} else {
			max=num2;
		}
		return max; // return the results to the caller.
	}

	// 1. Write an algorithm and code for accepting two numbers, 
	// divide the first number by second and display their quotient and remainder. 
	
	public static String getDivisionNumber(int num1, int num2) {// declare inputs as params.
		int answer = 0, remainder = 0;
				
		answer = (num1/num2);
		remainder = (num1 % num2); // declare output as local variable
		
		return answer +","+ remainder; // return the results to the caller.
	}
	
	// 2. Write an algorithm and code for accepting distance in kilometers,
	// convert it into miles and display the result.
		
	public static double getMiles(double km) {// declare inputs as params.
		double miles = 0;
		
		miles = (km/1.61);
		 // declare output as local variable
		
		return miles; // return the results to the caller.
	}
	
	// 3. Write an algorithm and code for calculating 
	// the area of rectangle and square separately.
	
	public static double getAreaRectangle(double l, double w) {// declare inputs as params.
		double arear = 0;
		
		arear = (l * w);
		 // declare output as local variable
		
		return arear; // return the results to the caller.
	}
	
	public static double getAreaSquare(double l, double w) {// declare inputs as params.
		double areas = 0;
		
		areas = (l * w);
		
		if (l == w) {
			
			return areas;
			
		} else {
			
			return 0;

		} 	

		 // declare output as local variable
		 // return the results to the caller.
	}
	
	// 4. Write an algorithm and code for accepting the distance and speed values for a particular journey, 
	// calculate the time taken for the journey and display the same.
	
	public static double getJourneyTime(double d, double s) {// declare inputs as params.
		double journeytime = 0;
		
		journeytime = (d / s);
			
			return journeytime;

		 // declare output as local variable
		 // return the results to the caller.
	}
	
	// 5. Write a code for accepting radius and calculate the area of the circle.
	
	public static double getCircumference(double r) {// declare inputs as params.
		double circumference = 0;
		
		circumference = Math.PI*(Math.pow(r, 2));
			return circumference;

		 // declare output as local variable
		 // return the results to the caller.
	}

	// 6. Write a code for accepting a number and display the multiplication table of the given number.
	
	public static void getMultiplicationTable(int m) {// declare inputs as params.
		for (int a=1; a<=12; a++)
		{
		System.out.println(m*a);
		}    
		 // declare output as local variable
		 // return the results to the caller.
	}
	
	// 7. Write a code for accepting three numbers and display the lowest number out of three numbers.
	
	public static double min(double a, double b, double c) {
	    return Math.min(Math.min(a, b), c);
	}
	
	// 8. Write a code to accept student Details like (StudentID, StudentName, StudentAge, Marks1, Marks2, Marks3) Calculate Total and Percentage. 
	// If percentage is greater than 50 then display “PASS” else display “FAIL”.
	
	public static String getMarks(int StudentID, String StudentName, int StudentAge, int Marks1, int Marks2, int Marks3) {
	    int totalmarks = 0;
	    double percentage = 0;
	    
	    totalmarks = (Marks1 + Marks2 + Marks3);
	    percentage = (totalmarks/100.0);
	    System.out.println(percentage);
	    if (percentage > 0.5)
	    {
			return "Pass";
			
		} else {
			
			return "Fail";

		}
	    
	}
	    
	// 9. Write a function to get grade of 3 subject marks.
	// a. Grade is based on average of 3 subject marks
	// i. Average>90 => A+
	// ii. Average<90 and average>=80 => A
	// iii. Average<80 and average>=70 => A-
	// iv. Average<70 and average>=60 => B+
	// v. Average<60 and average>=50 => B
	// vi. Average<50 => FAIL
	
	    public static String getGrade(int StudentID, String StudentName, int StudentAge, int Marks1, int Marks2, int Marks3) {
		    int totalmarks = 0;
		    
		    totalmarks = (Marks1 + Marks2 + Marks3)/3;
		    
		    System.out.println(totalmarks);
		    if (totalmarks >= 90)
		    
		    {
				return "A+";
		    }
				
			if (totalmarks < 90 && totalmarks >= 80)
			
			{
				return "A";
			}
			
			if (totalmarks < 80 && totalmarks >= 70)

			{
				return "A-";
			}
				
			if (totalmarks < 70 && totalmarks >= 60)
				
			{
				return "B+";
			}
			
			if (totalmarks < 60 && totalmarks >= 50)
				
			{
				return "B";
			}	
			
			else {
				
				return "Fail";

			}
	}	
}
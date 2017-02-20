import java.util.Scanner;//import scanner for user input
public class Investment //class name
	{
    public static void main(String[] args)//main method
        {
        Scanner myVar = new Scanner(System.in);// calls the class scanner
        System.out.println("Enter Investment Amount: ");//prompts user for initial investment value
        double investmentAmount = myVar.nextDouble();// sets user input to investmentAmount variable
        System.out.println("Enter annual interest rate: "); //prompts user for interest rate
        double  annualInterestRate = myVar.nextDouble();// sets user input to annual InterestRate 
        annualInterestRate = annualInterestRate / 100; // Convert annual interest from % to decimal bc calculations needs to read as a decimal
        int numberOfYears=30;// initializes number or years to 30

		// Print Table Headers
		System.out.println("Years      " + "   Future Value");
        // Call the futureInvestmentValue method 30 times
        for (numberOfYears=1; numberOfYears <=30; numberOfYears++) //beginning of for loop
			{
        	double future = futureInvestmentValue(investmentAmount, annualInterestRate, numberOfYears); 
        	System.out.printf("%-10d",numberOfYears);// precision formatting ?
        	System.out.printf("%11.2f\n", future);// 11 numbers total; 9 numbers b4 decimal + 2 decimal points
        	
        	
			}//end of for loop
        } // End of Main Method

    
    
    
    
    
    
    	// futureInvestmentValue Method
    	public static double futureInvestmentValue(double
    			investmentAmount, double annualInterestRate, int numberOfYears) //calculation method
    		{
    		double x = investmentAmount * Math.pow(1+annualInterestRate,numberOfYears); //future investment formula			
    		return x;  // returns the calculated value of futureInvestment variable amount 
       		}// End of futureInvestmentValue Method

    } // End of public class Investment 


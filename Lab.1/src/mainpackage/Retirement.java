package mainpackage;

import java.util.Scanner;

public class Retirement {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Gary's Retirement Calculator");

		
		Scanner input = new Scanner(System.in);

		System.out.print("How many years do you plan to work?: ");//ask years desired to work
		int YrsWork = input.nextInt();

		System.out.print("What is your expected Annual Return for present value( 7 = 7% ): ");//ask expected average return pv
		double AnnualRtnPV = input.nextDouble();
		
		System.out.print("How many years will you be reitred: ");//ask years retired
		int YrsRet = input.nextInt();
		
		System.out.print("What is your expected Annual Return for future value( 2 = 2% ): ");//ask expected average return fv
		double AnnualRtnFV = input.nextDouble();
		
		System.out.print("What is your required income: $");//ask required income
		double Income = input.nextDouble();
		
		System.out.print("What is your monthly SSI: $");//ask monthly ssi
		double MthSSI = input.nextDouble();
		
		input.close();
		
		
	    double Total = (Income-MthSSI)*((1-(1/Math.pow(1+(AnnualRtnFV/1200.0),(12*YrsRet))))/(AnnualRtnFV/1200.0));
	    double Monthly = (Total)/(((Math.pow((1+(AnnualRtnPV/1200.0)),(YrsWork * 12)))-1)/(AnnualRtnPV/1200.0));
	    	    
	    double TotalRnd = Math.round(Total*100.0)/100.0;
	    double MonthlyRnd = Math.round(Monthly*100.0)/100.0;
	    
	    System.out.println("You need to save $" + MonthlyRnd + " a month");
	    System.out.print("You need $" + TotalRnd + " saved in order to retire.");
	}  
}

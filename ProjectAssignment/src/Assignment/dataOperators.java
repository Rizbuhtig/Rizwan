package Assignment;

import java.util.Scanner;

public class dataOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter customer name");
		
		String name = scan.nextLine();
		
		System.out.println("Hello !" +name + "Please enter the amount");
		
		int amount = scan.nextInt();
		
		System.out.println("Please enter rate percentage in decimals");
		
		float rate = scan.nextFloat();
		
		System.out.println("Please enter time period in months");
		
		int time = scan.nextInt();
		
		float interest = amount *rate*time;
		
		System.out.println("Calculate interest is" +interest);
		
		if(rate >= 0.1 && rate < 0.2)
		{
			System.out.println("Rate of percentage given is personal loan from ICICI bank");
		}
		
		else if(rate > 0.2 && rate < 0.3 )
		{
			System.out.println("Rate of percentage given for personal loan from HDFC Bank");
		}
		else if( rate >=0.3)
		{
			System.out.println("House Loan");
		}
	}

}

package Assignment;

import java.util.Scanner;

public class evennumberFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = scan.nextInt();
		
		System.out.println("Even number from 1 to "+num+" are");
		for(int i =1;i<=num;i++)
			
			if(i%2==0)
			{
				System.out.println(i +"");
			}
	}

}

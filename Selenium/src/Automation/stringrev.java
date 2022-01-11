package Automation;

import java.util.Scanner;

public class stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String n = i.nextLine();
		
		System.out.println("Reverse of string");
		
		int l = n.length();
		
		while(l>0)
		{
			System.out.print(n.charAt(l-1));
			l--;
		}
	}

}

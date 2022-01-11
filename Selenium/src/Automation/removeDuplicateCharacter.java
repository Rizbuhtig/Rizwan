package Automation;

import java.util.LinkedHashSet;

public class removeDuplicateCharacter {
	
	static void removeDuplicate(String s)
	{
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i =0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
			
			for(Character ch : set)
			{
				System.out.println(ch);
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "javatpoint";
	
		removeDuplicate(s);
	}

}

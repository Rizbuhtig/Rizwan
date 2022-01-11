package Automation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class removeDuplicateCharacters {
	
	public static String removeDuplicate(String s)
	{
		
		HashSet<Character> set = new HashSet<Character>();
		
		char[] chars = s.toCharArray();
		
		for(int i=0; i<chars.length;i++)
		{
			set.add(chars[i]);
		}
		
		Iterator<Character> iterator = set.iterator();
		String sbString = new String();
		
		while(iterator.hasNext())
			sbString = sbString + iterator.next();
		
		return sbString;
		
		
	}
	
	public static void main(String[] args)
	{
		String s = "Hyderabad";
		
		System.out.println(removeDuplicate(s));
	}
}
	

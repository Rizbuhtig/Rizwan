package Automation;

import java.util.HashMap;
import java.util.Map;

public class occurenceCharacter {
	
	static void occurenceCharacter(String inputstring)
	{
	
	HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
	
	char[] strArray = inputstring.toCharArray();
	
	for(char c : strArray)
	{
		if(charCountMap.containsKey(c)) {
			charCountMap.put(c, charCountMap.get(c) + 1);
		}
		else
		{
			charCountMap.put(c, 1);
		}
			
	}
	
	for(Map.Entry entry: charCountMap.entrySet())
	{
		System.out.println(entry.getKey() + "-" + entry.getValue());
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String inputstring = "HelloWorld";
			occurenceCharacter(inputstring);
	}

}

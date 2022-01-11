package Automation;

public class reverseeachword {

	static void reverseeach(String inputstring)
	{
		
		String[] words =inputstring.split(" "); // Java // Automation
		
		
		String reverseString = "";
		
		for(int i =0;i<words.length;i++) // length will be 15
		{
			String word = words[i]; // array of words
			String reverseword = "";
			//String reversestring = "";
			for(int j= word.length()-1;j>=0;j--)//j=14
			{
				
				reverseword = reverseword + word.charAt(j);
			}
			
			reverseString = reverseString + reverseword + " ";
			
			
		}
		System.out.println(inputstring);
		
		System.out.println(reverseString);
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseeach("Java Programming & Coding Language");
	}

}

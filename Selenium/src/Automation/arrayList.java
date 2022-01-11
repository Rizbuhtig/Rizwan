package Automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class arrayList {
	
	
	public void regular()
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ram");
		a.add("Shawn");
		a.add("Senu");
		a.add("Shankar");
		a.add("Tata");
		int count=0;
		
		for(int i=0;i<a.size();i++)
		{
			String actual = a.get(i);
			if(actual.startsWith("S"))
			{
			count++;
			
			}
			
		}

		System.out.println(count);
		
	}
	
	public void streamUpper()
	{
		Stream.of("Ram","Raju","Remo","Riyaz").filter(s->s.startsWith("R"))
		.map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
	}
	
	public void sort()
	{
		
		List<String> name = Arrays.asList("Abhi","Akash","Ramu","Raju");
		name.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	public void streamTwoArraySort()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Don");
		names.add("Rahul");
		names.add("Lokesh");
		names.add("Peter");
		
		List<String> names1 = Arrays.asList("Pankaj","Roma","Reddy");
		names1.stream().filter(s->s.startsWith("P")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Two list are combined
		
		Stream newconcat = Stream.concat(names1.stream(), names.stream());
		//newconcat.sorted().forEach(s->System.out.println(s));
		
		//To match if particular name is present
		
		boolean flag = newconcat.anyMatch(s->((String) s).equalsIgnoreCase("Pankaj"));
		System.out.println(flag);
	}
}

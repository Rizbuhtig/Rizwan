package HashMapConcept;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMaptoArrayList {

	public static void main(String[] args) {

		Map<String,Integer> studentmarks = new HashMap<String,Integer>();
		
		studentmarks.put("Ram",80);
		studentmarks.put("Pooja",55);
		studentmarks.put("Teja",90);
		studentmarks.put("Icecream",65);
		studentmarks.put("Eva",100);
		
		System.out.println("no of students "+ studentmarks.size());
		
		//use entryset for iterating data from hashmap
		Iterator it = studentmarks.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + "=" + pairs.getValue());
			
		}
		
		
		//Lamba expression
		studentmarks.forEach((k,v) ->System.out.println("key="+ k + "value= "+v));
		
		//converting hashmap to Array list
		
		List<String> studentdata = new ArrayList<String>(studentmarks.keySet());
		System.out.println(studentdata);
		for(String t : studentdata)
		{
			System.out.println(t);
		}
		
		System.out.println("------------");
		
		List<Integer> marksList = new ArrayList<Integer>(studentmarks.values());
		System.out.println(marksList);
		for (Integer e : marksList)
		{
			System.out.println(e);
		}
		
		
	}

}

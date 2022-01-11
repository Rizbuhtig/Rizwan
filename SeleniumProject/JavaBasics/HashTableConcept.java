package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		
		h.put("A", "World");
		h.put(1,200);
		h.put("V", "Welcome");
		
		System.out.println(h.size());
		
		System.out.println(h.get(1));
		

	}

}

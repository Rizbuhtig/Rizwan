package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		ar.add("100");
		ar.add("200");
		ar.add("250.33");
		
		ar.add("Tom");
		ar.add(true);
		
		//To get the size of array
		System.out.println(ar.size());
		
		//To get the value of an index in array
		System.out.println(ar.get(2));
		
		System.out.println("All values in an array");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList();
		ar1.add(200);
		//ar1.add(200.55);
		
		
		

	}

}

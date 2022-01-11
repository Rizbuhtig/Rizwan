package ListConcept;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar = new ArrayList<Employee>();

		Employee e1 = new Employee("Nishanth",27,"QA");
		Employee e2 = new Employee("Ujwal",28,"Dev");
		Employee e3 = new Employee("Kishan",45,"Admin");
		Employee e4 = new Employee("Nishanth",27,"QA");
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e4);
		
		//user defined arrayList
		Iterator<Employee> it = ar.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.dept);
		}
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Test");
		ar1.add("Selenium");
		ar1.add("World");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hello");
		ar2.add("Java");
		ar2.add("Script");
		
		System.out.println("*******");
		
		
		//addAll - It will merge two array
		ar1.addAll(ar2);
		
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("*******");
		ar1.removeAll(ar2);
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		System.out.println("*******");
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Demo");
		ar3.add("Selenium");
		ar3.add("ArrayList");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Demo");
		ar4.add("Test");
		
		ar3.retainAll(ar4);
		for(int i=0;i<ar3.size();i++)
		{
			System.out.println(ar3.get(i));
		}
		
 		
	}

}

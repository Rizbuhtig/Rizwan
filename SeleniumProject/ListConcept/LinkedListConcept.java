package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Demo");
		ll.add("Java");
		ll.add("Learning");
		ll.add("Sessions");
		
		System.out.println("Linked list content"+ll);
		
		ll.addFirst("By NaveenAutomation");
		ll.addLast("To Nishanth");
		
		System.out.println("After adding"+ll);
		
		System.out.println(ll.get(0));
		
		System.out.println(ll.set(1, "Terati"));
		
		ll.remove(0);
		System.out.println(ll);
		
		for(int n =0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		System.out.println("using adv for loop");
		for(String str : ll)
		{
			System.out.println(str);
		}
		
		System.out.println("using iterator");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("using while loop");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}

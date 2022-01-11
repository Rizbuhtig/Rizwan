package Practicesingleton;

public class SingletonConcept {
	
	//create a private static instance of singleton and make it null
	//create a public static method (getInstance) it will return the object of the class
	//create a constructor and make it private
	
	private static SingletonConcept single_reference =null;
	public String str;
	
	private SingletonConcept()
	{
		str = "Hey! This is my singleton string ";
	}
	
	public static SingletonConcept getInstance()
	{
		if(single_reference == null)
			single_reference = new SingletonConcept();
		return single_reference;
	}

	public static void main(String[] args) {
		
	SingletonConcept	x = SingletonConcept.getInstance();
	SingletonConcept	y = SingletonConcept.getInstance();		
	SingletonConcept	z = SingletonConcept.getInstance();
	
	x.str = (x.str).toUpperCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	z.str = (z.str).toLowerCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	}

}

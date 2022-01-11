package OOPSConcept;

public class StaticAndNonStatic {
	
	static String emp_name ="Clarke";
	int age = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		
		//static method called directly
		demo();
		//static method called using class name
		StaticAndNonStatic.demo();
		
		//accessing static variable directly
		System.out.println(emp_name);
		
		//accessing static variable using classname
		System.out.println(StaticAndNonStatic.emp_name);
		
		
		//non-static method accessed using object
		obj.sum();
		
		//non-static variable accessed using object
		System.out.println(obj.age);
	}

	public void sum()
	{
		System.out.println("Non static method");
	}
	
	public static void demo()
	{
		System.out.println("Static method");
	}
}

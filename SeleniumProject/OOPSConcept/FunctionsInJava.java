package OOPSConcept;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation for FunctionsInJava and obj is reference variable for object
		//copy of non static object are given to obj
		
		FunctionsInJava obj = new FunctionsInJava();
		
		//test method is called and execute test method
		obj.test();
		//obj.Demo will get 30 and then m is assigned with 30 and print
		int m = obj.Demo();
		System.out.println(m);
		
		String n = obj.Moon();
		System.out.println(n);
		
		int val =obj.division(10, 2);
		System.out.println(val);
		
		
	}
		
	
	//nothing is return
	//return type is void
	//non static methods
	public void test() {
		System.out.println("Test method");
		
	}
	
	//we are returning c so we gave int in method
	//return type is int
	public int Demo() {
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//we are returning s so we gave string in method
	//return type is string
	public String Moon()
	{
		System.out.println("String method");
		String s = "Java OOPS Basics";
		
		return s;
				
	}
	
	public int division (int x, int y)
	{
		int d;
		d =x/y;
		
		return d;
	}
}

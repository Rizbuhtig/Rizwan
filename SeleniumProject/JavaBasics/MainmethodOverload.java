package JavaBasics;

public class MainmethodOverload {

	public static void main(String[] args) {
		
		System.out.println("main method");
		main("Selenium");
		main(10);
		main(20,30);
	}

	
	public static void main(String args)
	{
		System.out.println("main method-1");
	}
	
	public static void main(int i)
	{
		System.out.println("main method-2");
	}
	
	public static void main(int a, int b)
	{
		System.out.println("main method--3");
	}
	
}

	

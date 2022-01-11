package ListConcept;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test1();
		//demo();
		division();
	}
	
	public static void test1()
	{
		System.out.println("*******");
		try
		{
			System.out.println("inside try block");
			throw new RuntimeException("test");
		}catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		
		finally
		{
			System.out.println("inside finally block");
		}
	}
	
	public static void demo()
	{
		System.out.println("without catch block");
		try
		{
			System.out.println("inside try block");
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
	}
	
	public static void division()
	{
		int i =0;
		try
		{
			System.out.println("Arithmetic exception");
			int k =i/0;
		}catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
		}
		
		finally
		{
			System.out.println("inside final block");
		}
	}

}

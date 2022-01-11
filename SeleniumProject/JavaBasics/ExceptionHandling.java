package JavaBasics;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	try {
		int i=9/0;
		
		
	}
	catch (ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
	
	System.out.println("ABC");
	
	}
}

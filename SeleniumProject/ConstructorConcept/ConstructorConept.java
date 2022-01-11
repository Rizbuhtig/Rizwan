package ConstructorConcept;


public class ConstructorConept {
	
	public ConstructorConept()
	{
		System.out.println("Default constructor");
	}
	
	public ConstructorConept(int i)
	{
		System.out.println("single constructor");
		System.out.println("the value of i is"+i);
	}
	
	public ConstructorConept(int i, int j)
	{
		System.out.println("parameterized constructor");
		System.out.println("the value of i is"+i);
		System.out.println("the value of j is"+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConept obj = new ConstructorConept(); 
		ConstructorConept obj1 = new ConstructorConept(10);
		ConstructorConept obj2 = new ConstructorConept(10,20);
		
	}
	

}

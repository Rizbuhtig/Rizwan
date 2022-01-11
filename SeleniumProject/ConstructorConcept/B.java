package ConstructorConcept;

public class B extends A {

	public B (int i)
	{
		super(10);
		System.out.println("this is child constructor");
		
	}
	
	public B(int i ,int j)
	{
		super(10,20);
	}
	
	public static void main(String args[])
	{
		B obj = new B(10);
		B obj1 = new B(10,20);
		
	}
	
}

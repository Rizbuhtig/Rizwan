package ConstructorConcept;

public class A {

	
	public A()
	{
		System.out.println("parent class contructor");
	}
	
	public A(int i)
	{
		System.out.println("the value of i is"+i);
	}
	
	public A(int i,int j)
	{
		System.out.println("the value of i is"+i);
		System.out.println("the value of j is"+j);
	}
}

package OOPSConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20,10);
	}

	
	//method overloading is when the method name is same with different parameter or input parameter within the same class
	public void sum()
	{
		System.out.println("SUm with no input parameter");
	}
	
	public void sum(int i)
	{
		System.out.println("Sum with 1 input parameter");
		System.out.println(i);
	}
	
	public void sum(int k,int m)
	{
		System.out.println("Sum with 2 input parameter");
		System.out.println(k+m);
	}
	
}

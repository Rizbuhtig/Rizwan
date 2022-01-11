package Automation;

public class constructorDemo {

	public constructorDemo(int i, int j) {
		// TODO Auto-generated constructor stub
		int c = i+j;
		System.out.println(c);
	}

	public constructorDemo()
	{
		System.out.println("I am default constructor");
	}
	
	public void getData()
	{
		
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorDemo cd = new constructorDemo();
		constructorDemo c = new constructorDemo(4,5);
		
	}

}

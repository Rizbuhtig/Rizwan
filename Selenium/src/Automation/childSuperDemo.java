package Automation;

public class childSuperDemo extends parentSuperDemo {
	
	String name = "Cybage Software Pvt Ltd";
	
	public void childSuperDemo()
	{
		System.out.println(name);
		
		System.out.println(super.name);
		
	
	}
	
	public childSuperDemo()
	{
		super();
		System.out.println("I am child constructor");
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childSuperDemo c = new childSuperDemo();
		c.childSuperDemo();
		c.getData();
	}

}

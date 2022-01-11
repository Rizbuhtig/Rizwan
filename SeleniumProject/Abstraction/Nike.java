package Abstraction;

public class Nike implements Shoes {

	@Override
	public void men()
	{
		System.out.println("Men----Shoes");
	}
	
	@Override
	public void women()
	{
		System.out.println("Women---Shoes");
	}
	
	@Override
	public void kids()
	{
		System.out.println("Kids---Shoes");
		
	}
	
	public void infant()
	{
		System.out.println("Infant---Shoes");
	}
}

package unitFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationDemo {
	
	@Test
	public void Shopping()
	{
		System.out.println("Mens Shopping -- Before Class");
	}
	
	@Test (groups= {"Smoke"})
	public void Shoppingshoes()
	{
		System.out.println("Shoppings shoes");
	}
	
	@Test
	public void ShoppingShirts()
	{
		System.out.println("Shopping shirts -- After Class");
	}
	
	@Test(dependsOnMethods= {"Shoppingshoes"})
	public void ShoppingTracks()
	{
		System.out.println("Shopping Tracks");
	}
	
	@Test(enabled=false)
	
	public void ShoppingWatch()
	{
		System.out.println("Shopping watches ");
	}
}

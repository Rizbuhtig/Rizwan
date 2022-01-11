package AutomationMaven.Maven;

import org.testng.annotations.Test;

public class insuranceTest {
		
	@Test
	public void selfInsurance()
	{
		System.out.println("Insurance -- SelfInsurance");
	}
	
	@Test
	public void ParentInsurance()
	{
		System.out.println("Insurance -- ParentInsurance");
	}
	
	@Test
	public void childInsurance()
	{
		System.out.println("Insurance -- ChildInsurance");
	}
	
	@Test
	public void RenewalInsurance()
	{
		System.out.println("Insurnace -- Renewal");
	}
}

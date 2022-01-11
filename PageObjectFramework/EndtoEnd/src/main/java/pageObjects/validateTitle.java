package pageObjects;

	import java.io.IOException;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pageObjects.landingpage;
	//import junit.framework.Assert;
	import resources.base;

	public class validateTitle extends base {
		
		public WebDriver driver;
		
		public static Logger log = LogManager.getLogger(base.class.getName());
		
		@BeforeTest
		public void initialize() throws IOException
		{
			driver = initializedriver();
			log.info("driver is initailized");
			
			
		}
		
		@Test
		public void basepagenavigation() 
		{	
			driver.get("http://qaclickacademy.com");	
			log.info("Navigated to the url");
			landingpage l = new landingpage(driver);
			System.out.println(l.getpageTitle().getText());
			
			Assert.assertEquals(l.getpageTitle().getText(), "FEATURED COURSES");
			
			Assert.assertTrue(l.getHeaderSection().isDisplayed());
			
			log.info("Header is displayed");
			
		}
		
		@AfterTest
		public void tearDown(){
			driver.close();
		}

	}




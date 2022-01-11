package Automation;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		//Added required vegetables in array
		String [] itemsNeeded = {"Cucumber", "Brocolli","Beetroot", "Carrot"};
		
		
		
		addItems(driver, itemsNeeded);
	}
	
		
		
		public static void addItems(WebDriver driver, String[] itemsNeeded)
		{
			int j=0;
		//Gives the location of the name of the vegetable as it has many we keep it in List
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		//We calculate the size of product
		for(int i =0; i<products.size();i++)
		{
			//Split the value 
			String[] name = products.get(i).getText().split("-");
			
			// Trim the text as we need only veg names
			String formattedName = name[0].trim();
			
			//convert array to array list
			List itemNeededList = Arrays.asList(itemsNeeded);
			
			
			if(itemNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
					}
			}
		}
		
		
}
}



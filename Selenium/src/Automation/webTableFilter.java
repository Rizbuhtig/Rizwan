package Automation;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class webTableFilter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(5000);
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredveg =veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredveg.size());
		System.out.println("Veg size" + veggies.size());
		System.out.println("filtered veg " + filteredveg.size());
	
	}

}

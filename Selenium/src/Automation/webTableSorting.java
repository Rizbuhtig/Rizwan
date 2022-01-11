package Automation;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class webTableSorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> vegnames = driver.findElements(By.xpath("//tr/td[1]"));
		
		List <String> listvegnames = vegnames.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedvegList = listvegnames.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(listvegnames, sortedvegList);
		
		List<String> pricelist;
		do
		{
			List<WebElement> rows  = driver.findElements(By.xpath("//tr/td[1]"));
			pricelist = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
			pricelist.forEach(a->System.out.println(a));
			
			if(pricelist.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}while(pricelist.size()<1);
			
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}

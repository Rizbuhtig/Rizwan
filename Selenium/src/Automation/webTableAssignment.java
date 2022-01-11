package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.table-display').scrollBy=5000");
		
		
		List <WebElement> colvalues =driver.findElements(By.xpath("//table[@class='table-display']//tbody/tr[1]/th"));
		System.out.println(colvalues.size());
		for(int i =0; i<colvalues.size();i++)
		{
			System.out.println(colvalues.get(i).getText());
			
		}
		
		List <WebElement> rowvalues =driver.findElements(By.xpath("//table[@class='table-display']//tbody/tr"));
		System.out.println(rowvalues.size());
		
		System.out.println("Printing the second row"  +  (rowvalues.get(2).getText()));
		
		System.out.println("Printing full table");
		for(int i =0;i<rowvalues.size();i++)
		{
			System.out.println(rowvalues.get(i).getText());
		}
	}

}

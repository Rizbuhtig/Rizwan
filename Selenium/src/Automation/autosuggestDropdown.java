package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete"));
		
		//driver.findElement(By.cssSelector("[id='autocomplete']")).sendKeys("Uni");
		
		driver.findElement(By.cssSelector("[id='autocomplete']")).sendKeys("Indo");
		Thread.sleep(4000);
		
		List<WebElement> autovalues = driver.findElements(By.cssSelector(".ui-menu.ui-widget.ui-widget-content.ui-autocomplete.ui-front"));
		
		
		for(WebElement option : autovalues)
		{
			if(option.getText().equalsIgnoreCase("Indonesia"))
				option.click();
			
			break;
		}
	}

}

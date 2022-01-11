package Automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class brokenLinkDemo {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gi-fi'] a"));
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			//Assert.assertEquals(respcode <400, "The link with text" + link.getText()+ "is broken with code" +respcode);
			
			if(respcode > 400)
			{
				System.out.println("The link with text" + link.getText()+ "is broken with code" +respcode);
				Assert.assertTrue(false);
			}
		}
		
		
		
		
		
	}

}

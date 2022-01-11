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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


 
public class softAssertDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		
		List<WebElement> linkvalues =driver.findElements(By.cssSelector("li[class='gf-li']) a"));
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : linkvalues)
		{
			String url = link.getAttribute("href");
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int respcode = con.getResponseCode();
			a.assertTrue(respcode<400, "The link with Text" + link.getText() +"with respcode" +respcode);
			
			
			
			
		}
	}

}

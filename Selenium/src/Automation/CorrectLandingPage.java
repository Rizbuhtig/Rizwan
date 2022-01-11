package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CorrectLandingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D://geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Thread.sleep(3000);
		
		driver.get("http//www.google.com");
		System.out.println(driver.getCurrentUrl());
	}

}

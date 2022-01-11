package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initializedriver() throws IOException
	{
		System.getProperty("user.dir");
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fin);
		
		
		String browsername=System.getProperty("browser");
		//String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver() is not used because scope of object will complete afer this. So we declared it globally
			driver = new FirefoxDriver();
		}
		else if(browsername.contains("chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			//headless chrome browser
			if(browsername.contains("headless"))
			{
			option.addArguments("headless");
			}
			driver = new ChromeDriver(option);
		} 
		else if(browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	private void getProperty(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getScreenshotPath(String testcasename, WebDriver driver) throws IOException
	{
	 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir") + "\\reports\\" + testcasename + ".png";
		FileUtils.copyFile(src, new File(destfile));
		return destfile;
	}
}

package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentRepo {
	
	static ExtentReports extent;
	
	@BeforeTest
	
	public static ExtentReports getObject()
	{
		String path = System.getProperty("user.dir") +"//reports/result.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Web Results");
		report.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Nishanth");
		return extent;
	}
	
	
	
	@Test
	public void intializeDemo()
	{
		// A test(record - reportDemo) is created in extent report to execute the test
		ExtentTest test = extent.createTest("reportDemo");
		System.setProperty("webdriver.gecko.driver","D://geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.getTitle();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		extent.flush();
		
	}
}




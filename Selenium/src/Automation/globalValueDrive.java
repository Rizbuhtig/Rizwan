package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalValueDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\nishantht\\eclipse-workspace\\Selenium\\src\\Automation\\data.Properties");
		prop.load(fis);
		prop.getProperty("browser");
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.setProperty("browser", "firefox"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\nishantht\\eclipse-workspace\\Selenium\\src\\Automation\\data.Properties");
		prop.store(fos, null);
	}

}

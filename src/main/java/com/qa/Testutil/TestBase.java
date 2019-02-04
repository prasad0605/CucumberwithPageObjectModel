package com.qa.Testutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties properties;
	public TestBase(){
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Prasad\\eclipse-workspace\\CucumberwithPageObjectModel\\src\\main\\java\\com\\qa\\config\\config.properties");
			properties=new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void initialization(){
		if(properties.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasad\\selenium_projects\\chromedriver_win32\\chromedriver.exe");
			//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("test-type");
			//capabilities.setCapability("chrome.binary", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver();
		}
		if(properties.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prasad\\selenium_projects\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(properties.getProperty("browser").equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Prasad\\selenium_projects\\MicrosoftWebDriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	}
	
}

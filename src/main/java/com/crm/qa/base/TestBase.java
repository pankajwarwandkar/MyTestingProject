package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {

	//Declare global variables
	public static WebDriver driver;
	public static Properties prop;
	public static Properties object;
	
	public static EventFiringWebDriver eventFiringDriver;
	public static WebEventListener eventListener;
	
	
	//step1 - create public constructor
	// load config.properties file in the constructor
	public TestBase() throws IOException{
		prop = new Properties();
	//File file= new File(System.getProperty("user.dir")+"crmproject//src//main//java//com//crm//qa//config//config.properties");
		FileInputStream fis= new FileInputStream("D://selanium class//crmproject//src//main//java//com//crm//qa//config//config.properties");
			prop.load(fis);    
	
		

}	
		
		
		/*try {
		FileInputStream fis= new FileInputStream
				(System.getProperty("user.dir")+"crmproject/src/main/java/com/crm/qa/config/config.properties");
			prop.load(fis);    
		} catch (IOException e) {
			e.printStackTrace();
		}
*/		
	
	//step2 - implement initialization() method
	
	
	public static void initialization() throws IOException{
	String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D://selanium class//crmproject//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"//drivers//IEDriverServer.exe" );
			driver = new InternetExplorerDriver();
		}else

	browserName.equalsIgnoreCase("mozilla");
		System.setProperty("webdriver.gecko.driver","D://selanium class//crmproject//drivers//geckodriver.exe");
		//D:\selanium class\crmproject\drivers\geckodriver.exe
	driver = new FirefoxDriver();
		
		/**
		 * Steps to register webdriver listener-
		 * 
		 * 1. Create object of EventFiringWebDriver and 
		 *    pass webdriver instance in the constructor.
		 * 2. Create object of WebEventListener(i.e your listener class)
		 * 3. Call method register() and pass object of WebEventListener(your listener class)
		 * 4. Assign EventFiringWebDriver instance to WebDriver instance
		 *   
		 */
		
	eventFiringDriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		eventFiringDriver.register(eventListener);
		driver = eventFiringDriver;
		
		
		//maximize the window, delete cookies ,set timeouts
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT , TimeUnit.SECONDS);
		
		//Launch URL
		driver.get(prop.getProperty("url"));
		
		//driver.get(prop.getProperty("firstName"));
		//driver.get(prop.getProperty("lastName1"));
		
	}
}

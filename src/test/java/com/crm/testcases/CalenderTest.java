package com.crm.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Calender;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.util.TestUtil;

public class CalenderTest extends TestBase{

	public CalenderTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	
	PageFactory.initElements(driver,this);
	}
	public static TestUtil testUtil;
	public static TasksPage tp1;
	public TasksPage tp2;
	public TasksPage tp3;
	public Calender cl1;
	public Calender cl2;
	@BeforeMethod
	public  void readCalenderData() throws IOException
	{
		initialization();
		
	LoginPage log= new LoginPage();
	log.login(prop.getProperty("username"),
			prop.getProperty("password"));
	testUtil=new TestUtil();
    testUtil.switchToFrame("mainpanel");
	 cl1= new Calender(); 
	 cl1.calenderOpen();
	
	}
	
	@Test(priority=1)
	public  void newEventTest() throws IOException {
		 cl2= new Calender(); 
		 cl2.newEvent();
		
	}
	
	@AfterMethod
	public void quit1()
	{
 
driver.quit();
	}
	

	
	}
	
	

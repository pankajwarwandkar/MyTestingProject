package com.crm.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Calender;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
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
	public LoginPage loginPage;
	public TasksPage tp3;
	public Calender calender;
	public Calender cl2;
	@BeforeMethod
	public  void readCalenderData() throws IOException
	{
		initialization();
		
	loginPage = new LoginPage();
	calender=new Calender();
	loginPage= new LoginPage();
	calender=new Calender();
	loginPage.login(prop.getProperty("username"),
		prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public  void newEventTest() throws IOException {
		calender.calenderOpen();
		calender.newEvent();
	}
	
	@AfterMethod
	public void quit1()
	{
 
driver.quit();
	}
	

	
	}
	
	

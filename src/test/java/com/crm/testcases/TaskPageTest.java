package com.crm.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.util.Logs;
import com.crm.qa.util.TestUtil;

public class TaskPageTest extends TestBase{
	
	
	private static final String getTestData = null;
	public TestUtil testUtil;
	public TasksPage tp1;
	public TasksPage tp2;
	public TasksPage tp3;

	public TaskPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void taskPage1() throws Exception
	{
		
		initialization();
	
	LoginPage log= new LoginPage();
	log.login(prop.getProperty("username"),
			prop.getProperty("password"));

//	Logs.logprint.info("log page is printed");
//	int wb=driver.findElements(By.tagName("iframe")).size();
//	System.out.println(wb);
	testUtil=new TestUtil();
    testUtil.switchToFrame("mainpanel");
	 tp1= new  TasksPage();
	 tp1.taskPageOpen();
	 
	}

	@Test(priority=1)
	public void testNewPage() throws IOException
	{
	 tp2= new TasksPage();
	
	tp2.newTask();
	}
	
	
	
	@Test(priority=2)
	public void testFullSearchPage() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
	 tp3= new TasksPage();
	tp3.fullSearchOnTask();
	}
	
	@AfterMethod
	public void quit1()
	{
 
driver.quit();
	}
	

	
}
	
	


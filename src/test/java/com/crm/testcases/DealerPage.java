package com.crm.testcases;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Logs;
import com.crm.qa.util.TestUtil;

public class DealerPage extends TestBase {
	
	private static final String getTestData = null;
	public TestUtil testUtil;
	public DealsPage ds;
	public DealerPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void dealerPage() throws Exception
	{
		
		initialization();
	
	LoginPage log= new LoginPage();
	log.login(prop.getProperty("username"),
			prop.getProperty("password"));

	Logs.logprint.info("log page is printed");
	int wb=driver.findElements(By.tagName("iframe")).size();
	System.out.println(wb);
	testUtil=new TestUtil();
    testUtil.switchToFrame("mainpanel");
	 ds=new DealsPage();
	ds.clickOnDealsLink();
	Logs.logprint.info("clicked on delear link");
	}
	
	

	@Test(priority=1, dataProvider="getCRMTestData")
public void testNewDealer(String name) throws IOException, InterruptedException
	{
ds.newDealerEntery(name);

	}
	@DataProvider
	public Object[][] getCRMTestData(){
		Object[][] data = TestUtil.getTestData("Sheet2");
		return data;

	}
	@Test(priority=2)
public void testExcitingDealer()
{
ds.exsistingDealer();

}


	@Test(priority=3)
public void testFullSearchFormDealer() {
ds.fullSearchForm();
	}
	
@AfterMethod
	public void quit1()
	{
 
driver.quit();
	}
	
	
	
	
	
	
	
	

}

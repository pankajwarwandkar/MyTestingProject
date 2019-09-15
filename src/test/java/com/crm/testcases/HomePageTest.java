package com.crm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	//BEST PRACTICES
	//Testcases should be independent
	//before each testcase - launch browser and login
	//after each testcase - close the browser
	//so that it would avoid any caching or cookies issue
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	
	public HomePageTest() throws IOException{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException{
	initialization();
		try {
			loginPage= new LoginPage();
			contactsPage=new ContactsPage();
			homePage=new HomePage();
			loginPage.login(prop.getProperty("username"),
				prop.getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	
	
	@Test(priority=1)
	public void verifyContactPageTitleTest() throws IOException, InterruptedException{
		Thread.sleep(8000);
	homePage.clickOnContactPage();
	Thread.sleep(8000);
	homePage.contactPageTitle();
	
	}
	
	@Test(priority= 2)
	public void verifyHomePageTitle()
	{
		homePage.homePageTitle();
	}
	
	/*
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homepageTitle=homePage.verifyHomepageTitle();
		Assert.assertEquals(homepageTitle, "CRM","Homepage title not matched.");
		
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		testUtil.switchToFrame("mainpanel");
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	/*@Test(priority=3)
	public void verifyContactsLinkTest(){
		testUtil.switchToFrame("mainpanel");
		try {
		//	contactsPage=homePage.clickOnNewContactLink();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	
	

}

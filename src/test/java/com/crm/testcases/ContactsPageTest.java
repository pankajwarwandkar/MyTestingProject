package com.crm.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	String sheetName="Contacts";
	
	 ContactsPageTest() throws IOException{
	
		 super();
	
	}

	 
	 @DataProvider(name="ContactPageData")
		public Object[][]  readData()
		{
			Object[][] datadisplay=testUtil.getTestData("D:/selanium class/crmproject/src/main/resources/readData.xlsx", "contact");
			return datadisplay;
			
		}
	 
	 @BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginPage= new LoginPage();
		loginPage.loginButton();
			loginPage.login(prop.getProperty("username"),
				prop.getProperty("password"));

	}
	
	
	
	
	@Test(dataProvider="ContactPageData")
	public void createNEwContactTest(String Contact, String lName) throws Exception{
	/*	try {
		//	homePage= new HomePage();
			//homePage.clickOnContactPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		contactsPage= new ContactsPage();
		contactsPage.creadtNewContact(Contact, lName);
	}
	/*
	@Test(dataProvider="getCRMTestData")
	public void validateCreatenewContact(String title, String fName,
						String lName, String company){
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Amit3", "pradhan3","abcd3");
		contactsPage.createNewContact(title, fName, lName, company);
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	*/
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}

}

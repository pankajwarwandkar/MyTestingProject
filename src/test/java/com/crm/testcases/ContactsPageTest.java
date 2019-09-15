package com.crm.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
	public LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	String sheetName="Contacts";
	public Object[][] datadisplay;
	
	public ContactsPageTest() throws IOException{
	
		 super();
	
	}

	 
	 @DataProvider
		public Object[][]  readData() throws InvalidFormatException
		{
			Object[][]	datadisplay = TestUtil.getTestData("contact");
			return datadisplay;	
		}
	 
	 @BeforeMethod
	public void launchBrowser() throws IOException{
			initialization();
			try {
				loginPage= new LoginPage();
				contactsPage= new ContactsPage();
				homePage= new HomePage();
				testUtil=new TestUtil();;
				loginPage.login(prop.getProperty("username"),
					prop.getProperty("password"));
				
				homePage.clickOnContactPage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}	
	}
	
	
	
	
	@Test(priority=1 ,dataProvider="readData")
	public void testContactPage(String Fname, String Lname) throws IOException {
	//homePage= new HomePage();
	//homePage.clickOnContactPage();
	//contactsPage= new ContactsPage();
	//contactsPage.clickOnContactPage();
	contactsPage.creadtNewContact(Fname,Lname);
	
		//contactsPage= new ContactsPage();
	//	contactsPage.creadtNewContact(Contact, lName);
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

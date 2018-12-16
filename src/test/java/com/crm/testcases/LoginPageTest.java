package com.crm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ForgotPasswordPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	public LoginPage loginPage;
	HomePage  homePage;
	ForgotPasswordPage forgotPassword;
	String expectedTitle="#1 Free CRM for Any Business: Online Customer Relationship Software";
	
	//create constructor of this class
	public LoginPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException{
	initialization();
		try {
			loginPage= new LoginPage();
		loginPage.login(prop.getProperty("username"),
				prop.getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
/*
	}
@Test(priority=1)
	public void loginPageTitle(){
		String actualTitle = loginPage.validateTitle();
	//String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle );
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag =loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=1)
	public static void  login1() 
	{
		homePage=loginPage.login(prop.getProperty("username"),
									prop.getProperty("password"));
		
	
	//validate successful login by checking the title
		Assert.assertEquals(driver.getTitle(), "CRMPRO",
				"Login unsuccessful");
	}

	@Test(priority=4)
	public void validateForgotPasswordLink(){
		try {
			forgotPassword =loginPage.clickForgotPassWord();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = forgotPassword.validategetPasswordBtn();
		
		Assert.assertTrue(flag);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
*/
}
	private void login1() {
		// TODO Auto-generated method stub
		
	}
}
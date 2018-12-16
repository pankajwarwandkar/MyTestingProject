package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	

	//Page factory - OR
	//@FindBy(name="username11")
	@FindBy(name="username")
	WebElement username1;
	/**
	 * Same as writing below statement
	 * WebElement username=driver.findElement(By.name("username")); 
	 */
		
	//@FindBy(name="password11")
	@FindBy(name="password")
	WebElement password1;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
		
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signupBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotPasswordLink;
	
	/*WebElement forgotPasswordLink = driver.findElement
			(By.xpath("//a[text()='Forgot Password?']"));
	*/
	
	//methods or actions or functionalities on the page
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
	public ForgotPasswordPage clickForgotPassWord() throws IOException{
		forgotPasswordLink.click();
		return new ForgotPasswordPage();
		
	}
	
	public String validateTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	//HomePage is the landing page of Login method
	
	public HomePage login(String username, String password) throws IOException{
		username1.sendKeys(username);
		password1.sendKeys(password);
		loginBtn.click();
		
		return new HomePage();
		

	}
	}

	


package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//initlize driver using Pagefactory.
	//driver is coming from TestBase class
	public LoginPage(){
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	//Page factory - OR
	//@FindBy(name="username11")
	@FindBy(name="username")
	WebElement username;
	/**
	 * Same as writing below statement
	 * WebElement username=driver.findElement(By.name("username")); 
	 */
		
	//@FindBy(name="password11")
	@FindBy(name="password")
	WebElement password;
	
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
	
	public ForgotPasswordPage clickForgotPassWord(){
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
	public HomePage login(String uname, String pwd){
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}

	
}

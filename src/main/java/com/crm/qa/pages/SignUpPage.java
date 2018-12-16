package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{



	


@FindBy(xpath=".//*[@id='navbar-collapse']/ul/li[2]/a/font")
WebElement signuppage;

@FindBy(xpath="//input[@name='first_name']")
WebElement firstname1;
	
@FindBy(xpath="//input[@name='surname']")
WebElement lastname1;

@FindBy(xpath="//input[@name='email']")
WebElement email1;

@FindBy(xpath="//input[@name='email_confirm']")
WebElement confirmEmail1;


@FindBy(xpath="//input[@name='username']")
WebElement username1;

@FindBy(xpath="//input[@name='password']")
WebElement password1;

@FindBy(xpath="//input[@name='passwordconfirm']")
WebElement confirmPassword1;

@FindBy(xpath="//input[@type='checkbox']")
WebElement checkbox1;

@FindBy(xpath=".//*[@id='submitButton']")
WebElement submit1;

@FindBy(xpath=".//*[@id='payment_plan_id']")
WebElement editor;
public SignUpPage() throws IOException {
	super();
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public SignUpPage SignupLink() throws IOException
{
	Actions sct=new Actions(driver);
	sct.moveToElement(signuppage).build().perform();
	return new SignUpPage();
	
}


public HomePage signup() throws IOException
{
	
firstname1.sendKeys(prop.getProperty("firstName"));
lastname1.sendKeys(prop.getProperty("lastName1"));
email1.sendKeys(prop.getProperty("email"));
confirmEmail1.sendKeys(prop.getProperty("confirmEmai1"));
username1.sendKeys("username");
confirmPassword1.sendKeys(prop.getProperty("password"));
checkbox1.click();
submit1.click();

/*
firstName=pankaj
lastName1=W
email=Pankajw611@gmail.com
confirmEmail= Pankajw611@gmail.com
username=pankaj611
password=Pankaj611
confirmPassword= pankaj611

*/

return new HomePage();

}
}





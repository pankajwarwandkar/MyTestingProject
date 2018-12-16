package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{

	public SignUpPage(){
		PageFactory.initElements(driver, this);
		
	}
	

	
@FindBy(xpath="//a[@href='https://www.freecrm.com/register/']")
WebElement signuppage;

@FindBy(xpath="//input[@name='first_name']")
WebElement firstname;
	
@FindBy(xpath="//input[@name='surname']")
WebElement lastname;

@FindBy(xpath="//input[@name='email']")
WebElement email;

@FindBy(xpath="//input[@name='email_confirm']")
WebElement confirmEmail1;


@FindBy(xpath="//input[@name='username']")
WebElement username;

@FindBy(xpath="//input[@name='password']")
WebElement password1;

@FindBy(xpath="//input[@name='passwordconfirm']")
WebElement confirmPassword1;

@FindBy(xpath="//input[@type='checkbox']")
WebElement checkbox;

@FindBy(xpath=".//*[@id='submitButton']")
WebElement submit;


public void signup()
{
	
driver.get("url");
firstname.sendKeys("firstName");
lastname.sendKeys("lastName1");


}
}





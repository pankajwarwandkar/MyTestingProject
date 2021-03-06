package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ForgotPasswordPage extends TestBase {
	//input[@name='username']
	
	//Initializing page object
		public ForgotPasswordPage() throws IOException {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@class='button']")
		WebElement getPasswordBtn;
		
		
		public boolean validategetPasswordBtn(){
			return getPasswordBtn.isDisplayed();
		}
		
				

}

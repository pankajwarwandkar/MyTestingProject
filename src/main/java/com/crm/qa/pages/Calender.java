package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class Calender extends TestBase {

	public Calender() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath=".//*[@id='navmenu']/ul/li[2]/a")
	WebElement calender;
	
	@FindBy(xpath =".//*[@id='navmenu']/ul/li[2]/ul/li[1]/a")
	static
	WebElement newEvenet;
	
	
	public  void calenderOpen()
	{
		Actions act= new Actions(driver);
		act.moveToElement(calender).build().perform();
		
	}
	
	public  void newEvent()
	{
		newEvenet.click();
	}
	
	
	
	
	
}

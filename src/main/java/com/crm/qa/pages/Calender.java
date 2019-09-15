package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class Calender extends TestBase {

	public Calender() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath=".//*[@id='navmenu']/ul/li[2]/a")
	WebElement calender;
	
	@FindBy(xpath="//*[@class='ui linkedin button']")
	WebElement newEvenet;
	

	@FindBy(xpath="//*[@class='ui label label right corner']//following::input[1]")
	WebElement titleButton;
	
	@FindBy(name="category")
	WebElement Categery;
	
	@FindBy(xpath="//div[@aria-label='day-2']")
	WebElement date;
	
	@FindBy(xpath="//li[@class='react-datepicker__time-list-item react-datepicker__time-list-item--selected']")
	WebElement time;
	
	 @FindBy(xpath="//*[@id='ui']/div/div/a[2]")
		WebElement calenderClick;
	 
	 
	public  void calenderOpen()
	{
		//Actions act= new Actions(driver);
		//act.moveToElement(calender).build().perform();
		calenderClick.click();
	}
	
	public  void newEvent()
	{
		newEvenet.click();
		titleButton.sendKeys("A1");
		Select s= new Select(Categery);
            s.selectByVisibleText("Optional");
            date.click();
            time.click();
	}
	
	
	
	
	
}

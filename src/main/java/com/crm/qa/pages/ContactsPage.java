package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;



public class ContactsPage extends TestBase{
	
	//Initializing page object
	public ContactsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']/input[@name='contact_id']")).click();
	}
	
	@FindBy(name="title")
	WebElement title;
	
	
	@FindBy(xpath="//*[@id='ui']/div/div/a[3]")
	WebElement contactPageClick;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	
	
	//*[@id='ui']/div/div/a[3]
	
	@FindBy(xpath="//*[contains(text(),'Show Filters')]")
	WebElement showFilter;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement newContact;
	
	
	
	@FindBy(name="client_lookup")
	WebElement companyName;
	
	@FindBy(xpath="//*[@class='save icon']")
	WebElement saveBtn;
	
	public boolean showFilter() {
	return showFilter.isDisplayed(); 	
	}
	
	/*
	public void createNewContact(String titleText, String fName, String lName, String company){
		Select titleDropDown = new Select(title);
		titleDropDown.selectByVisibleText(titleText);
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		companyName.sendKeys(company);
		saveBtn.click();		
		
		
		*/
		
	public void clickOnContactPage() {
		contactPageClick.click();
	}
	
	
	
		public void creadtNewContact(String fName, String lName)
		{
			newContact.click();
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);	
			saveBtn.click();
			
		}
			
		
	} 	
	
	
	


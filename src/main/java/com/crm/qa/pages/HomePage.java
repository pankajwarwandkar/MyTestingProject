package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

/**
 * @CacheLookup annotation is used to improve the performance of the script.
 * When we use @CacheLookup against any webelement with FindBy annotation, 
 * the webelement will be stored in the cache memory so that if the webelement is 
 * accessed multiple times, selenium would look for it in the cache rather than 
 * the HTML page DOM which saves execution time.
 * SO it is good practice is to add @CacheLookup.
 * However, if the page got refreshed or page got changed , then this cache memory may
 * get corrupted and throw StaleElementException.
 *  
 * @author Admin
 *
 */
public class HomePage extends TestBase {
	public LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	//Initializing page object
	public HomePage() throws IOException  {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'User: Amit Pradhan ')]")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/a")
	@CacheLookup
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	@CacheLookup
	WebElement tasksLink;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	//@CacheLookup
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	//@CacheLookup
	WebElement newContactLink;
	
/*
	@FindBy(xpath="//*[@id='ui']/div/div/a[3]")
	WebElement contactPageClick;
	*/
	@FindBy(xpath="//*[@id='ui']/div/div/a[3]")
	WebElement contactPageClick;
	
	public ContactsPage clickOnContactPage() throws IOException {
		 contactPageClick.click();
		 return new ContactsPage();
		
	}
	
	public void homePageTitle(){
		
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,"CRM", "Title is wrong");// use to get homepage title Sep07 2019
		
	}
	
	//public ContactsPage clickOnContactsLink() throws IOException{
		//contactsLink.click();
		//return new ContactsPage();
	//}
	
	//public DealsPage clickOnDealsLink() throws Exception{
		//dealsLink.click();
		//return new DealsPage();
	
		
	
	public void contactPageTitle()
	{
		contactPageClick.click();
		 	String actualTitle=driver.getTitle(); //use to get contect page title Sep07 2019
	  Assert.assertEquals(actualTitle,"CRM", "Title is wrong" );
	}
	
	
/*	public TasksPage clickOnTaskLink(){
		tasksLink.click();
		try {
			return new TasksPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	
	public void clickOnNewContactLink() {
		Actions action= new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
	

}

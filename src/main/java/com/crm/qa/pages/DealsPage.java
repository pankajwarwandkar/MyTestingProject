package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase{

	public DealsPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/a")
	WebElement delsearchlink;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/ul/li[3]/a")
	WebElement fullsearchForm;
	//*[@id='navmenu']/ul/li[5]/ul/li[3]/a
	
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/ul/li[2]/a")
	WebElement dealers;
	
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")
	WebElement newDealer;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/a")
	WebElement dealsicon;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")
	WebElement newdealer;
	
	@FindBy(xpath="html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/input")
	WebElement tit;
	
	@FindBy(xpath="html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[8]/td/input")
	WebElement searcht;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/a")
     WebElement dlink;
	
	@FindBy(xpath=".//*[@id='title']")
    WebElement newTitle;
	
	
	@FindBy(xpath=".//*[@id='prospectForm']/table/tbody/tr[1]/td/input[2]")
    WebElement saveAandCreatNew;
	
	
	public  void fullSearchForm()
	{
		fullsearchForm.click();
   

}
	
	public void newDealerEntery(String titleName)
	{
		newDealer.click();
		newTitle.sendKeys(titleName);
		saveAandCreatNew.click();
	}
	
	public void exsistingDealer(){
		
		dealers.click();
		
	}
	
	public void clickOnDealsLink()
	{
    Actions act=new Actions(driver);
  
    act.moveToElement(delsearchlink).build().perform();
    
    
}
	//check on git
	



}
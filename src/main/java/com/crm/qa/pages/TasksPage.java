package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class TasksPage extends TestBase{


	public TasksPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[6]/a")
	WebElement taskMenu;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[6]/ul/li[1]/a")
	WebElement newTaskButton;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[6]/ul/li[2]/a")
	WebElement fullSearchFormTask;
	

	
	public void taskPageOpen() throws IOException
	{
	Actions act=new Actions(driver);
	act.moveToElement(taskMenu).build().perform();	
}
	
	public void newTask() throws IOException{
		
		newTaskButton.click();	
	}
	
	
	public void fullSearchOnTask() throws IOException
	{
		fullSearchFormTask.click();
}
}
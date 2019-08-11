package com.crm.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SignUpPage;

public class SigninTest extends TestBase{
	private SignUpPage sn;
	public SigninTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	
	}
@Test
	public void signInFunTest() throws IOException
	{
		initialization();

		try {
			sn = new SignUpPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		
		sn.signup();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
	
	
	
	
	
}

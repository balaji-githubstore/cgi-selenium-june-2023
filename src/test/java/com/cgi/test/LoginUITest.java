package com.cgi.test;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;

public class LoginUITest extends AutomationWrapper {
	
	@Test
	public void verifyTitleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");	
	}
	
	@Test
	public void placeholderTest()
	{
		LoginPage loginPage=new LoginPage(driver);
		Assert.assertEquals(loginPage.getUsernamePlaceholder(), "Username");
	}
}
//will start at 4:15 PM IST

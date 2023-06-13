package com.cgi.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1FBSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		//inspect - tagname, attributes, text or not
		//click, type, select
		
//		driver.findElement(By.id("email")).sendKeys("john12345@gmail.com");
		
		
//		By locator=By.id("email");
//		WebElement element= driver.findElement(locator);
//		element.click();
		
//		WebElement element= driver.findElement(By.id("email"));
//		element.click();
		
		
		driver.findElement(By.id("email")).sendKeys("john12345@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("john122");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		driver.quit();
	}

}

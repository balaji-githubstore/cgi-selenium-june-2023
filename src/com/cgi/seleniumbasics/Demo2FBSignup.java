package com.cgi.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo2FBSignup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("http://facebook.com"); //wait for page load
		
		//click on create new account
		
		//check presence of element in 0.5s
		
		driver.findElement(By.linkText("Create new account")).click(); 
		
		//send first name as john
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//enter password as welcome123
		driver.findElement(By.id("password_step_input")).sendKeys("welcome");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
//		selectMonth.selectByValue("12");
		
		//year - 2000
		
		//click on sign up
	}

}

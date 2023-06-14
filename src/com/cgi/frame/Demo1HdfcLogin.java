package com.cgi.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1HdfcLogin {
	
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		//enter customer id as test123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("hello123");
		
		//click on continue
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//come to the main html i.e comeout of frame
		driver.switchTo().defaultContent();
		
//		driver.quit();
	}
	//C://users/currentusername/appdata
	
	//<html>
	
	//Frame 1.1
		//Frame 1.1.1
			//button b
		//Frame 1.1.2
			//Frame 1.1.2
				//button c  //
	//Frame 1.2
		//Frame 1.2.1
			//button a
	
	//Linktext and partial linktext -- text font avaiable in UI
	//xpath -- check for page source

}

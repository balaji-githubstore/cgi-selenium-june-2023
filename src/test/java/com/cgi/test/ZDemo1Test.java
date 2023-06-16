package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ZDemo1Test {
	
	
	@DataProvider
	public String[][] demoLoginData()
	{
		String[][] arr=new String[3][2];
		//i --> number of testcase
		//j--> number of parameters 
		arr[0][0]="john";
		arr[0][1]="john122";
		
		arr[1][0]="peter";
		arr[1][1]="peter123";
		
		arr[2][0]="ken";
		arr[2][1]="ken123";
		
		return arr;
	}
	
//	Saul, saul123, Invalid credentials
//	Kim,kim123, Invalid credentials 

	
	
	@Test(dataProvider = "demoLoginData")
	public void demoLoginTest(String username,String password)
	{
		System.out.println("hello"+username+password);
	}

}

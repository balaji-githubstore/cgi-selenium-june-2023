package com.cgi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] invalidLoginData() {
		Object[][] arr = new Object[2][3];

		arr[0][0] = "saul";
		arr[0][1] = "saul123";
		arr[0][2] = "Invalid credentials";

		arr[1][0] = "kim";
		arr[1][1] = "kim122";
		arr[1][2] = "Invalid credentials";

		return arr;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//Current @Test method name is the sheetname
		String testMethodName=method.getName(); //gives @Test method name		
		Object[][] arr=ExcelUtils.getSheetIntoTwoDimArray("test_data/orange_data.xlsx", testMethodName);
		return arr;
	}

}

package com.cgi.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZDemo2Excel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("test_data/orange_data.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("invalidLoginTest");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] arr=new Object[rowCount-1][cellCount];
		
		//try to print all cell values 
		for(int r=1;r<rowCount;r++)
		{
			for(int c=0;c<cellCount;c++)
			{
				String value= sheet.getRow(r).getCell(c).getStringCellValue();
				
				System.out.println(value);
				arr[r-1][c]=value;
			}
		}
		
		System.out.println(arr);
		
		//read and convert to two dimensional array
		
//		book.close();
//		
//		file.close();

	}

}

package org.DataDrivenAutomation.dataGenerator;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name="Excel")
	public static Object[][] testDataGenerator(Method met) throws Exception
	{
		if(met.getName().equalsIgnoreCase("TC_001_loginFunctionality"))
		{
			FileInputStream file= new FileInputStream("./TestData/TestData.xlsx");
			
			XSSFWorkbook workbook= new XSSFWorkbook(file);
			XSSFSheet loginsheet= workbook.getSheet("login");
			int numberofdata=loginsheet.getPhysicalNumberOfRows();
			Object[][] testdata=new Object[numberofdata][2];
			
			for (int i=0; i<numberofdata;i++)
			{
				XSSFRow row=loginsheet.getRow(i);
				XSSFCell username=row.getCell(0);
				XSSFCell password=row.getCell(1);
				
				testdata[i][0]=username.getStringCellValue();
				testdata[i][1]=password.getStringCellValue();		
			}
			
			return testdata;
		}
		else if (met.getName().equalsIgnoreCase("TC_001_signUpFunctionality"))
		{
			FileInputStream file= new FileInputStream("./TestData/TestData.xlsx");
			
			XSSFWorkbook workbook= new XSSFWorkbook(file);
			XSSFSheet loginsheet= workbook.getSheet("signup");
			int numberofdata=loginsheet.getPhysicalNumberOfRows();
			Object[][] testdata=new Object[numberofdata][2];
			
			for (int i=0; i<numberofdata;i++)
			{
				XSSFRow row=loginsheet.getRow(i);
				XSSFCell username=row.getCell(0);
				XSSFCell password=row.getCell(1);
				
				testdata[i][0]=username.getStringCellValue();
				testdata[i][1]=password.getStringCellValue();		
			}
			
			return testdata;
		}
		else
		{
			Object[][] testdata=new Object[2][2];
			return testdata;
		}
			
	}
	
	/*
	
	@DataProvider(name="ExcelSignUp")
	public static Object[][] testDataGeneratorSignup() throws Exception
	{
		FileInputStream file= new FileInputStream("./TestData/TestData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet loginsheet= workbook.getSheet("signup");
		int numberofdata=loginsheet.getPhysicalNumberOfRows();
		Object[][] testdata=new Object[numberofdata][2];
		
		for (int i=0; i<numberofdata;i++)
		{
			XSSFRow row=loginsheet.getRow(i);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			
			testdata[i][0]=username.getStringCellValue();
			testdata[i][1]=password.getStringCellValue();		
		}
		
		return testdata;		
	}
	*/
	
	
	
}

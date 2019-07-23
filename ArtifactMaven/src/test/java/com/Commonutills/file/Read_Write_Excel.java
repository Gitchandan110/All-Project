package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write_Excel {


		
		private static final String email = null;
		private static final String psd = null;


		public String appURL()  throws IOException {	
			
			File path=new File("C:\\Users\\Chandan\\git\\SeleniumMaven7th-Feb\\InputExcelData\\TestData.xlsx");
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		    XSSFSheet sheet=wb.getSheet("TestData");
		    XSSFRow row=sheet.getRow(0);
		    XSSFCell column=row.getCell(1);
		    String url=sheet.getRow(1).getCell(0).getStringCellValue();
		    fis.close();
			return url;
		    
		   /* FileOutputStream fos=new FileOutputStream(path);
		    row.createCell(1).setCellValue("Pass");
		    wb.write(fos);
		    System.out.println("Excel Write done");
		    fos.close();*/
			
		}
		
		
		public void userCredential(String email, String psd) throws IOException {
			
		File path=new File ("C:\\Users\\Chandan\\git\\SeleniumMaven7th-Feb\\InputExcelData\\TestData.xlsx");
		
	    FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sheet=wb.getSheet("TestData");
	    email=sheet.getRow(1).getCell(1).getStringCellValue();
	    psd=sheet.getRow(1).getCell(2).getStringCellValue();
			
			System.out.println("Admin credential is : " + email);
			
			System.out.println("Password is : " + psd);
			
			
		}
	      

		public static void main(String[] args)  throws IOException {	
	     
	
			Read_Write_Excel readExcel= new Read_Write_Excel();
			readExcel.userCredential(email, psd);
			
	}
}


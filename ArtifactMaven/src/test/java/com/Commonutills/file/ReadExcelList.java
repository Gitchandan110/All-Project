package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelList {


		
		public ArrayList<String> UseExcelData(int colNo) throws IOException {
			
			File path=new File("C:\\Users\\Chandan\\git\\SeleniumMaven7th-Feb\\InputExcelData\\TestData.xlsx");
			
			FileInputStream fis=new FileInputStream(path);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
		    XSSFSheet sheet=wb.getSheet("AppURL");
		    
		    Iterator <Row> rowIterator= sheet.iterator();
		    
		    rowIterator.next();
		    
		    ArrayList<String> list=new ArrayList<String>();
		 
		    while (rowIterator.hasNext()) {
		    	list.add(rowIterator.next().getCell(colNo).getStringCellValue());
		    	
		    }

		    System.out.println("Excel Data List is : "+ list);
			return list;
				    
		}

		
		public static void main (String[] args) throws IOException {
			
			ReadExcelList excelData=new ReadExcelList();
			excelData.UseExcelData(0);
			
		}
		
		
	}



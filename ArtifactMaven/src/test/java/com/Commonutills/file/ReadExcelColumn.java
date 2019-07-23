package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelColumn {

	public ArrayList<String> readExcel(int cellNum) throws IOException {
		
		File path=new File("C:\\Users\\Chandan\\git\\SeleniumMaven7th-Feb\\InputExcelData\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	    XSSFSheet sheet=wb.getSheet("Login");
	    
	    Iterator<Row> rowIterator= sheet.iterator();
	    
	    rowIterator.next();
	    
	 ArrayList<String> list=new  ArrayList<String>();
	 
	    while (rowIterator.hasNext()) {
	    	
	    	list.add(rowIterator.next().getCell(cellNum).getStringCellValue());
	    	
	    	
	    	System.out.println("Excel List are :" + list);
	    }
		return list;
		

	}
	
	
	public static void main(String[] args) throws IOException {
		
		ReadExcelColumn readExcelColumn=new ReadExcelColumn();
		readExcelColumn.readExcel(2);
	}

}

package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading {
static Double value;
	
	public Double read(String filename,String sheetName,int i, int j) throws IOException {
		
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\emiCalculatorMaven\\excel-files\\input.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = null;
		
		String extension = filename.substring(filename.indexOf("."));
		
		if(extension.equals(".xls")) {
			
			wb=new HSSFWorkbook(fis);
			Sheet sh = wb.getSheet(sheetName);
			Cell cell = sh.getRow(i).getCell(j);
			
		    value = cell.getNumericCellValue();
			
		}
		
		else if(extension.equals(".xlsx")) {
			
			wb=new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet(sheetName);
			Cell cell = sh.getRow(i).getCell(j);
			
		    value = cell.getNumericCellValue();
			
		}
		
			
			return value;
		
		
	}
}

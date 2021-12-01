package org.testing;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelChangeValue {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumMven\\testData\\Book2.xlsx");
		
		FileInputStream fin =new FileInputStream(f);
		
		Workbook w =new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(4);
		Cell c = r.getCell(4);
		
		String Value = c.getStringCellValue();
		
		if (Value.equals("kpmutr")) {
			
			c.setCellValue("kam");
			
		} 
		FileOutputStream fout = new FileOutputStream(f);
		
		w.write(fout);
		
		System.out.println("Success");
		
		
	
	}

}

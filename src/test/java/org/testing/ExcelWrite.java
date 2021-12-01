package org.testing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumMven\\testData\\testQa.xlsx");
		
		boolean createNewFile = f.createNewFile();
	 
		System.out.println(createNewFile);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Sheet1");

		
		Row r = s.createRow(0);
		
		Cell c = r.createCell(0);
		
		c.setCellValue("First Name");
		
		Cell c1 = r.createCell(1);
		
		c1.setCellValue("LastName");
		
		Cell c2 = r.createCell(2);
		
		c2.setCellValue("Email");
		
		Cell c3 = r.createCell(3);
		
		c3.setCellValue("Mobile");
		
		Cell c4 = r.createCell(4);
		
		c4.setCellValue("PassWord");
		
		Row r1 = s.createRow(1);
		
        Cell c5 = r1.createCell(0);
		
		c5.setCellValue("Dhinakaran");
		
		Cell c6 = r1.createCell(1);
		
		c6.setCellValue("Karan");
		
		Cell c7 = r1.createCell(2);
		
		c7.setCellValue("www.dhinakrish@gmail.com");
		
		Cell c8 = r1.createCell(3);
		
		c8.setCellValue("8489998518");
		
		Cell c9 = r1.createCell(4);
	
		c9.setCellValue("Dhina@123");
		
		Cell c10 = r.createCell(5);
		
		c10.setCellValue("Message");
		
		Cell c11 = r1.createCell(5);
		c11.setCellValue("I am Dhina");
		FileOutputStream fout = new FileOutputStream(f);
		
		w.write(fout);
		
		System.out.println("Success");
	}

}

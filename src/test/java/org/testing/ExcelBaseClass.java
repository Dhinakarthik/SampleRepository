package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBaseClass {
	
	public static String getInput(int rowNum,int cellNum) throws IOException {


		File f =new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumMven\\testData\\testQa.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(rowNum);
		
		Cell c = r.getCell(cellNum);
		
		int cellType = c.getCellType();
		
		String value = "";
		if (cellType==1) {
			
			 value = c.getStringCellValue();
			
			
		}else if (cellType==0) {
			
			if (DateUtil.isCellDateFormatted(c)) {
				
				Date d = c.getDateCellValue();
				
				 value = String.valueOf(d);
				
			}else {
				
				double d = c.getNumericCellValue();
				
				 value = String.valueOf(d);
			}
			
		}
		
		return value;

	}

}

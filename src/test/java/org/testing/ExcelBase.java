package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBase {
	public static String  UserInput(int rowNumber,int cellNumber) throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumMven\\testData\\Book2.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(rowNumber);
		
		Cell c = r.getCell(cellNumber);
		
	
		int cellType = c.getCellType();
		String value ="";
		if (cellType==1) {
			
			 value = c.getStringCellValue();
			
			
		}else if (cellType==0) {
			
	        if (DateUtil.isCellDateFormatted(c)) {
	        	
	        	Date d = c.getDateCellValue();
	        	
	        	SimpleDateFormat sim = new SimpleDateFormat("dd, MMM, yyyy");
	        	
	        	 value = sim.format(d);
				
			}else {
				double d = c.getNumericCellValue();
				
				long l =(long)d;
				
				 value = String.valueOf(l);
			}
			
		}
		
      return value;
	}
	
	


		

	

}
 
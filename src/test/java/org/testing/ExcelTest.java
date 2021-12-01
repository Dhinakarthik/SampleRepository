package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class ExcelTest {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumMven\\testData\\Book2.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Sheet1");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);

				// declaration & inisilation
				int cellType = c.getCellType();

				if (cellType == 1) {  //----> 1 = String
					String strCellVal = c.getStringCellValue();
					System.out.println(strCellVal);

				} else if (cellType == 0) { //----> 0 = Date & Number
					if (DateUtil.isCellDateFormatted(c)) {

						Date d = c.getDateCellValue();
						SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yyyy");
					    String value = sim.format(d);
					    System.out.println(value);

					}
					double num = c.getNumericCellValue();
					long l = (long) num;
					
					//System.out.println(l);
					      //or
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);

				}

			}

		}

	}

}
        
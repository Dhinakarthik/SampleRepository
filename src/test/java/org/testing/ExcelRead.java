package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumMven\\testData\\Book2.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Sheet1");
		//
		// Row r = s.getRow(3);
		//
		// Cell c = r.getCell(0);
		//
		// System.out.println(c);
		//
		// int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		//
		// System.out.println(physicalNumberOfRows);
		//
		// int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		// System.out.println(physicalNumberOfCells);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				int cellType = c.getCellType(); // 1-->String, 0-->Date or Numeric
				if (cellType == 1) {

					String value = c.getStringCellValue();
					System.out.println(value);

				} else if (cellType == 0) {

					if (DateUtil.isCellDateFormatted(c)) {

						Date d = c.getDateCellValue();

						SimpleDateFormat sim = new SimpleDateFormat("dd, MMM, yyyy");

						String format = sim.format(d);
						System.out.println(format);
						
					}else {
						double d = c.getNumericCellValue();
						long l = (long)d;
						String value = String.valueOf(l);
						System.out.println(value);
					}

				}

			}

		}

	}

}

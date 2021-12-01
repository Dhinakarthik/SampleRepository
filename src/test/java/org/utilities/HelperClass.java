package org.utilities;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	
	public static WebDriver driver;
	
	public static void lanchDriver() {
		
		
        WebDriverManager.chromedriver().setup();
        
         driver = new ChromeDriver();

	}
	
	public static void lanchUrl(String url) {
		
		driver.get(url);

	}
	
	public static void bigWin() {
		
		driver.manage().window().maximize();
	
	}
	
	public static void printTitle() {
		
		String title = driver.getTitle();
        System.out.println(title);
		

	}
    public static void printCurrentUrl() {
    	String url = driver.getCurrentUrl();
        System.out.println(url);

	}
    public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);

	}
    public static void btnClick(WebElement ele) {
    	
    	ele.click();
		
    	

	}
	public static String userInput(int rowNumber,int cellNumber) throws IOException {
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
				
				Date date = c.getDateCellValue();
				
				SimpleDateFormat sim = new SimpleDateFormat("dd, MMM, yyyy");
				
				 value = sim.format(date);
				
				
				
				
			}else {
				double d = c.getNumericCellValue();
				
				long l=(long)d;
				
				 value = String.valueOf(l);
			}
			
			
			
		}
	    return value ;
	}
	public static void closeChrome() {
		driver.close();

	}
    
		
		
		
	

}

package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static Actions a;
	public static TakesScreenshot tk;
	public static Select s;

	public static void launchChrome() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void max() {
		driver.manage().window().maximize();

	}

	public static void printTitle() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void printCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void closeChrome() {

		driver.close();
	}

	public static void quitChrome() {

		driver.quit();
	}

	public static void passValue(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void btnClick(WebElement ele) {

		ele.click();
	}

	public static void printText(WebElement ele) {

		String text = ele.getText();
		System.out.println(text);
	}

	public void printAttribute(WebElement ele) {

		String att = ele.getAttribute("value");
		System.out.println(att);

	}

	public void stopInSec(int sec) throws InterruptedException {
		Thread.sleep(sec);

	}

	public static void moveElement(WebElement ele) {

		a.moveToElement(ele).perform();

	}

	public static void dragToDrop(WebElement source, WebElement target) {

		a.dragAndDrop(source, target);

	}

	public static void clickDouble(WebElement ele) {

		a.doubleClick(ele).perform();

	}

	public static void rightClick(WebElement ele) {
		a.contextClick(ele).perform();

	}

	public static void actionSendKey(WebElement ele, String value) {

		a.moveToElement(ele).sendKeys(value).build().perform();

	}

	public static void actionClick(WebElement ele) {

		a.moveToElement(ele).click();

	}

	public static void alertAccept() {

		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public static void alertDismiss() {

		Alert a = driver.switchTo().alert();

		a.dismiss();
	}

	public static void alertGetText() {

		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);

	}

	public static void alertSendKeys(String value) {

		Alert a = driver.switchTo().alert();
		a.sendKeys(value);

	}

	public static void takeSnapShot(String filePath) throws IOException {

		tk = (TakesScreenshot) driver;

		File src = tk.getScreenshotAs(OutputType.FILE);

		File des = new File(filePath);

		FileUtils.copyFile(src, des);

	}

	public static String userInput(int rowNumber, int cellNumber) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumMven\\testData\\testQa.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(rowNumber);

		Cell c = r.getCell(cellNumber);

		int cellType = c.getCellType();
		String value = "";
		if (cellType == 1) {

			value = c.getStringCellValue();

		} else if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(c)) {

				Date date = c.getDateCellValue();

				SimpleDateFormat sim = new SimpleDateFormat("dd, MMM, yyyy");

				value = sim.format(date);

			} else {
				double d = c.getNumericCellValue();

				long l = (long) d;

				value = String.valueOf(l);
			}

		}
		return value;
	}

	public static void selectValue(WebElement ele, String value) {

		s = new Select(ele);

		s.selectByValue(value);

	}

	public static void selectIndex(WebElement ele, int value) {

		s = new Select(ele);

		s.selectByIndex(value);

	}

	public static void selectVisibleText(WebElement ele, String value) {

		s = new Select(ele);

		s.selectByVisibleText(value);

	}
	private void dhina() {
		System.out.println("Dhinakaran");

	}
}

package com.actitime.rough;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.all_test_scripts.SuperTestScript;

public class Rough extends SuperTestScript
{
	@Test
	public void takesScreenshot() throws Exception
	{
		PDFTextStripper stripper = new PDFTextStripper();
		stripper.setStartPage(1);
		WebDriver webDriver = new FirefoxDriver();
		File f1 = new File("D://Study/testdata.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		Workbook w1 = WorkbookFactory.create(fis);
		String data = w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		driver.switchTo().frame(1);
		driver.switchTo().frame("attributeValue");
		driver.findElement(By.id("attributeValue"));
		driver.switchTo().defaultContent();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		TakesScreenshot screenshot = ((TakesScreenshot)webDriver);
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File targerFile = new File("./Practice/FailureSceenshots");
		FileUtils.moveFile(sourceFile, targerFile);
		
	}
}

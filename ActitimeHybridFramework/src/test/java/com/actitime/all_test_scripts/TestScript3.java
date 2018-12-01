package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class TestScript3 extends SuperTestScript
{
	@Test
	public  void testTestscript3()
	{
		
		String un = ExcelLibrary.readData("Sheet2", 1, 0);
		String pw = ExcelLibrary.readData("Sheet2", 1, 1);
		String expTitle = ExcelLibrary.readData("Sheet2", 1, 3);
		String actTitle = driver.getTitle();
		ExcelLibrary.writeData("Sheet2", 1, 4, actTitle);
		String hExpTitle = ExcelLibrary.readData("Sheet2", 1, 5);
		
		ValidationLibrary.verifyTitle(expTitle, actTitle);
		LoginPage lp = new LoginPage();
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		String hActTitle = driver.getTitle();
		ExcelLibrary.writeData("Sheet2", 1, 6, hActTitle);
		ValidationLibrary.verifyTitle(hExpTitle, hActTitle);
		

	}
}

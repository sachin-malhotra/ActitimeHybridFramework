package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class TestScript1 extends SuperTestScript
{
	@Test
	public  void testTestscript1()
	{
		
		String un = ExcelLibrary.readData("Sheet1", 1, 0);
		String pw = ExcelLibrary.readData("Sheet1", 1, 1);
		
		LoginPage lp = new LoginPage();
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		
	}
	
}

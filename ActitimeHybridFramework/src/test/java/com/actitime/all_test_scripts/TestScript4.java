package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class TestScript4 extends SuperTestScript
{
	@Test
	public void testTestScript4()
	{
		String un = ExcelLibrary.readData("Sheet3", 1, 0);
		String pw = ExcelLibrary.readData("Sheet3", 1, 1);
		String expErr = ExcelLibrary.readData("Sheet3", 1, 2);
		LoginPage lp = new LoginPage();
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		String actErr = lp.fetchErrorMsg();
		ExcelLibrary.writeData("Sheet3", 1, 3, actErr);
		
		ValidationLibrary.verifyErrorMsg(expErr, actErr);

	}
}



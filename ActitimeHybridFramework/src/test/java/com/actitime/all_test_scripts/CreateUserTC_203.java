package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class CreateUserTC_203 extends SuperTestScript
{
	@Test
	public void testCreateUserTC_203()
	{
		String un = ExcelLibrary.readData("TC_203", 1, 0);
		String pw = ExcelLibrary.readData("TC_203", 1, 1);
		String newun = ExcelLibrary.readData("TC_203", 1, 2);
		String newpw = ExcelLibrary.readData("TC_203", 1, 3);
		String retypw = ExcelLibrary.readData("TC_203", 1, 4);
		String fn = ExcelLibrary.readData("TC_203", 1, 5);
		String ln = ExcelLibrary.readData("TC_203", 1, 6);
		String expMsg = ExcelLibrary.readData("TC_203", 1, 7);
		
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		UserListPage ulp = new UserListPage();
		AddNewUserPage anup = new AddNewUserPage();
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickOnUsersLink();
		ulp.clickOnAddNewUserButton();
		anup.enterUsername(newun);
		anup.enterPassword(newpw);
		anup.reEnterPassword(retypw);
		anup.enterFirstName(fn);
		anup.enterLastName(ln);
		anup.clickCreateUserButton();
		String actMsg = ulp.fetchSucessMsg();
		ExcelLibrary.writeData("TC_203", 1, 8, actMsg);
		ulp.clickLogout();
		String status = ValidationLibrary.verifySucessMsg(expMsg, actMsg);
		ExcelLibrary.writeData("TC_203", 1, 9, status);
		
	}
}
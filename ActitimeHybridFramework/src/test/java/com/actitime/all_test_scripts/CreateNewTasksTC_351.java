package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class CreateNewTasksTC_351 extends SuperTestScript
{
	@Test
	public void testCreateNewTasksTC_351()
	{
		String un = ExcelLibrary.readData("TC_351", 1, 0);
		String pwd = ExcelLibrary.readData("TC_351", 1, 1);
		String taskname = ExcelLibrary.readData("TC_351", 1, 2);
		String expMsg = ExcelLibrary.readData("TC_351", 1, 3);
		
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		AddNewTasksPage antp = new AddNewTasksPage();
		UserListPage ulp = new UserListPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickLoginButton();
		patp.clickAddNewTasksButton();
		antp.selectCustomerDropdown(3);
		antp.selectProjectDropdown("1");
		antp.enterTaskName(taskname);
		antp.selectBillingTypeDropdown("Billable");
		antp.clickCreateTasksButton();
		String actMsg = ulp.fetchSucessMsg();
		ExcelLibrary.writeData("TC_351", 1, 4, actMsg);
		patp.clickLogout();
		String status = ValidationLibrary.verifySucessMsg(expMsg, actMsg);
		ExcelLibrary.writeData("TC_351", 1, 5, status);
		
	}
		
}

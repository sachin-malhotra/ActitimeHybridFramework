package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class CreateNewProjectTC_350 extends SuperTestScript
{
	@Test
	public void testCreateNewProjectTC_350()
	{
		String un = ExcelLibrary.readData("TC_350", 1, 0);
		String pwd = ExcelLibrary.readData("TC_350", 1, 1);
		String projectName = ExcelLibrary.readData("TC_350", 1, 2);
		String expMsg = ExcelLibrary.readData("TC_350", 1, 3);
		
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
		AddNewProjectPage anpp = new AddNewProjectPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickLoginButton();
		patp.clickProjectsAndCutomersButton();
		apacp.clickAddNewProjectButton();
		anpp.selectCustomerDropdown(2);
		anpp.enterProjectName(projectName);
		anpp.clickOnCreateProjectButton();
		String actMsg = apacp.fetchSucessMessege();
		ExcelLibrary.writeData("TC_350", 1, 4, actMsg);
		apacp.clickLogout();
		String status = ValidationLibrary.verifySucessMsg(expMsg, actMsg);
		ExcelLibrary.writeData("TC_350", 1, 5, status);
	}
}

package com.actitime.all_test_scripts;

import org.testng.annotations.Test;

public class CreateNewCustomerTC_125 extends SuperTestScript
{	@Test
	public  void testCreateNewCustomerTC_125()
	{
	
	String un = ExcelLibrary.readData("TC_125", 1, 0);
	String pw = ExcelLibrary.readData("TC_125", 1, 1);
	String cn = ExcelLibrary.readData("TC_125", 1, 2);
	String expres = ExcelLibrary.readData("TC_125", 1, 3);
	LoginPage lp = new LoginPage();
	ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
	ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
	lp.enterUserName(un);
	lp.enterPassword(pw);
	lp.clickLoginButton();
	patp.clickProjectsAndCutomersButton();
	apacp.clickAddNewCustomerButton();
	AddNewCustomerPage anc = new AddNewCustomerPage();
	anc.enterCustomerName(cn);
	anc.clickCreateCustomerButton();
	String actRes = apacp.fetchSucessMessege();
	ExcelLibrary.writeData("TC_125", 1, 4,actRes);
	
	ValidationLibrary.verifySucessMsg(expres, actRes);
	
	apacp.clickLogout();
	
	}
}

package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage
{
	@FindBy(css="input[value='Add New User']")
	private WebElement addNewUserButton;
	@FindBy(className="successmsg")
	private WebElement successMsg;
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	
	
	public UserListPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickOnAddNewUserButton()
	{
		addNewUserButton.click();
	}
	public String fetchSucessMsg()
	{
		String msg = successMsg.getText();
		return msg;
	}
	public void clickLogout()
	{
		logoutButton.click();
	}
	
	
}

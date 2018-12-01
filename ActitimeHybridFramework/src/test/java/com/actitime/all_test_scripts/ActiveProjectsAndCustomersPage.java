package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomersPage 
{
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectButton;
	
	@FindBy(className="successmsg")
	private WebElement sucessMessege;
	
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	
	public ActiveProjectsAndCustomersPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickAddNewCustomerButton()
	{
		addNewCustomerButton.click();
	}
	public void clickAddNewProjectButton()
	{
		addNewProjectButton.click();
	}
	public String fetchSucessMessege()
	{
		String actMsg = sucessMessege.getText();
		return actMsg;
	}
	
	public void clickLogout()
	{
		logoutButton.click();
	}
}

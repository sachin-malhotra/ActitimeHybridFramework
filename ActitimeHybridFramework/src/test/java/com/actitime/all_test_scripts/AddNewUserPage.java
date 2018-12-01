package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage 
{
	@FindBy(name="username")
	private WebElement usernameTextBox;
	
	@FindBy(name="passwordText")
	private WebElement passwordTextBox;
	
	@FindBy(name="passwordTextRetype")
	private WebElement retypePasswordTextBox;
	
	@FindBy(name="firstName")
	private WebElement firstNameTextBox;
	
	@FindBy(name="lastName")
	private WebElement lastNameTextBox;
	
	@FindBy(css="input[value='   Create User   ']")
	private WebElement createUserButton;
	
	public AddNewUserPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterUsername(String un)
	{
		usernameTextBox.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
	public void reEnterPassword(String repwd)
	{
		retypePasswordTextBox.sendKeys(repwd);
	}
	public void enterFirstName(String fn)
	{
		firstNameTextBox.sendKeys(fn);
	}
	public void enterLastName(String ln)
	{
		lastNameTextBox.sendKeys(ln);
	}
	public void clickCreateUserButton()
	{
		createUserButton.click();
	}
}

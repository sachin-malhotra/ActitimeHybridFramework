package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="username")
	private WebElement userNameTextBox;
	
	@FindBy(name="pwd")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(className="errormsg")
	private WebElement errormsg;
	
	public LoginPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterUserName(String un)
	{
		userNameTextBox.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public String fetchErrorMsg()
	{
		String actErr = errormsg.getText();
		return actErr;
	}
}























package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage 
{
	@FindBy(name="name")
	private WebElement customerNameTextBox;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterCustomerName(String cn)
	{
		customerNameTextBox.sendKeys(cn);
	}
	public void clickCreateCustomerButton()
	{
		createCustomerButton.click();
	}
}

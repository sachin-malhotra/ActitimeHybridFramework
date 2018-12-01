package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage 
{
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	
	@FindBy(name="name")
	private WebElement projectNameTextBox;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	
	public AddNewProjectPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void selectCustomerDropdown(int i)
	{
		Select dropdown = new Select(customerDropdown);
		dropdown.selectByIndex(i);
	}
	public void enterProjectName(String projectName)
	{
		projectNameTextBox.sendKeys(projectName);
	}
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
	}
}

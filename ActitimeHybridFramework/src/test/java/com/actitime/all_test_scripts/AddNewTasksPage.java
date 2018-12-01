package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewTasksPage 
{
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	
	@FindBy(name="projectId")
	private WebElement projectDropdown;
	
	@FindBy(name="task[0].name")
	private WebElement taskNameTextBox;
	
	@FindBy(name="task[0].billingType")
	private WebElement billingTypeDropdown;
	
	@FindBy(xpath="//input[@value='Create Tasks']")
	private WebElement createTasksButton;
	
	public AddNewTasksPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void selectCustomerDropdown(int indexNumber)
	{
		Select cdd = new Select(customerDropdown);
		cdd.selectByIndex(indexNumber);
	}
	public void selectProjectDropdown(String valuesValue)
	{
		Select pdd = new Select(projectDropdown);
		pdd.selectByValue(valuesValue);
	}
	public void enterTaskName(String tn)
	{
		taskNameTextBox.sendKeys(tn);
	}
	public void selectBillingTypeDropdown(String visibleText)
	{
		Select btdd = new Select(billingTypeDropdown);
		btdd.selectByVisibleText(visibleText);
	}
	public void clickCreateTasksButton()
	{
		createTasksButton.click();
	}
}

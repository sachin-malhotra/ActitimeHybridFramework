package com.actitime.all_test_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsAndTasksPage 
{
	@FindBy(partialLinkText="Customers")
	private WebElement projectsAndCutomersButton;
	
	@FindBy(linkText="Users")
	private WebElement usersLink;
	
	@FindBy(xpath="//input[@value='Add New Tasks']")
	private WebElement addNewTasksButton;
	
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	
	public ProjectsAndTasksPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickProjectsAndCutomersButton()
	{
		projectsAndCutomersButton.click();
	}
	public void clickOnUsersLink()
	{
		usersLink.click();
	}
	public void clickAddNewTasksButton()
	{
		addNewTasksButton.click();
	}
	public void clickLogout()
	{
		logoutButton.click();
	}
}

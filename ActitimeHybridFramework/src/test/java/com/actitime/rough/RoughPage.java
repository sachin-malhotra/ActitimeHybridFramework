package com.actitime.rough;

import org.openqa.selenium.interactions.Actions;
import com.actitime.all_test_scripts.SuperTestScript;

public class RoughPage extends SuperTestScript
{

	
	public void testRoughPage()
	{
	
		Actions a1 = new Actions(driver);
		a1.clickAndHold().moveByOffset(30, 0).release();
		
		
	}
}

package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BaseHooks;

public class ViewTasks extends BaseHooks {
	//private WebDriver driver;

	public ViewTasks() {
	//	this.driver = driver;
	}
	
 
  
	public String getConfirmationMessage() {
		// verify task message created successfully			
		return getText(getWebElement("xpath=//div[contains(@title,'Bootcamp')]"));
}
}

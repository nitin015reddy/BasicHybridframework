package com.selenium.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.api.SeleniumBase;
import com.selenium.base.BaseHooks;


public class CreateTasksPage extends BaseHooks {
	public CreateTasksPage() {		
	}

	public CreateTasksPage clickOnShowMore() {
		// click on drop down 
		click(getWebElement("xpath=//a[contains(@title,'Show one more action')]"));
		return this;
	}

	public CreateTasksPage clickOnNewTaskButton() throws InterruptedException {
		// click on new task
		click(getWebElement("xpath=//a[contains(@title,'New Task')]"));
		Thread.sleep(3000);
		return this;
	}
	
	public CreateTasksPage enterSubject(String sub) throws InterruptedException {
		// Enter subject as "Bootcamp"
		type(getWebElement("xpath=//input[contains(@class,'slds-combobox__input slds-input')]"), sub);
				Thread.sleep(2000);
		return this;
	}
	
	
	public CreateTasksPage clickOnStatusDropdown() throws InterruptedException {
		// Select status as 'Waiting on someone else'
		click(getWebElement("xpath=//div/a[contains(text(),'Not Started')]"));				
		return this;
	}
	
	
	public CreateTasksPage selectStatusValue() throws InterruptedException {
		// Select status as 'Waiting on someone else'
		click(getWebElement("xpath=//a[contains(@title,'Waiting on someone else')]"));
		return this;
	}
	
	public ViewTasks clickOnSaveTask() throws InterruptedException {
		// click on Save
		click(getWebElement("xpath=//div/button[3][contains(@title,'Save')]"));
		Thread.sleep(4000);
		return new ViewTasks();
	}
	
}

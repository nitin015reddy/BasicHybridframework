package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BaseHooks;

public class CreateWorkTypePage extends BaseHooks  {

	//private WebDriver driver;

	public CreateWorkTypePage() {
//		this.driver = driver;
	}
	
	public CreateWorkTypePage clickOnNewWorkTypeButton() throws InterruptedException {
		// click on new worktype button 
		click(getWebElement("xpath=//div[(text()='New')]"));
	//	driver.findElement(newbutton).click();
		Thread.sleep(3000);
		return this;
	}
	
	public CreateWorkTypePage enterWorkTypeName(String sub) throws InterruptedException {
		// Enter worktypename as "Bootcamp"
		
		type(getWebElement("xpath=//input[contains(@maxlength,'255')]"), sub);
	//			driver.findElement(subject).sendKeys(sub);
				Thread.sleep(2000);
		return this;
	}
	
	public CreateWorkTypePage clickOnSaveForWorkType() throws InterruptedException {
		// click on Save
		click(getWebElement("xpath=//div/button[3][contains(@title,'Save')]"));
	//			driver.findElement(save).click();
				Thread.sleep(4000);
				System.out.println("Saved new worktype");
		return this;		

	}


	public String getConfirmationMessage() {
		// TODO Auto-generated method stub
		return getText(getWebElement("xpath=//li[contains(text(),'Complete this field.')]"));
	//	return driver.findElement(actual).getText();
	}
}

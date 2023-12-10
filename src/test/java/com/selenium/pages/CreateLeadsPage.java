package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.base.BaseHooks;

public class CreateLeadsPage extends BaseHooks {

//	private WebDriver driver;
	
	public CreateLeadsPage() {
	//	this.driver = driver;
	}
	
	
	public CreateLeadsPage clickOnLeadsTab() throws InterruptedException {
		// click on leadstab
		javascriptClick(getWebElement("xpath=//span[(text()='Leads')][1]"));
		Thread.sleep(5000);
		return this;
	}
	

	public CreateLeadsPage clickOnNewLeadButton() throws InterruptedException {
		// click on new button on leads page
		click(getWebElement("xpath=//button[contains(text(),'New')]"));
		Thread.sleep(3000);
		return this;
	}
	
	public CreateLeadsPage clickOnsalutationDropdown() throws InterruptedException {	
		// click on salutation dropdown
		click(getWebElement("xpath=//button[contains(@aria-label,'Salutation')]"));
					Thread.sleep(3000);
		return this;
	}
	
	public CreateLeadsPage selectSalutationValue() throws InterruptedException {	
		// select salutation value
		click(getWebElement("xpath=//span[contains(@title,'Mr.')]"));
				Thread.sleep(3000);
		return this;
	}
	
	public CreateLeadsPage enterFirstName(String fname) throws InterruptedException {
		// Enter first name
		type(getWebElement("xpath=//input[contains(@placeholder,'First Name')]"), fname);		
				Thread.sleep(2000);
		return this;
	}
	
	
	public CreateLeadsPage enterLastName(String lname) throws InterruptedException {
		// Enter last name
		type(getWebElement("xpath=//input[contains(@placeholder,'Last Name')]"), lname);		
				Thread.sleep(2000);
		return this;
	}
	
	public CreateLeadsPage enterCompany(String com) throws InterruptedException {
		// Entercompany
		type(getWebElement("xpath=//input[contains(@name,'Company')]"), com);			
				Thread.sleep(2000);
		return this;
	}
	
	public CreateLeadsPage clickOnLeadStatusDropdown() throws InterruptedException {
		// Select status 
		scrollIntoView(getWebElement("xpath=//button[contains(@aria-label,'Open - Not')]"));
		click(getWebElement("xpath=//button[contains(@aria-label,'Open - Not')]"));
	/*	WebElement elem = driver.findElement(status);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elem);
		// click on lead status dropdown and select value
		elem.click(); */
		return this;
	}
	
	public CreateLeadsPage selectLeadStatusValue() throws InterruptedException {
		// Select status 	
		click(getWebElement("xpath=//span/span[contains(@title,'Working - Contacted')]"));	
		Thread.sleep(1000);
		return this;
	}
	
	
	
	public CreateLeadsPage clickOnSaveLead() throws InterruptedException {
		// click on Save
		click(getWebElement("xpath=//button[contains(@name,'SaveEdit')]"));
				Thread.sleep(4000);
				System.out.println("created new lead");
		return this;
	}
	
	public String getConfirmationMessage() {
		// TODO Auto-generated method stub
		return getText(getWebElement("xpath=//div[contains(@title,'Lead')]"));
	//	return driver.findElement(By.xpath("//div[contains(@title,'Lead')]")).getText();
	}
	
}

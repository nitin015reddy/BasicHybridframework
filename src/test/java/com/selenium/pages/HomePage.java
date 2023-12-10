package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.api.SeleniumBase;
import com.selenium.base.BaseHooks;
import com.selenium.utils.ReadProperties;

public class HomePage extends BaseHooks {
	
	//private WebDriver driver;
//No NEED TO INITIALIZE DRIVER AS WE ARE EXTENDING BASEHOOKS WHICH EXTENDS SELENIUM BASE WHERE WE DECAED DRIVERAT GLOBAL LEVEL
	public HomePage() {
//		this.driver = driver;
	}

//Store the ID of the original window	
	
//check for list conversation to hybrdi model base design
	
	By scrolltiles = By.xpath("//article//h2/span");
	
	
	public HomePage clickonAppLaunch() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(getWebElement("xpath=//*[contains(@class,'slds-icon-waffle')]"));
		click(getWebElement("xpath=//div[starts-with(@class,'slds-icon-waffle')]"));
		Thread.sleep(3000);
		return this;
	}

	public HomePage clickonViewAll() throws InterruptedException {
		click(getWebElement("xpath=//button[contains(@aria-label,'View All Applications')]"));
		Thread.sleep(8000);
		return this;
	}

	// enter Tasks in search bar
	public HomePage searchonAppLaunch(String field) throws InterruptedException {
		type(getWebElement("xpath=//input[contains(@placeholder,'Search apps or items...')]"), field);
		return this;
	}

	public CreateTasksPage clickOnTasksLink() throws InterruptedException {
		// click on Tasks link
		javascriptClick(getWebElement("xpath=//a[contains(@data-label,'Tasks')]"));
		Thread.sleep(4000);
		return new CreateTasksPage();
	}

	public CreateWorkTypePage clickonWorkTypesLink() throws InterruptedException {
		// click on work types link
		javascriptClick(getWebElement("//a[contains(@data-label,'Work Types')]"));
		Thread.sleep(4000);
		return new CreateWorkTypePage();

	}
	
	public CreateLeadsPage clickonSalesLink() throws InterruptedException {
		// click on sales link
		click(getWebElement("xpath=//p[(text()='Sales')]"));
		Thread.sleep(4000);
		return new CreateLeadsPage();
	}
	
	public ViewOpportunityListPage clickonSaleslinkforopp() throws InterruptedException {
		// click on sales link
		click(getWebElement("xpath=//p[(text()='Sales')]"));
		Thread.sleep(4000);
		return new ViewOpportunityListPage();
	}
	
	
	public UpdateCasePage clickonSalesLinkCase() throws InterruptedException {
		// click on sales link
		click(getWebElement("xpath=//p[(text()='Sales')]"));
		Thread.sleep(4000);
		return new UpdateCasePage();
	}
	
	
	public HomePage getTileinfo() throws InterruptedException {
		List<WebElement> list =driver.findElements(scrolltiles);	    
	    for(WebElement element:list ){	        	
	    if(element.getText().equals("Mobile Publisher"))
	    {	    
	    System.out.println("Match Found");
	    Thread.sleep(2000);
	    break;
	    }  }	    
	    Thread.sleep(5000);	    
	    //Check we don't have other windows open already
		return this;
	}
	
	public ConfirmRedirectPageforHelpTiles clickOnLearnMore() {
	//Click the link which opens in a new window
		click(getWebElement("xpath=//span[contains(text(),'Learn More')]"));
	    return new ConfirmRedirectPageforHelpTiles();
	}

}
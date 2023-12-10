package com.selenium.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.base.BaseHooks;

public class SalesforceCertificationsPage extends BaseHooks {
	
//	private WebDriver driver;

	public SalesforceCertificationsPage() {
	//	this.driver = driver;
	}
	
	public SalesforceCertificationsPage clickonAdminIcon() throws InterruptedException {
		//click on Sales force administrator icon
		click(getWebElement("xpath=//a[contains(@href,'administratoroverview')]"));
  // driver.findElement(salesadminicon).click();
		return this;
	}
	
	public SalesforceCertificationsPage scrollIntoView() throws InterruptedException {
	//scroll into view until 1st certification displayed on page		
		scrollIntoView(getWebElement("xpath=//div[contains(@class,'credentials-card_title')]/a"));
	/*   JavascriptExecutor js = (JavascriptExecutor)driver;	
	   WebElement elem = driver.findElement(certifylist);
	   js.executeScript("arguments[0].scrollIntoView(true);", elem);*/
	return this;
	}
	
	
	public SalesforceCertificationsPage verifyCertificationList() throws InterruptedException {
	//verify 6 certifications details displayed	 
	   List<WebElement> list1 =getWebElements("xpath=//div[contains(@class,'credentials-card_title')]/a");        	
	   	if(list1.size()==6)	   	{	
	   		System.out.println("count match");	  	}
	   	else {
	   		System.out.println("count mismatch"); 	}
	   	return this;
	}
	
	public HomePage switchToOriginalTab(int index) {
		switchToWindow(index);
		return new HomePage();		
	}
	
	
	
}

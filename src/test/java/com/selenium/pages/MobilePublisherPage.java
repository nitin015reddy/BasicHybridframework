package com.selenium.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.selenium.base.BaseHooks;

import io.github.sukgu.Shadow;

public class MobilePublisherPage extends BaseHooks {
	
	public MobilePublisherPage() {
	
	}
	
	public MobilePublisherPage getTitle() throws InterruptedException {
		
		String value= getText(getWebElement("xpath=//span[contains(text(),'Create and publish')]"));
	//String value= driver.findElement(windowtitle).getText();  
	   System.out.println(value);
	return this;
	}
	
	public MobilePublisherPage clickOnLearningLink() throws InterruptedException {
	//click on Learning hidden link	   
//*****	IMP:In shadow dom elements no need to give xpath = *****************
	  WebElement learng= findElementByDom("//span[contains(text(),'Learning')]");
	  click(learng);
	  Thread.sleep(1000);
	return this;
	}
	
	public MobilePublisherPage moveToTrailhead() throws InterruptedException {
	//move to learning on trailhead 
	  WebElement ele= findElementByDom("//span[contains(text(),'Learning on Trailhead')]");
	  Action(ele); 
	   Thread.sleep(1000);
	return this;
	}
	
	
	public SalesforceCertificationsPage clickSalesforceLink() throws InterruptedException {
	 //and then click sales force certifications link
	  WebElement cert= findElementByDom("//a[contains(text(),'Salesforce Certification')]");
	  click(cert);
	  Thread.sleep(5000);
	  return new SalesforceCertificationsPage();
	}
}

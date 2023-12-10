package com.selenium.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.selenium.base.BaseHooks;

public class ViewOpportunityListPage extends BaseHooks {

	ArrayList<String> obtainedList2 = new ArrayList<String>();
	ArrayList<String> sortedList = new ArrayList<String>();
//	private WebDriver driver;

	public ViewOpportunityListPage() {
//		this.driver = driver;
		
	}
	//check how to implement hybrid selenium base logic into list here 
	
	
	public ViewOpportunityListPage clickOnOpportunityTab() throws InterruptedException {
		// click on opportunity tab
		
		javascriptClick(getWebElement("xpath=//span[(text()='Opportunities')][1]"));
		System.out.println("Click on Opportunity tab");
	/*	WebElement opportunity = driver.findElement(opport);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", opportunity); */
		Thread.sleep(5000);
		return this;
	}
	
	
	public ViewOpportunityListPage clickOnTableView() throws InterruptedException {
		System.out.println("Click on Table view");
		click(getWebElement("xpath=//button[contains(@title,'Select list display')]"));
	    click(getWebElement("xpath=//a/span[text()='Table']"));
	//	driver.findElement(lview).click();
	//	driver.findElement(drpdwn).click();
		Thread.sleep(3000);		
		return this;
	}
	
	
	public ViewOpportunityListPage getList1() {
		// store table values of close date before sort
				ArrayList<String> obtainedList1 = new ArrayList<String>();
				List<WebElement> list1 = getWebElements("xpath=//table/tbody/tr/td[6]//span/span[contains(@class,'uiOutputDate')]");
				for (WebElement we : list1) {
	//				obtainedList1.add(we.getText());
					String text1= getText(we);
					System.out.println(text1);
					obtainedList1.add(text1);
				}
				System.out.println("Initial stored values from app"+obtainedList1);
				Collections.sort(obtainedList1);
				for (String s : obtainedList1) {
					sortedList.add(s);
				}
				System.out.println("Internal sorted value before sorting in application"+sortedList);
				return this;
	}
	
	
	public ViewOpportunityListPage clickOnSort() throws InterruptedException {
		
		javascriptClick(getWebElement("xpath=//span[contains(@title,'Close Date')]"));
	/*	WebElement sort = driver.findElement(srt);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", sort); */
		Thread.sleep(3000);

		return this;
	}
	
	public ViewOpportunityListPage getList2() {
	// store table values of close date after sort
	//	ArrayList<String> obtainedList2 = new ArrayList<String>();
			List<WebElement> list2 = getWebElements("xpath=//table/tbody/tr/td[6]//span/span[contains(@class,'uiOutputDate')]");
			for (WebElement we : list2) {
				obtainedList2.add(getText(we));
			//	System.out.println("success2");
			}
			System.out.println("after sorted in application values"+obtainedList2);
			return this;
	}

   public ViewOpportunityListPage compareLists() {
	// compare two lists
			Assert.assertTrue(obtainedList2.equals(sortedList));
			return this;
   }
	
	
}

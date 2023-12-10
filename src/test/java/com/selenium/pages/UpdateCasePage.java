package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.base.BaseHooks;

public class UpdateCasePage  extends BaseHooks {
   
	public UpdateCasePage() {
	}
			
	
	
	public UpdateCasePage clickOnShowMore() {
		System.out.println("Click on more");
		click(getWebElement("xpath=//span[contains(text(),'More')]"));
	//	driver.findElement(mre).click();
		return this;		
	}
	
	public UpdateCasePage clickOnCaseTab() throws InterruptedException {
		System.out.println("Click cases on more");
		javascriptClick(getWebElement("xpath=//a/span/span[contains(text(),'Cases')]"));
	/*	WebElement cases = driver.findElement(Casess);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cases);  */
		Thread.sleep(3000);
		return this;
	}
	
	public UpdateCasePage VerifyCaseMatch(String caseowner) {
		System.out.println("view cases");
		List<WebElement> list1 = getWebElements("xpath=//table/tbody/tr/td[6]");
		for (WebElement element : list1) {
			if (getText(element).equals(caseowner)) {
				break;
			}
		}
		return this;
	}
	
	
	public UpdateCasePage clickOnDownArrow() throws InterruptedException {
	click(getWebElement("xpath=//div[contains(@class,'forceVirtualActionMarker forceVirtualAction')]"));
	//driver.findElement(dwnar).click();
	Thread.sleep(5000);
	return this;
	}
	
	
	public UpdateCasePage clickOnEditButton() throws InterruptedException {
	click(getWebElement("xpath=//a[contains(@title,'Edit')]"));
	//driver.findElement(editbtn).click();
	Thread.sleep(3000);
	System.out.println("Edit fields in case");
	return this;
	}
	
	public UpdateCasePage clickOnStatus() throws InterruptedException {
	click(getWebElement("xpath=//button[contains(@aria-label,'Status')]"));
	//driver.findElement(stat).click();
	return this;
	}
	
	public UpdateCasePage Updatestatusvalue() throws InterruptedException {
	click(getWebElement("xpath=//span[contains(@title,'Working')]"));
	//driver.findElement(twrk).click();
	System.out.println(" Update Status as Working");
	return this;
	}
	
	public UpdateCasePage clickOnPriorityDrodpdown() throws InterruptedException {	
	click(getWebElement("xpath=//button[contains(@aria-label,'Priority')]"));
	//driver.findElement(pty).click();
	return this;
	}
	
	public UpdateCasePage updatePriorityValue() throws InterruptedException {
	click(getWebElement("xpath=//span[contains(@title,'Low')]"));
	//driver.findElement(ptl).click();
	System.out.println("Update Priority to low");
	return this;
	}
	
	public UpdateCasePage selectCase() throws InterruptedException {
	click(getWebElement("xpath=//button[contains(@aria-label,'Case Origin')]"));
	//driver.findElement(cas).click();
	return this;
	}
	
	public UpdateCasePage updateCaseValue() throws InterruptedException {
	click(getWebElement("xpath=//span[contains(@title,'Phone')]"));
	//driver.findElement(phon).click();
	System.out.println("Updated Case Origin as Phone");
	Thread.sleep(3000);
	return this;
	}

	
	public UpdateCasePage clickOnSlaDropdown() throws InterruptedException {		
	scrollIntoView(getWebElement("xpath=//button[contains(@aria-label,'SLA Violation')]"));
	click(getWebElement("xpath=//button[contains(@aria-label,'SLA Violation')]"));
/*	WebElement elem = driver.findElement(sla);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", elem);
	driver.findElement(sla).click(); */
	return this;
	}
	
	public UpdateCasePage updateSlaValue() throws InterruptedException {
	click(getWebElement("xpath=//span[(@title='No')]"));
	//driver.findElement(tno).click();
	System.out.println("Update SLA violation to No");
	Thread.sleep(5000);
	return this;
	}
	
	
	public UpdateCasePage clickOnCancel() throws InterruptedException {
	// driver.findElement(By.xpath("//button[contains(@name,'SaveEdit')]")).click();
	click(getWebElement("xpath=//button[contains(@name,'Cancel')]"));
	//driver.findElement(can).click();
	Thread.sleep(5000);
	// System.out.println("clicked Save");
	return this;
	}
	

	public String getStatusActualValue(String caseowner) {
		
		String sColValue = caseowner;
		String Actualvalue = null;
		// First loop will find Nkarr value
		for (int i = 1; i < 10; i++) {
			String sValue = null;
			sValue = getText(getWebElement("xpath=//table/tbody/tr/td[\" + i + \"]"));
		//	sValue = driver.findElement(By.xpath("//table/tbody/tr/td[" + i + "]")).getText();
			if (sValue.equals(sColValue)) {
				Actualvalue = getText(getWebElement("xpath=//table/tbody/tr/td[\" + (i - 2) + \"]"));
		//		Actualvalue = driver.findElement(By.xpath("//table/tbody/tr/td[" + (i - 2) + "]")).getText();
				System.out.println(Actualvalue);
				break;
			}
		}
		return Actualvalue;
		
	}

}

package com.selenium.testsuites;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.base.BaseHooks;
import com.selenium.pages.ConfirmRedirectPageforHelpTiles;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.MobilePublisherPage;

import io.github.sukgu.Shadow;

//no need for dataprovider as not passing any value in this test case from excel
		
public class S10_44AdministratorCertifications extends BaseHooks {
	
	@Test 
	public void AdminCert() throws InterruptedException, IOException {
		new LoginPage()
		.enterUserName("uname")
		.enterPassword("pwd")
		.clickLoginButton()
	//	new HomePage(driver)
	     .getTileinfo()
	     .clickOnLearnMore()
	     .switchToNewTab(1)
	     .clickConfirmLink()  
	 //    MobilePublisherPage mp =new MobilePublisherPage(driver);  
	    .getTitle()
	    .clickOnLearningLink()
	    .moveToTrailhead()
	    .clickSalesforceLink()
	    .clickonAdminIcon()
	    .scrollIntoView()
	    .verifyCertificationList()
	    .switchToOriginalTab(0);
   //how to put this in page object 
 //   driver.switchTo().window(originalWindow);
}
}
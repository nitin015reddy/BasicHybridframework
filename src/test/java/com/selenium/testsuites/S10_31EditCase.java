package com.selenium.testsuites;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.base.BaseHooks;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.UpdateCasePage;

public class S10_31EditCase extends BaseHooks {
 

	@BeforeTest(alwaysRun = true)
	public void beforetest() {
		filename = "S10_31EditCase";
	}


	@Test(dataProvider = "gettestdata")
	public void EditCase(String caseowner) throws InterruptedException, IOException {
		new LoginPage()
		.enterUserName("uname")
		.enterPassword("pwd")
		.clickLoginButton() 
		//new HomePage()
		.clickonAppLaunch()
		.clickonViewAll()
		.clickonSalesLinkCase()
		.clickOnShowMore()
		.clickOnCaseTab()
        .VerifyCaseMatch(caseowner)
		.clickOnDownArrow()
		.clickOnEditButton()
		.clickOnStatus()
		.Updatestatusvalue()
		.clickOnPriorityDrodpdown()
		.updatePriorityValue()
		.selectCase()
		.updateCaseValue()
		.clickOnSlaDropdown()
		.updateSlaValue()
		.clickOnCancel();
		
		 UpdateCasePage uc=new UpdateCasePage();
			//	String Expectedvalue = "Working";
				Assert.assertEquals(uc.getStatusActualValue(caseowner), "Working");
		System.out.println("Case is Edited Successfully  and Status is working");

	}

}

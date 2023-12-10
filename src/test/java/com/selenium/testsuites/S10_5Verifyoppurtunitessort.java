package com.selenium.testsuites;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.base.BaseHooks;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.ViewOpportunityListPage;


public class S10_5Verifyoppurtunitessort extends BaseHooks {
	

/*	@BeforeTest(alwaysRun = true)
	public void beforetest() {
		filename = "S10_5Verifyoppurtunitessort";
	}
*/

//	@Test(dataProvider = "gettestdata")
	
	@Test
	public void VerifyOpportunities() throws InterruptedException, IOException {
		new LoginPage()
		.enterUserName("uname")
		.enterPassword("pwd")
		.clickLoginButton() 
		//new HomePage()
		.clickonAppLaunch()
		.clickonViewAll()
		.clickonSaleslinkforopp()
		.clickOnOpportunityTab()
		.clickOnTableView()
		.getList1()
		.clickOnSort()
		.clickOnSort()
		.getList2()
		.compareLists();
		

	}

}

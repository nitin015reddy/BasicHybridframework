package com.selenium.base;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.selenium.api.SeleniumBase;
import com.selenium.pages.LoginPage;
import com.selenium.utils.ExcelUtility;
import com.selenium.utils.ReadProperties;

public class BaseHooks extends SeleniumBase{
//	public static WebDriver driver;
	public String filename;

	@DataProvider(name = "gettestdata")
	public String[][] getExcelData() {
		System.out.print(filename);
		return ExcelUtility.readExcelValue(filename);
	}

	@BeforeMethod
	// @BeforeClass
	public void launchApplication() throws IOException {
		browser("CHROME");
		open(ReadProperties.readfile("url"));
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--disable-notifications");
	//	driver = new ChromeDriver(options);
	//	driver.manage().window().maximize();
		
		//driver.get(ReadProperties.readfile("url"));		
	//	new LoginPage(driver).enterUserName("uname").enterPassword("pwd").clickLoginButton();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	System.out.println(driver.getTitle());
	}

	
	@AfterMethod
	public void screenshot(ITestResult result) throws IOException {
		if (!result.isSuccess()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("./images/" + result.getName() + ".png"));
		}
		quitBrowser();
	}

}

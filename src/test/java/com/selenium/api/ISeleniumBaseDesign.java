package com.selenium.api;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ISeleniumBaseDesign {
	
	public WebDriver browser(String browserName);
	
	public void closeBrowser();

	public void quitBrowser();

	public void open(String aut);

	public WebElement getWebElement(String locator);

	public List<WebElement> getWebElements(String locator);

	public void type(WebElement ele, String data);

	public void click(WebElement ele);
	
	public void javascriptClick(WebElement ele);
	
	public void scrollIntoView(WebElement ele);

	public boolean verifyTitle(String title);
	
	public String getText(WebElement ele);

	public void selectValueInDropdown(WebElement ele, String text);

	public void moveToParticularElement(WebElement ele); 

	public void switchToWindow(int index);
	
	public boolean switchToWindow(String title);

	public void switchToFrame(WebElement ele);
	
	public void defaultContent();
	
	public byte[] takeSnap();
	
	public void waitForVisible(WebElement ele);
	
	public void defaultWindow(String title);
	
	public void dragAndDrop(WebElement eleSource, WebElement eleTarget);

	public boolean verifySelected(WebElement ele);

	public boolean verifyEnabled(WebElement ele);
     
	public WebElement findElementByDom(String ele);
	
	public void Action(WebElement ele);
	

}
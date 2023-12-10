package com.selenium.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BaseHooks;

import io.github.sukgu.Shadow;

public class ConfirmRedirectPageforHelpTiles extends BaseHooks {
		
	public ConfirmRedirectPageforHelpTiles() {

	}
	
	
	public ConfirmRedirectPageforHelpTiles switchToNewTab(int index) {
		switchToWindow(index);
		return this;		
	}
	
	
	public MobilePublisherPage clickConfirmLink() throws InterruptedException {		 	    
	//click on confirm on new window
	click(getWebElement("xpath=//button[contains(text(),'Confirm')]"));
    Thread.sleep(5000);
    return new MobilePublisherPage();
	}
	
}

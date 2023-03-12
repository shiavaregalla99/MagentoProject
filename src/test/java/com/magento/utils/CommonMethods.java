package com.magento.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.magento.testBase.BaseClass;

public class CommonMethods extends BaseClass{
	
	public static void sendText(WebElement ele,String text) {
		waitForVisibility(ele);
		ele.sendKeys(text);
	}
	
	public static void click(WebElement ele) {
		waitForClickability(ele);
		ele.click();
	}
	
	public static WebDriverWait getWait() {
		WebDriverWait wait= new WebDriverWait(driver,30);
		return wait;
	}
	
	public static void waitForVisibility(WebElement ele) {
		getWait().until(ExpectedConditions.visibilityOf(ele));
	}

	public static void waitForClickability(WebElement ele) {
		getWait().until(ExpectedConditions.elementToBeClickable(ele));
	}
}

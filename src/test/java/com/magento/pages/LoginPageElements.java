package com.magento.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.testBase.BaseClass;

public class LoginPageElements extends BaseClass{
	  //page object without page factory 
//	public WebElement username1=driver.findElement(By.id("email"));
	
     //page object with page factory 
	@FindBy(id="email")
	public WebElement userName;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(id="send2")
	public WebElement loginButton;
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
	//stale element referance exception 
	
}

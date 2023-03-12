package com.magento.testBase;

import com.magento.pages.LoginPageElements;

public class PageIntializer {
	public static LoginPageElements loginpage;
	public static void intialize() {
		loginpage= new LoginPageElements();
	}

}

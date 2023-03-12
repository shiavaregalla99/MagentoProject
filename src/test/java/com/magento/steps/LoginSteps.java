package com.magento.steps;


import org.testng.asserts.SoftAssert;

import com.magento.pages.LoginPageElements;
import com.magento.testBase.BaseClass;
import com.magento.testBase.PageIntializer;
import com.magento.utils.CommonMethods;
import com.magento.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends PageIntializer {
	@Given("User Navigates to the Login Page of the Application")
	public void user_navigates_to_the_login_page_of_the_application() throws Exception {
		BaseClass.setUp("chrome");

	}

	@When("User enters the valid Cerdentails")
	public void user_enters_the_valid_cerdentails() {
		
		CommonMethods.sendText(loginpage.userName,ConfigsReader.getKey("username"));
		CommonMethods.sendText(loginpage.password,ConfigsReader.getKey("password"));
		

	}

	@When("Users Clicks on the login button")
	public void users_clicks_on_the_login_button() {
	    CommonMethods.click(loginpage.loginButton);
		
	}

	@Then("User Successfully login into the application")
	public void user_successfully_login_into_the_application() {
		String actualTitle = BaseClass.driver.getTitle();
		String expectedTitle = "My Account";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle, "title are not matching");
		BaseClass.tearDown();
		sa.assertAll();
	}

}

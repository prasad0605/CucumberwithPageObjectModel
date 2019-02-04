package com.qa.Stepdefinition;

import org.openqa.selenium.By;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Testutil.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Stepdefinition extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
//	@Before()
//	public void setup() {
//		loginpage=new LoginPage();
//	}
//	@After()
//	public void teardown() {
//		driver.quit();
//	}
	@Given("^User open browser and enter Free CRM url$")
	public void user_open_browser_and_enter_Free_CRM_url() throws Throwable {
		TestBase.initialization();
	}

	@Then("^verify login page title$")
	public void verify_login_page_title() throws Throwable {
		loginpage=new LoginPage();
		String title=loginpage.verifypagetitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}

	@Then("^user  login into app$")
	public void user_login_into_app() throws Throwable {
		homepage=loginpage.login();
	}

	@Then("^validate Home Page title$")
	public void validate_Home_Page_title() throws Throwable {
		String title=homepage.verifyHomePagetitle();
		Assert.assertEquals("CRMPRO", title);
		Thread.sleep(3000);
	}

	
}

package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Testutil.TestBase;


public class HomePage extends TestBase{
		//Page Factory-OR
		@FindBy(xpath="//td[contains(text(),'User: Prasad Neeli')]")
		WebElement usernamelabel;
		
		@FindBy(xpath="//a[contains(text(),'Contacts')]")
		WebElement contactslink;
		
		@FindBy(xpath="//a[contains(text(),'Deals')]")
		WebElement dealslink;
		
		@FindBy(xpath="//a[contains(text(),'Tasks')]")
		WebElement takslink;
		
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public String verifyHomePagetitle(){
			return driver.getTitle();
		}
		
		public boolean verifyUsernamelabel(){
			return usernamelabel.isDisplayed();
		}
		
		
}

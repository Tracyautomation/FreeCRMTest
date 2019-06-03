package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	TestUtil testUtil= new TestUtil();
	
	@FindBy(xpath="//*[@id='nav']/ul/li[3]/a")
	WebElement realcourseclick;
	
	@FindBy(xpath="//*[@id='main']/div[1]/div/div[1]/a/img")
	WebElement homepagelogo;
	
	@FindBy(id="header-avator")
	WebElement header;
	
	@FindBy(xpath="//*[@id='header-user-card']/div/div/div[1]/div/a/span")
	WebElement loginstatus;
	
	//initializaing the page object
		public HomePage() throws IOException {
			PageFactory.initElements(driver, this);
			
		}
		
	//Action
		public boolean validateLoginImage(){
			testUtil.hoverToElement(header);	
			return loginstatus.isDisplayed();
		}
		
		public boolean validateLogo(){
			return homepagelogo.isDisplayed();
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		public PracticalcoursePage clickOnPracticalLink(){
			realcourseclick.click();
			return new PracticalcoursePage();
			
		}

}

package com.crm.qa.pages;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	//Page factory-or：
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id='signup-form']/div[5]/input")
	WebElement submitbutton;
	
	
	@FindBy(xpath="//*[@id='head']/a")
	WebElement moocslogn;
 
	//create method
	//initializaing the page object
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	//Actions
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	 public boolean validateMOOCImage(){
		 return moocslogn.isDisplayed();
	 }
	 public HomePage login(String un ,String pw){
		 username.sendKeys(un);
		 password.sendKeys(pw);
		 submitbutton.click();
		 return new HomePage();
	 }
	
	
	
	
	
}

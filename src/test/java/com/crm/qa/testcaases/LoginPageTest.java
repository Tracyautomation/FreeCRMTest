package com.crm.qa.testcaases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	 HomePage homePage;
	 public LoginPageTest(){
			super();
		}
	
	
	@BeforeMethod
	public void setUp() throws IOException{
		
		initialization();
		loginPage= new LoginPage();
		
	}
	@Test(priority=1)
	public void loginPageTitleTest(){
		String pagetitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(pagetitle, "慕课网-登录");
		
	}
	
	@Test(priority=2)
	public void loginPageImageTest(){
		boolean flag = loginPage.validateMOOCImage();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void loginTest() throws Exception{
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
    @AfterMethod
    public void tearDown(){
    	
    	driver.quit();
    }

}

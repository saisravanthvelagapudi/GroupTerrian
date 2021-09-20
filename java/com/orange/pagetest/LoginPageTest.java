package com.orange.pagetest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orange.base.orangebase;
import com.orange.pages.HomePage;
import com.orange.pages.LoginPage;

public class LoginPageTest extends orangebase{
	
	LoginPage loginpage;
	HomePage homepage;
	ExtentSparkReporter reporter;
	ExtentReports extent;

	public LoginPageTest() throws Exception
	{
		super();//it calls orangebase properties

	}
	@BeforeMethod
	public void setUp() throws Throwable 
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("OrangeHRM", title);
	}
	
	@Test(priority = 2)
	public void orangeLogoTest()
	{
		boolean image = loginpage.validateOrangeHRMimage();
		Assert.assertTrue(image);
	}
	
	@Test(priority = 3)
	public void LoginTest() throws Exception 
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

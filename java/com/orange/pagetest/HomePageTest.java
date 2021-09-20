package com.orange.pagetest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orange.base.orangebase;
import com.orange.pages.HomePage;
import com.orange.pages.LoginPage;

public class HomePageTest extends orangebase {
	ExtentSparkReporter reporter;
	ExtentReports extent;

	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() throws Exception
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void orangelogoTest() 
	{
		Assert.assertTrue(homepage.IslogoDisplay());
		System.out.println("Hello1");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

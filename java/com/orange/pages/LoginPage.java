package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orange.base.orangebase;

public class LoginPage extends orangebase{
	
	
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(className ="button")
	WebElement login;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='content']/div[@id='divLogin']/div[@id='divLogo']/img[1]")
	WebElement OrangrHRMlogo;
	

    //Initializing the page objects
	public LoginPage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateOrangeHRMimage()
	{
		return OrangrHRMlogo.isDisplayed();
	}
	
	public HomePage login(String un, String pw) throws Exception
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		login.click();
		return new HomePage();
	}

}

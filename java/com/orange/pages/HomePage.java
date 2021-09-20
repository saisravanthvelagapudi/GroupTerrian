package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.orangebase;

public class HomePage<SystemUsersPage> extends orangebase{

	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
	WebElement OrangrHRMlogo;
	
	@FindBy(xpath="//input[@id='searchDirectory_emp_name_empName']")
	WebElement Directory;
	
	public HomePage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean IslogoDisplay()
	{
		return OrangrHRMlogo.isDisplayed();
	}
		
	}



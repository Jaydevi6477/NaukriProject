package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class LoginPage extends TestBase
{

	public LoginPage()
	{
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement lgn_username;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement lgn_password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement lgn_button;
	
	public void enterUsername(String name)
	{
		lgn_username.sendKeys(name);
	}
	public void enterPassword(String pswd)
	{
		lgn_password.sendKeys(pswd);
	}
	public void clickLogInBtn()
	{
		lgn_button.click();
	}
}

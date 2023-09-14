package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class HomePage extends TestBase
{

	public HomePage()
	{
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="//a[@id='login2']")
	private WebElement loginLink;
	
	@FindBy(xpath="//a[@id='nameofuser']")
	private WebElement status;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement mobile_link;
	
	@FindBy(xpath="//a[@id='cartur']")
	private WebElement cartLink;
	
	
	public void ClickLoginLink()
	{
		loginLink.click();
	}
	
	public String LoginStatus()
	{
		String sta=status.getText();
		System.out.println(sta);
		return sta;	
	}
	
	public void Click_MobileLink()
	{
		mobile_link.click();
	}
	
	public void clickOnCartLink()
	{
		cartLink.click();
	}
}

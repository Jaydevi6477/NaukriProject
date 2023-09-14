package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class CartPage extends TestBase
{
	public CartPage()
	{
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement addtoCart_btn;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	private WebElement placeOrderBtn;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country ;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='card']")
	private WebElement card_no;
	
	@FindBy(xpath="//input[@id='month']")
	private WebElement month ;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement year ;
	
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	private WebElement purchase_btn;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	private WebElement purchase_status ;
	public void Click_AddToCart()
	{
		addtoCart_btn.click();
	}
	public void Click_PlaceOrder()
	{
		placeOrderBtn.click();
	}
	public void enterDetails()
	{
		name.sendKeys("Jaydevi");
		country.sendKeys("India");
		city.sendKeys("Pune");
		card_no.sendKeys("123456");
		month.sendKeys("12");
		year.sendKeys("1992");
			
	}
	public void clickOnPurchase()
	{
		purchase_btn.click();
	}
	
	public String getStatusPurchase()
	{
		return purchase_status.getText();
		
	}
}

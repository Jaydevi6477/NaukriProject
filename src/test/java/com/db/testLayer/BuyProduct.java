package com.db.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.db.pageLayer.CartPage;
import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.testBase.TestBase;
import com.db.utilities.utilClass;


public class BuyProduct extends TestBase
{
	@Test
	public void verifyBuyProductWithLogin() throws InterruptedException
	{
		
		HomePage h=new HomePage();
		h.ClickLoginLink();
	
		LoginPage l=new LoginPage();
		l.enterUsername("Jaydevi");
		l.enterPassword("jaya");
		l.clickLogInBtn();
		Thread.sleep(5000);
		String expected_op=h.LoginStatus();
	
		String actual_op="Welcome Jaydevi";
		Assert.assertEquals(expected_op, actual_op);
		h.Click_MobileLink();
		
		CartPage c=new CartPage();
		c.Click_AddToCart();
		
		utilClass u=new utilClass();
		u.clickOnAlert();
		h.clickOnCartLink();
		c.Click_PlaceOrder();
		c.enterDetails();
		c.clickOnPurchase();
		
		String actual="Thank you for your purchase!";
		Thread.sleep(3000);
		String expected=c.getStatusPurchase();
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void verifyBuyProuductWithoutLogin() throws InterruptedException
	{
		HomePage h=new HomePage();

		h.Click_MobileLink();
		
		CartPage c=new CartPage();
		c.Click_AddToCart();
		
		utilClass u=new utilClass();
		u.clickOnAlert();
		h.clickOnCartLink();
		c.Click_PlaceOrder();
		c.enterDetails();
		c.clickOnPurchase();
		
		String actual="Thank you for your purchase!";
		Thread.sleep(3000);
		String expected=c.getStatusPurchase();
		Assert.assertEquals(actual, expected);
		
	}

}

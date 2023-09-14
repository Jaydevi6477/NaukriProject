package com.db.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.testBase.TestBase;




public class LoginPageTest extends TestBase
{
@Test
public void VerifyLogin() throws InterruptedException
{
	
	HomePage h=new HomePage();
	h.ClickLoginLink();
	
	LoginPage l=new LoginPage();
	l.enterUsername("Jaydevi");
	l.enterPassword("jaya");
	l.clickLogInBtn();
	Thread.sleep(3000);
	String expected_op=h.LoginStatus();
	
	String actual_op="Welcome Jaydevi";
	Assert.assertEquals(expected_op, actual_op);
	
}
}

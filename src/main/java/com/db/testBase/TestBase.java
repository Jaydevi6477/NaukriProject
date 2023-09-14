package com.db.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;

//import com.db.pageLayer.CartPage;
//import com.db.pageLayer.HomePage;
//import com.db.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	public static WebDriver d;
	//@Parameters("browser")
	@BeforeMethod
	public void setUp()
	{
		String br="chrome";
		 if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			d=new FirefoxDriver();
			
		}
		 else if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
		}
		 else if(br.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 d=new EdgeDriver();
			 
		 }
		else
		{
			System.out.println("Please enter correct browser name");
		}
		d.get("https://demoblaze.com/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}
}

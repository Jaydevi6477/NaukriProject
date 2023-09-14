package com.db.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args)throws InterruptedException {
//System.setProperty("webdriver.chrome.driver", "D:\\new\\chromedriver-win32\\chromedriver.exe");
		
		//WebDriver d=new ChromeDriver();
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();

		d.manage().window().maximize();
		d.get("https://www.naukri.com/");
	}

}

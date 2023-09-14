package com.db.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class utilClass extends TestBase
{

	public utilClass()
	{
		PageFactory.initElements(d,this);
	}
	
	public void clickOnAlert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert a=d.switchTo().alert();
		a.accept();
	}
	public static void takeSS(String filename) 
	{
		String path = "C:\\Users\\jaydevi\\eclipse-workspace\\FrameworkProjectArtifact\\src\\main\\java\\screenshot";
		
		
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File des = new File(path + filename+System.currentTimeMillis()+".png");
		try 
		{
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}

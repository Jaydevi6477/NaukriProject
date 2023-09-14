package com.db.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetUp implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Execution Started::"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Execution Successfully completed::"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Execution Failed::"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Execution Skipped::"+result.getName());
	}

}

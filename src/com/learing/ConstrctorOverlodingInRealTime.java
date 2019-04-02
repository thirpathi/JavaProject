package com.learing;


// what is constructor overloading ,give me a example

import java.util.Locale;

class ExtentReports
{
	public ExtentReports(String filepath)
	{
		
	}
	
	public ExtentReports(String filepath,boolean replace)
	{
		
	}
	
	public ExtentReports(String filepath,Locale locale)
	{
		
	}
	
	public ExtentReports(String filepath,String testcasename)
	{
		
	}

}
// same constructor name with differents parameters --->  "constructor overloading"

public class ConstrctorOverlodingInRealTime {
	
	
	public static void main(String[] args) {
		
		ExtentReports er = new ExtentReports("");
		
	}

}

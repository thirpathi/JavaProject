package com.learing;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface UtilitiesEncode
{
	public static String encode(String s)
	{
		byte[] encodepasswd = Base64.encodeBase64(s.getBytes());
		String s1 = new String(encodepasswd);
		System.out.println("encodepasswd value is " + s1);
		return s1;
	}
	
	public static String decode(String encodepasswd)
	{
	    byte[] decodepasswd = Base64.decodeBase64(encodepasswd);
	    String s2 = new String(decodepasswd);
	    System.out.println("decodedpasswd value is " + s2);
	 	return s2;
	}
}


public class EncodeInRealTime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String s = "rudratejas@gmail.com";
		System.out.println(UtilitiesEncode.encode(s));
		String encode = "cnVkcmF0ZWphc0BnbWFpbC5jb20=";
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.gmail.com");   
		d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(UtilitiesEncode.decode(encode));
	    Thread.sleep(5000);
		d.close();
	}

}


/*
 * o/p:-
ok*/

package sree;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Amazon_total_data_insearchbar {

		public static void main(String[] args) throws InterruptedException, Exception {
			System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ap_email")).sendKeys("9666854537");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("asdf123");
			driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(5000);
			Actions actionobj = new Actions(driver);
			WebElement webEl=driver.findElement(By.xpath("//span[text()='Shop by']"));
			
			actionobj.moveToElement(webEl).build().perform();		
			WebElement webEl2=driver.findElement(By.xpath("//span [text()='Mobiles, Computers'] "));
			actionobj.moveToElement(webEl2).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span [text()='Screen Protectors']")).click();
			Thread.sleep(5000);
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='a-box-group a-spacing-top-micro acs_product-title']/a"));
			for (WebElement element : elements)
			{
			        System.out.println(element.getAttribute("title"));
			        
			}
		System.out.println("------------------------------------------------------------------------------------------excel data-------------------------------------------------------------");
			File  f  = new File("C:\\Users\\sree\\Desktop\\Book1.xlsx");
			FileInputStream  FIS = new FileInputStream(f);
			XSSFWorkbook   book  = new XSSFWorkbook(FIS);
			XSSFSheet  sheet = book.getSheetAt(2);
			String s = sheet.getRow(0).getCell(0).getStringCellValue();		
			System.out.println("excel data row values are.................."+s);
	//count all data:				
			int totalrows = sheet.getLastRowNum();
			System.out.println("total rows in sheet3 is....................."+totalrows);
			
			for(int i=0; i<=totalrows;  i++)
			{
				String data = sheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println(data);
			}
			String  x=   "data";
	// value pass to search bar:
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("x");
			driver.findElement(By.xpath("nav-input")).click();
			String  str  = "value";
			
			if(str  == "data" )
			{
				System.out.println("your data is true");
			}
			
			else
			{
				System.out.println("your data is false");
			}
			
		}

	}

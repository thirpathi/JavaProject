package sree;

	
	
	
	

	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Amazon_total_data {

		public static void main(String[] args) throws InterruptedException {
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
			
			Actions a = new Actions(driver);
			WebElement El=driver.findElement(By.xpath("//span[text()='Shop by']"));
			a.moveToElement(El).build().perform();	
			
			WebElement E2=driver.findElement(By.xpath("//span[text()='Mobiles, Computers'] "));
			a.moveToElement(E2).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Screen Protectors']")).click();
			Thread.sleep(5000);
			
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='a-box-group a-spacing-top-micro acs_product-title']/a"));
			for (WebElement element : elements)
			{
			        System.out.println(element.getAttribute("title"));
			}
			
			
		}

		
	}

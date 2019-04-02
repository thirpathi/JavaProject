package sree;

	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Amazonsite_automate {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text() = 'Hello, Sign in']")).click();
	//enter username and password:
			driver.findElement(By.cssSelector("#ap_email")).sendKeys("siri.sirisha.m@gmail.com");
			driver.findElement(By.cssSelector("#continue")).click();
			driver.findElement(By.cssSelector("#ap_password")).sendKeys("141001410");
			driver.findElement(By.cssSelector("#signInSubmit")).click();
	//select the items in categories
			//driver.findElement(By.xpath("//span[text()='Shop by']")).click();
			driver.findElement(By.xpath("//*[contains(text(),'Category')]")).click();
			driver.findElement(By.xpath("(//*[contains(text(),'TV, Appliances, Electronics')])[1]"));		
			WebElement e=driver.findElement(By.xpath("//a[text()='Televisions']"));
			Actions a= new Actions(driver);
			a.moveToElement(e).build().perform();
			Thread.sleep(2000);
			a.doubleClick(e).build().perform();
		//...................................................................................display the all details of selected items:...................................................................................................................
			//WebElement s = driver.findElement(By.xpath("//*[@alt='Samsung 43 ON smart']"));
			WebElement s = driver.findElement(By.xpath("//*[contains(text(),'Samsung 108cms (43 inches) Full HD On Smart LED TV 43N5300 (B...')]"));
			a.moveToElement(s).build().perform();
			a.click(s).build().perform();
			//ac.click();
			String title=driver.findElement(By.xpath("//*[@class='a-size-large']")).getText();
			System.out.println("tv title is............................................"+title);
			//customer reviews with star
			//driver.findElement(By.xpath("(//span[text()='4.5 out of 5 stars'])[1]")).click();
			WebElement r = driver.findElement(By.xpath("(//span[text()='4.5 out of 5 stars'])[1]"));
			a.moveToElement(r).build().perform();
			a.click(r).build().perform();
		/*	Thread.sleep(5000);
			//customer total reviews:
			driver.findElement(By.xpath("//span[text()='111 customer reviews']")).click();
			//tv size
			//driver.findElement(By.xpath("//span[@class='a-button-inner']//button[@id='a-autoid-14-announce'][@type='button']"));
			driver.findElement(By.xpath("//*[@id='a-autoid-14-announce']"));
			driver.findElement(By.xpath(	"//span[text()='49 Inches']"));
			//product cost:		
			driver.findElement(By.xpath("//span[@class='a-size-mini twisterSwatchPrice']"));
		
			*/
			
			
		}

	}
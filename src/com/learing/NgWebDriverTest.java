package com.learing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class NgWebDriverTest {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://juliemr.github.io/protractor-demo/");
        NgWebDriver ngDriver = new NgWebDriver((JavascriptExecutor) driver);
		ngDriver.waitForAngularRequestsToFinish();
        driver.findElement(ByAngular.model("first")).sendKeys("2");
        driver.findElement(ByAngular.model("second")).sendKeys("2");
        //driver.findElement(By.id("gobutton")).click();
        driver.findElement(ByAngular.buttonText("Go!")).click();
        
        Thread.sleep(5000);
       // driver.close();
        
     }
}





/*
o/p:-
  ok*/


/*
 ng-model
 
ng-repeat

ng-binding


byAngular.binding(Str)

byAngular.model(str)

byAngular.options(str)

byAngular.repeater(str) – Angular web table*/
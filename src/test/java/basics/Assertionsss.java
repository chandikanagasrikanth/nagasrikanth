package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionsss {
	/*
	 * hard assert
	 * soft assert
	 */
	WebDriver driver;
	SoftAssert s;
  @Test(priority=1,groups= {"regression"},invocationCount=3)
  public void launch() {
	  driver=new ChromeDriver();
	  WebDriverManager.chromedriver().setup();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  
  }
  @Test(priority=3,groups= {"regression"},invocationCount=3)
  public void pagetitle()
  {
	 
	  System.out.println(driver.getTitle());
	s=new SoftAssert();
	  s.assertEquals(driver.getTitle(), " Store: Buy Electronics products Online at Best Prices in India at Amazon.in");

	//  Assert.assertEquals(driver.getTitle(), " Store: Buy Electronics products Online at Best Prices in India at Amazon.in");
	  System.out.println("hello good morning");
	  s.assertAll();
  }
  
  @Test(priority=4,groups= {"regression"})
  public void mycurrenturl()
  {
	  System.out.println(driver.getCurrentUrl());
  }
  @Test(priority=2,groups= {"regression"})
  public void navigatelink()
  {
	 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
  }
  
}

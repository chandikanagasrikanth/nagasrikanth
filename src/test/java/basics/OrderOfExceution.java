package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderOfExceution {
	WebDriver driver;
  @Test(priority=1)
  public void launch() {
	  driver=new ChromeDriver();
	  WebDriverManager.chromedriver().setup();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  
  }
  @Test(priority=3)
  public void pagetitle()
  {
	 
	  System.out.println(driver.getTitle());
  }
  @Parameters({"product"})
  @Test(priority=2)
  
  public void mycurrenturl(String product)
  {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).click();
	  System.out.println(driver.getCurrentUrl());
  }
  @Test(enabled=false)
  public void navigatelink()
  {
	 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
  }
  
}

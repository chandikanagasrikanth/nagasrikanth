package takescreenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(takescreenshots.ListenerTest.class)
public class DemoListener {

      static WebDriver driver;

      @BeforeTest
      public void openBrowser() {

    	  WebDriverManager.chromedriver().setup();
 		 driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      }

      @Test
      public void OpenSite() {

            driver.get("https://www.amazon.in");

      }

      @Test
      public void clickOnAdvanceJavaLink() {

    		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oppo");
    		driver.findElement(By.id("nav-search-submit-button")).click();


      }
	
	@Test
    public void testToFail() {

          //System.out.println("This method is test to fail");
          //String pageSource = driver.getPageSource();
         // Assert.assertEquals("Amazon.in : oppo", driver.getTitle()); // Forcefully we will fail this  
  	  Assert.assertEquals("Amazon.in : hippo", driver.getTitle()); // Forcefully we will fail this
    }

}

package basics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DatatProviderrr {
  
	WebDriver driver;
	@BeforeClass
    public void openBrowser() {

  	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

	@DataProvider
		  public Object[][] multinput() {
		    return new Object[][] {{ "puma", "Puma - Buy Orignal Puma products in India | Myntra" },{"nike","Nike - Shop for Nike Apparels Online in India | Myntra"},{"Woodland","Woodland - Buy from Woodland Online Store in India | Myntra"}};
		    }
		 
		    @Test(dataProvider = "multinput",groups= {"regression"})
		    public void search(String value,String expected)
		    {
		    	driver.get("https://www.myntra.com/");
		    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/input")).sendKeys(value);
		    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/a")).click();
		    	//Assert.assertEquals(driver.getTitle(), expected);
		    	SoftAssert s= new SoftAssert();
		    	s.assertEquals(driver.getTitle(), expected);
	//s.assertAll();
		    	
		    	System.out.println("hello team");
		    }
}

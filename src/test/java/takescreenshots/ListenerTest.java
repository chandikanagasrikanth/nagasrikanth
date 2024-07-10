package takescreenshots;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

      public void onTestStart(ITestResult result) {
            // TODO Auto-generated method stub
           
      }

      public void onTestSuccess(ITestResult result) {
            // TODO Auto-generated method stub
    	 
    	 
 	                  }
      public void onTestFailure(ITestResult result) {
          // TODO Auto-generated method stub
  	  TakesScreenshot  t = (TakesScreenshot) DemoListener.driver;
  	  
	     File srcFile = t.getScreenshotAs(OutputType.FILE);
	  
	     try {
	     FileUtils.copyFile(srcFile, new File("./ScreenShot/Fail.jpg"));
	  } 
	     catch (IOException e) {
	     e.printStackTrace();
	  }
  	           
  	                  }
         
    public void onTestSkipped(ITestResult result) {
          // TODO Auto-generated method stub
         
    }

      
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
          // TODO Auto-generated method stub
         
    }

      
    public void onStart(ITestContext context) {
          // TODO Auto-generated method stub
         
    }

    public void onFinish(ITestContext context) {
          // TODO Auto-generated method stub
         
    }   
      

}

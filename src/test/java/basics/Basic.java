package basics;

import org.testng.annotations.Test;

public class Basic {
	/*
	 * Excution can through annoted methods
	 * can define order of execution
	 * grouping is possbile
	 * dataproviders
	 * listenres
	 * parallel execution
	 * report
	 * 
	 */
	  @Test(groups= {"smoke"})
	  public void c() {
		  System.out.println("this is c");
	  }
  @Test(groups= {"smoke"})
  public void a() {
	  System.out.println("this is a");
  }
  
  
  
  @Test(groups= {"smoke"})
  public void b() {
	  System.out.println("this is b");
  }

  
}

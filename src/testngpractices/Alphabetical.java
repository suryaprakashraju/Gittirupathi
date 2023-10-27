package testngpractices;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Alphabetical {
  
	
	@Test
  public void test1() {
		 System.out.println("test1");
  }

	@Test
  public void test3() {
		 System.out.println("test3");
  }

	@Test
  public void test2() {
		 System.out.println("test2");
  }
 
  @BeforeTest
  public void setup() 
  {
	  System.out.println("launching browser");
	  
  }

  @AfterTest
  public void tearDown() {
	  
	  System.out.println("closing browser");
  }

}

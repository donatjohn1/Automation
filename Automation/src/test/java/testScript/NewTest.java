package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void sample() {
	  System.out.println("Dona");
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Methord");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Methord");
  }
  @Test
  public void sample3() {
	  System.out.println("T John");
	 
  }

}

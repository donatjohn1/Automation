package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Priority {
  @Test(priority = 1)
  public void sample() {
	  System.out.println("Hiiiii");
  }
  @Test(priority = 3)
  public void number() {
	  System.out.println("12458");
  }
  @Test(priority = 2)
  public void specalCharecter() {
	  System.out.println("*/#@$");
  }
  @Test(priority = 4)
  public void color() {
	  System.out.println("Yellow");
  }
  /*@BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }*/

}

package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Base {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void initialiseBrowser() {
	  driver=new ChromeDriver(); // to open in chrome
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void quitDriver() {
	  //driver.close();
	  
  }

}

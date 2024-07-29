package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base {
  @Test
  public void dropDown() {
	  WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		
		inputForm.click();
		WebElement selectInput=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		selectInput.click();
		
		WebElement dropDown=driver.findElement(By.id("single-input-field"));
		Select select=new Select(dropDown);
		
		select.selectByIndex(3);
  }
}

package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends Base {
  @Test
  public void checkBox() {
	  WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		
		WebElement checkBoxDemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkBoxDemo.click();
		
		WebElement checkBox=driver.findElement(By.id("gridCheck"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
  }
}

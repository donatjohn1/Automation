package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxes extends Base {
	public void checkBox()
	{
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		
		WebElement checkBoxDemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkBoxDemo.click();
		
		WebElement checkBox=driver.findElement(By.id("gridCheck"));
		//checkBox.click();
		System.out.println(checkBox.isSelected());
		
	}
	
	// select all check Boxes
	public void mulCheckBox()
	{
		List<WebElement> mulCheck=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement option:mulCheck) {
			option.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxes c=new CheckBoxes();
		c.initialiseBrowser();
		c.checkBox();
		c.mulCheckBox();
	}

}

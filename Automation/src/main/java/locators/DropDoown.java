package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDoown extends Base {
	
public void dropDown()
{
	WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	
	inputForm.click();
	WebElement selectInput=driver.findElement(By.xpath("//a[@href='select-input.php']"));
	selectInput.click();
	
	WebElement dropDown=driver.findElement(By.id("single-input-field"));
	Select select=new Select(dropDown);
	
	//VisibleText
	/*select.selectByVisibleText("Red");*/
	//Value
	/*select.selectByValue("Yellow");*/
	
	//Index
	select.selectByIndex(3);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DropDoown s1=new DropDoown();
		s1.initialiseBrowser();
		s1.dropDown();
	}

}

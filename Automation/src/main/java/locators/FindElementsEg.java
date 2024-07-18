package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEg extends Base{
	public void findElements()
	{
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		List<WebElement> elements=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement option:elements) {
			option.sendKeys("Hello");
		}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsEg f1=new FindElementsEg();
		f1.initialiseBrowser();
		f1.findElements();
	}

}

package webDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxes extends Base {

	public void checkBox()
	{
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='option-2']"));
		//checkBox.click();
		System.out.println(checkBox.isSelected());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxes c1=new CheckBoxes();
		c1.initialiseBrowser();
		c1.checkBox();
	}

}

package webDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {

	public void radioButton() {
		WebElement radioB=driver.findElement(By.xpath("//input[@value='green']"));
		//System.out.println(radioB.isSelected());
		
		//System.out.println(radioB.isEnabled());
		System.out.println(radioB.isDisplayed());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RadioButton r1=new RadioButton();
		r1.initialiseBrowser();
		r1.radioButton();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base{
public void radioButton()
{

	WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	inputForm.click();
	
	WebElement RadioButtonDemo=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
	RadioButtonDemo.click();
	
	WebElement radioButton=driver.findElement(By.id("inlineRadio2"));
	radioButton.click();
	
	System.out.println(radioButton.isDisplayed());
	
	WebElement show=driver.findElement(By.id("button-one"));
	show.click();
	
	System.out.println(show.getText());
}

public void groupRadioButton()
{
	WebElement rB1=driver.findElement(By.id("inlineRadio21"));
	rB1.click();
	
	System.out.println(rB1.isSelected());
	
	WebElement rB2=driver.findElement(By.id("inlineRadio23"));
	rB2.click();
	
	System.out.println(rB2.isEnabled());
	
	WebElement getResult=driver.findElement(By.id("button-two"));
	getResult.click();
	System.out.println(getResult.getText());
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton r=new RadioButton();
		r.initialiseBrowser();
		r.radioButton();
		r.groupRadioButton();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebCommands extends Base {
// Web commands
	
	public void webCommand()
	{
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello world");
		WebElement send=driver.findElement(By.id("button-one"));
		send.click();
		System.out.println(send.getText());
	}
	
	public void webCommand2()
	{
		WebElement val1=driver.findElement(By.id("value-a"));
		val1.sendKeys("10");
		WebElement val2=driver.findElement(By.id("value-b"));
		val2.sendKeys("15");
		WebElement total=driver.findElement(By.id("button-two"));
		total.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebCommands s1=new WebCommands();
		s1.initialiseBrowser();
		s1.webCommand();
		s1.webCommand2();
		
		
	}

}

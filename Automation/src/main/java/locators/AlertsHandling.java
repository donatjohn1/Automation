package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertsHandling extends Base {
public void alerts()
{
	
	 WebElement optAlert=driver.findElement(By.id("alert-modal"));
	optAlert.click();
	WebElement javaScriptAlerts=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
	javaScriptAlerts.click();
	
	/*
	WebElement click1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	click1.click();
	driver.switchTo().alert().accept();
	
	
	WebElement click2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	click2.click();
	driver.switchTo().alert().dismiss();
	*/
	
	WebElement click3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	click3.click();
	driver.switchTo().alert().sendKeys("124");
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().sendKeys("Text");

	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertsHandling ah= new AlertsHandling();
		ah.initialiseBrowser();
		ah.alerts();
	}

}

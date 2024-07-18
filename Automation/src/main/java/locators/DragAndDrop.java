package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {
public void dragAndDrop()
{
	
	WebElement otherOpt=driver.findElement(By.id("others"));
	otherOpt.click();
	

	WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	
	WebElement drop1=driver.findElement(By.id("mydropzone"));
	Actions action=new Actions(driver);
	action.dragAndDrop(drag1, drop1).perform();
	
	
WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	
	WebElement drop2=driver.findElement(By.id("mydropzone"));
	Actions action2=new Actions(driver);
	action2.dragAndDrop(drag2, drop2).perform();
	
	
WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	
	WebElement drop3=driver.findElement(By.id("mydropzone"));
	Actions action3=new Actions(driver);
	action3.dragAndDrop(drag3, drop3).perform();
	
	
WebElement drag4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	
	WebElement drop4=driver.findElement(By.id("mydropzone"));
	Actions action4=new Actions(driver);
	action4.dragAndDrop(drag4, drop4).perform();
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDrop d=new DragAndDrop();
		d.initialiseBrowser();
		d.dragAndDrop();
	}

}

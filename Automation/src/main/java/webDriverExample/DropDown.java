package webDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class DropDown extends Base{
	public void dropDown()
	{
	WebElement dropDown1=driver.findElement(By.id("dropdowm-menu-1"));
	Select select=new Select(dropDown1);
	
	//VisibleText
		select.selectByVisibleText("Python");

	}
	
	public void dropDown2()
	{
	WebElement dropDown2=driver.findElement(By.id("dropdowm-menu-2"));
	Select select2=new Select(dropDown2);
	
	//Value
		select2.selectByValue("maven");
	}
	
	
	public void dropDown3()
	{
	WebElement dropDown3=driver.findElement(By.id("dropdowm-menu-3"));
	Select select3=new Select(dropDown3);
	
	//Index
		select3.selectByIndex(3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DropDown s1=new DropDown();
		s1.initialiseBrowser();
		s1.dropDown();
		s1.dropDown2();
		s1.dropDown3();
	}
}

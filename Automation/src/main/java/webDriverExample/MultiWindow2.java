package webDriverExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow2 {

public WebDriver driver;
	
	public void MultiWindowDemo()
	{
		driver=new ChromeDriver(); // to open in chrome
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		WebElement toDo=driver.findElement(By.xpath("//a[@id='to-do-list']"));
		toDo.click();
		
		WebElement pageObject=driver.findElement(By.xpath("//a[@id='page-object-model']"));
		pageObject.click();
		
		String parentName=driver.getWindowHandle();
		System.out.println(parentName);
	
		
		Set<String> allWindow=driver.getWindowHandles();
		String title="";
		for(String temp:allWindow)
		{
			if(!temp.equals(parentName))
			{
				System.out.println("All Windows\n"+temp);	
				driver.switchTo().window(temp);
				System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			if(title.equals("WebDriver | Page Object Model"))
			{
			WebElement nextClick=driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
			nextClick.click();
	
			}
			if(title.equals("WebDriver | To Do List"))
			{
				WebElement addToDo=driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
				addToDo.sendKeys("Write code");
				WebElement text2=driver.findElement(By.xpath("//li[text()=' Go to potion class']"));
				text2.click();
				WebElement delete=driver.findElement(By.xpath("//i[@class='fa fa-trash']"));
				delete.click();
				
			}
			driver.switchTo().window(parentName);
	
	
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiWindow2 m1=new MultiWindow2();
		m1.MultiWindowDemo();
	}

}

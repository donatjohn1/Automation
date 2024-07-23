package webDriverExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling
{
	public WebDriver driver;
	
	public void initialiseBrowser()
	{
		driver=new ChromeDriver(); // to open in chrome
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		WebElement contact=driver.findElement(By.xpath("//a[@id='contact-us']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//a[@id='login-portal']"));
		login.click();
		
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
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			if(title.equals("WebDriver | Contact Us"))
			{
			WebElement contactFirstName=driver.findElement(By.xpath("//input[@name='first_name']"));
			contactFirstName.sendKeys("Abcd");
			WebElement contactLastName=driver.findElement(By.xpath("//input[@name='last_name']"));
			contactLastName.sendKeys("Efgh");
			WebElement contactEmail=driver.findElement(By.xpath("//input[@name='email']"));
			contactEmail.sendKeys("dona123@gmail.com");
			WebElement contactMessage=driver.findElement(By.xpath("//input[@name='message']"));
			contactMessage.sendKeys("My contact");
			
	
			}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement loginUsername=driver.findElement(By.xpath("//input[@id='text']"));
				loginUsername.sendKeys("Abc123");
				WebElement loginPassword=driver.findElement(By.xpath("//input[@id='password']"));
				loginPassword.sendKeys("Dona@1998");
				
			}
			driver.switchTo().window(parentName);
		}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling mw=new MultipleWindowHandling();
		mw.initialiseBrowser();
	}

}

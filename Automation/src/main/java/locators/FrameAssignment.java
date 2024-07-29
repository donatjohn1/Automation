package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {
	WebDriver driver;

	public void launch()
	{
		driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		
		WebElement frameSample=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RbSlW8jZFe8']"));
		frameSample.click();
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameAssignment f1=new FrameAssignment();
		f1.launch();
	}

}

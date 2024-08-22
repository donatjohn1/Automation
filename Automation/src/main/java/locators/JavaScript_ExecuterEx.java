package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_ExecuterEx {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1584)");//down
		
		//js.executeScript("window.scrollBy(0,-550)");// up
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		WebElement searchField=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		js.executeScript("arguments[0].click();",searchField);
		searchField.click();
	}

}

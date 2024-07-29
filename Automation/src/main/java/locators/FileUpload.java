package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	WebDriver driver;

	public void fileUpload()
	{
		driver=new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement selectPdf=driver.findElement(By.id("file-upload"));
		
		selectPdf.sendKeys("C:\\Users\\donat\\OneDrive\\Desktop\\Album_Holy_Commuinion_Andrian_Robin.pdf");
		
		WebElement uploadFile=driver.findElement(By.id("file-submit"));
		uploadFile.click();
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload obj=new FileUpload();
		obj.fileUpload();
	}

}

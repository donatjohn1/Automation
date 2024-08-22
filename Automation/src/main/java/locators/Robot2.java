package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot2 {
	WebDriver driver;

	public void robotLaunch() throws AWTException
	{
		driver=new ChromeDriver(); 
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_T);
	    
	}

public static void main(String[] args) throws AWTException {
	// TODO Auto-generated method stub

	Robot2 ob=new Robot2();
	ob.robotLaunch();
}
}
package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_1 {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
New_1 obj= new New_1();
obj.display();
	}
public void display()
{
	//driver=new ChromeDriver(); //for chrome
	//driver= new EdgeDriver();   // for edge
	driver= new FirefoxDriver();  // for fire fox
}

}

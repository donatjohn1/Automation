package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table2Handling extends Base {

	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page2=driver.findElement(By.xpath("//a[@data-dt-idx='2']"));
		page2.click();
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	
	public void selectRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page3=driver.findElement(By.xpath("//a[@data-dt-idx='3']"));
		page3.click();
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[6]"));
		System.out.println(tableRow.getText());
			
	}
	
	public void selectParticulaeElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page4=driver.findElement(By.xpath("//a[@data-dt-idx='4']"));
		page4.click();
		WebElement selectData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[6]/td[4]"));	
		System.out.println(selectData.getText());
		
	}
	public void searchElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page5=driver.findElement(By.xpath("//a[@data-dt-idx='5']"));
		page5.click();
		String inputData="New York";
		List<WebElement> searchEle=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement element:searchEle)
		{
			if(element.getText().equals(inputData))
			{
				System.out.println(element.getText());
			}
		}
		
		
		
		String inputData2="2008/09/26";
		List<WebElement> searchEle2=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[5]"));
		for(WebElement element1:searchEle2)
		{
			if(element1.getText().equals(inputData2))
			{
				System.out.println(element1.getText());
			}
		}
		
		
	}
	
	
	public void selectColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page6=driver.findElement(By.xpath("//a[@data-dt-idx='6']"));
		page6.click();
		List<WebElement> tableColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement option:tableColumn)
		{
			System.out.println(option.getText());
		}
		
				
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table2Handling t1=new Table2Handling();
		t1.initialiseBrowser();
		System.out.println("----------------------------------------");
		t1.fullTable();
		System.out.println("----------------------------------------");
		t1.selectRow();
		System.out.println("----------------------------------------");
		t1.selectParticulaeElement();
		System.out.println("----------------------------------------");
		t1.searchElement();
		System.out.println("----------------------------------------");
		t1.selectColumn();

	}

}

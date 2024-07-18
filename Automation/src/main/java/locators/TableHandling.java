package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	
	public void selectRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(tableRow.getText());
			
	}
	
	public void selectParticulaeElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[2]"));	
		System.out.println(selectData.getText());
		
	}
	public void searchElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String inputData="Tiger Nixon";
		List<WebElement> searchEle=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:searchEle)
		{
			if(element.getText().equals(inputData))
			{
				System.out.println(element.getText());
			}
		}
		
		
		
		String inputData2="Garrett Winters";
		List<WebElement> searchEle2=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
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
		List<WebElement> tableColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement option:tableColumn)
		{
			System.out.println(option.getText());
		}
		
				
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling t1=new TableHandling();
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

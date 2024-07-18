package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
public void id_Locator()
{
	WebElement id1=driver.findElement(By.id("single-input-field"));
	WebElement id2=driver.findElement(By.id("value-a"));
	WebElement id3=driver.findElement(By.id("button-two"));
	WebElement id4=driver.findElement(By.id("message-two"));
	WebElement id5=driver.findElement(By.id("button-one"));
	WebElement id6=driver.findElement(By.id("downloadButton"));
}
public void class_Locator()
{
	WebElement class1=driver.findElement(By.className("clearfix"));
	WebElement class2=driver.findElement(By.className("form-control datepicker"));
	WebElement class3=driver.findElement(By.className("mb-sec"));
	WebElement class4=driver.findElement(By.className("top-logo"));
	WebElement class5=driver.findElement(By.className("mt-5"));
	WebElement class6=driver.findElement(By.className("w50 fleft"));
	
}

public void name_Locator()
{
	WebElement name1=driver.findElement(By.name("viewport"));
	WebElement name2=driver.findElement(By.name("description"));
	WebElement name3=driver.findElement(By.name("keywords"));
	WebElement name4=driver.findElement(By.name("author"));
	WebElement name5=driver.findElement(By.name("daterange"));
	
}



public void link_text()
{
	WebElement link1=driver.findElement(By.linkText("simple-form-demo.php"));
	WebElement link2=driver.findElement(By.linkText("images/favicon.ico"));
	WebElement link3=driver.findElement(By.linkText("table-pagination.php"));
	WebElement link4=driver.findElement(By.linkText("jquery-select.php"));
	WebElement link5=driver.findElement(By.linkText("select-input.php"));
	WebElement link6=driver.findElement(By.linkText("check-box-demo.php"));
	
}
public void partial_link_text()
{
	WebElement p_link1=driver.findElement(By.partialLinkText("simple-form"));
	WebElement p_link2=driver.findElement(By.partialLinkText("radio-button"));
	WebElement p_link3=driver.findElement(By.partialLinkText("table-pagination"));
	WebElement p_link4=driver.findElement(By.partialLinkText("check-box-demo"));
	WebElement p_link5=driver.findElement(By.partialLinkText("select-input"));
	WebElement p_link6=driver.findElement(By.partialLinkText("jquery-select"));
}
//CSS Selector
//Combination to get
//tag and id
//tag and class
//tag and attribute
//tag,class and attribute

public void css_selector()
{
	// tag and id : tag#id_value
	WebElement css_s1=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement css_s2=driver.findElement(By.cssSelector("input#value-a"));
	WebElement css_s3=driver.findElement(By.cssSelector("input#value-b"));
	WebElement css_s4=driver.findElement(By.cssSelector("button#button-one"));
	WebElement css_s5=driver.findElement(By.cssSelector("button#button-two"));
	WebElement css_s6=driver.findElement(By.cssSelector("input#single-input-field2"));
	
	//tag and class: tag.classname
	WebElement css_s7=driver.findElement(By.cssSelector("input.form-control"));
	WebElement css_s8=driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement css_s9=driver.findElement(By.cssSelector("div.top-logo"));
	WebElement css_s10=driver.findElement(By.cssSelector("div.header-top"));
	WebElement css_s11=driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement css_s12=driver.findElement(By.cssSelector("textarea.form-control"));
	
	
	// tag and attribute: tag[attribute type=attribute value]
	WebElement css_s13=driver.findElement(By.cssSelector("input[placeholder=Message]"));
	WebElement css_s14=driver.findElement(By.cssSelector("input[placeholder=City]"));
	WebElement css_s15=driver.findElement(By.cssSelector("input[placeholder=State]"));
	WebElement css_s16=driver.findElement(By.cssSelector("input[placeholder=Subject]"));
	WebElement css_s17=driver.findElement(By.cssSelector("input[type=search]"));
	
	//tag,class and attribute : tag.class[attribute type=attribute value]
	WebElement css_s18=driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
	WebElement css_s19=driver.findElement(By.cssSelector("input.form-control[placeholder=City]"));
	WebElement css_s20=driver.findElement(By.cssSelector("input.form-control[placeholder=State]"));
	WebElement css_s21=driver.findElement(By.cssSelector("input.form-control[placeholder=Subject]"));
	
	

}
public void xpath()
{
	// Xpath can be 
	//absolute xpath
	//relative xpath
	//dynamic xpath
	
	//relative xpath sintax=tagnmae[@attributetype='attributevalue']
WebElement xpath1=driver.findElement(By.xpath("//input[@placeholder='Message']"));
WebElement xpath2=driver.findElement(By.xpath("//input[@placeholder='City']"));
WebElement xpath8=driver.findElement(By.xpath("//input[@placeholder='State']"));
WebElement xpath20=driver.findElement(By.xpath("//input[@placeholder='Zip']"));

//absalute xpath 
WebElement xpath7=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div[2]/div[1]/input"));

//dynamic xpath
// contains
// text

// contains sintax://tagname[contains(@attribute,'value')]
WebElement xpath3=driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
WebElement xpath4=driver.findElement(By.xpath("//div[contains(@id,'-two')]"));
WebElement xpath21=driver.findElement(By.xpath("//div[contains(@id,'mydropzone')]"));
WebElement xpath22=driver.findElement(By.xpath("//input[contains(@id,'subject')]"));

//text sintax://tagname[text()='value')]

WebElement xpath5=driver.findElement(By.xpath("//div[text()='Your Message : ']"));
WebElement xpath6=driver.findElement(By.xpath("//button[text()='Get Total']"));
WebElement xpath15=driver.findElement(By.xpath("//button[text()='Show Message']"));
WebElement xpath16=driver.findElement(By.xpath("//button[text()='Submit form']"));

//Xpath Access Methords

//child
//sintax //tagname[@attribute='value']//child::tage[@attribute='value']
WebElement xpath9=driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span[@class='navbar-toggler-icon']"));
WebElement xpath10=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
WebElement xpath11=driver.findElement(By.xpath("//ul[@class='navbar-nav']//child::li[@class='nav-item ']"));
WebElement xpath12=driver.findElement(By.xpath("//li[@class='nav-item']//child::a[@href='simple-form-demo.php']"));


//Parent
//sintax: //tagname[@attribute='value']//parent::tagname
WebElement xpath13=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
WebElement xpath14=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
WebElement xpath19=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']//parent::button"));
WebElement xpath23=driver.findElement(By.xpath("//div[@class='form-group']//parent::form"));


//Following
//sintax: //tagname[@attribute='value']//following::tagname[@attribute='value']
WebElement xpath17=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
WebElement xpath24=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
WebElement xpath25=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@class='my-2']"));
WebElement xpath26=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='my-2']"));


// Indexing
//sintax: (//tagname[@attribute='value'])[index]

WebElement xpath18=driver.findElement(By.xpath("(//form[@method='POST'])[1]"));
WebElement xpath27=driver.findElement(By.xpath("(//form[@method='POST'])[2]"));


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
}

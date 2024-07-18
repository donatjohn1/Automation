package Sample;

public class BrowserCommands extends Base {
public void browserCommands()
{
String title=driver.getTitle(); // Get title of the page
System.out.println(title); 
String url=driver.getCurrentUrl(); // Get url of the page
System.out.println(url);
String pageSource=driver.getPageSource(); // Get source code 
System.out.println(pageSource);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands brw=new BrowserCommands ();
		brw.initialiseBrowser();
		brw.browserCommands();

	}

}

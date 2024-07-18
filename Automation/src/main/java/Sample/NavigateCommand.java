package Sample;

public class NavigateCommand extends Base {

	public void navigateCommand()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigateCommand nav=new NavigateCommand();
		nav.initialiseBrowser();
		nav.navigateCommand();
	}

}

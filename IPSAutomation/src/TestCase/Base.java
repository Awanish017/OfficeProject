package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver; 
	
	public void brLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "../IPSAutomation/chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("http://ips.accumedia.in/");
		driver.manage().window().maximize();
	}

	
}

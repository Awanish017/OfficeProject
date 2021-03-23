package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Function extends Base {

	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", "../IPSAutomation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://ips.accumedia.in/");
		driver.manage().window().maximize();*/
		
	    Base br=new Base();
	    br.brLaunch();
		
		WebElement id=driver.findElement(By.xpath("//input[@ng-model='username']"));
		id.sendKeys("admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@ng-model='password']"));
		password.sendKeys("accuiot");
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}

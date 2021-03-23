package TestCase;

import java.util.concurrent.TimeUnit;

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
		
	    //"//div[contains(text(),'Login')]")
		WebElement id=driver.findElement(By.xpath("//input[@ng-model='username']"));
		id.sendKeys("admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@ng-model='password']"));
		password.sendKeys("accuiot");
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		
		WebElement List=driver.findElement(By.xpath("//a[text()='List']"));
		List.click();
		
		WebElement Monitor=driver.findElement(By.xpath("//a[text()='Monitor']"));
		Monitor.click();
        WebElement Program =driver.findElement(By.xpath("//a[text()='Programs']"));
        Program.click();
        
        WebElement Programs =driver.findElement(By.xpath("//a[text()='ADS Programs']"));
        Programs.click();
     
        WebElement Message =driver.findElement(By.xpath("//a[contains(text(),'Messages')]"));
        Message.click();
        
        WebElement Media =driver.findElement(By.xpath("//a[text()='Media Files']"));
        Media.click();
        
        WebElement Published =driver.findElement(By.xpath("//a[text()='Published']"));
        Published.click();
        //Main Program
       /* WebElement Published1 =driver.findElement(By.xpath("//div[text()='Main Program']"));
        Published1.click();
        
        WebElement Published2 =driver.findElement(By.xpath("//div[text()='Secondary Program']"));
        Published2.click();
        
        WebElement Published3 =driver.findElement(By.xpath("//div[text()='Examine']"));
        Published3.click();
        
        WebElement Published4 =driver.findElement(By.xpath("//div[text()='Publish']"));
        Published4.click();
        
        
        WebElement Published5 =driver.findElement(By.xpath("//div[text()='Recycle']"));
        Published5.click();*/
        
		Thread.sleep(5000);
		
		driver.close();
	}

}

package SelenumRelated;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class CalenderPick {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver_latest\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		System.out.println("wait");
		
		driver.navigate().to("http://demo.guru99.com/test/");
		
		WebElement dataPick = driver.findElement(By.name("bdaytime"));
		dataPick.sendKeys("05121992");
		dataPick.sendKeys(Keys.TAB);
		dataPick.sendKeys("1212AM");
		
		driver.findElement(By.xpath("//input[type='submit']"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.quit();
		
		
		
	}

}

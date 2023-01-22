package dd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//*[text()=\"Apple iPhone 12 (128GB) - Blue\"][1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.switchTo().window
		
		
		driver.findElement(By.id("add-to-cart-button")).click();
	}

}

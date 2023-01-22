package SelenumRelated;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class practisejan23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		System.out.println("wait");
		driver.manage().window().maximize();
		System.out.println("maximize");
	
		//driver.navigate().refresh();
		
		//Thread.sleep(5000);
		
		//driver.quit();
		
		System.out.println("closed");
	}
}

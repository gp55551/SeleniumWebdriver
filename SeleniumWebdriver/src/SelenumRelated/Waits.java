package SelenumRelated;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.win32.OaIdl.DATE;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implicit
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.close();
		
		//The explicit wait is an intelligent kind of wait
		
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		WebDriverWait wait = new WebDriverWait(driver, 12);
		WebElement ac = driver.findElement(By.xpath("//html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/"
				    + "div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div[1]/section/"
				+ "div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		System.out.println(dateFormat.format(date));
		
		ac.click();
		driver.close();
		
		//fluent wait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).
							withTimeout(12, TimeUnit.SECONDS).
							pollingEvery(3, TimeUnit.SECONDS).
							ignoring(NoSuchElementException.class);
		
		WebElement webelement = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
		
	}

}

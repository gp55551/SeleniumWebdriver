package SelenumRelated;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseToolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//commands();
		findelements();
		
		
		
	}
	
	public static void commands()
	{
		WebDriver driver ;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriver\\IEDriverServer.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		driver = new InternetExplorerDriver(capabilities);
		
		driver.get("http://www.DemoQA.com");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//WebElement wb = driver.findElement(By.xpath("//a[contains(text(),'Registration')]"));

		//implicit
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("implicit waiting for 3 seconds");
		
		//explicit
		//WebDriverWait webWait = new WebDriverWait(driver, 5);
		//webWait.until(ExpectedConditions.visibilityOf(wb));
		
		//System.out.println("explicit waiting");
		//System.out.println(wb.isDisplayed());
		//System.out.println(wb.getText());
		//wb.click();
		//driver.switchTo().defaultContent();
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());
		
		//driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
				
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys("Gaurav");
		//driver.findElement(By.xpath("//input[@id='name_3_lastname']")).sendKeys("Patnaik");
		//driver.findElement(By.xpath("//input[@id='phone_9']")).sendKeys("43555");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		//javascript
		//WebElement firstname = driver.findElement(By.id("name_3_firstname"));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", firstname);
		
		
		
		//executeAsyncScript - Execute an asynchronous piece of JavaScript in the context of the currently selected frame or window.
						//helps to improve the performance of your test. It allows writing test more like a normal coding.
		//executeScript - Executes JavaScript in the context of the currently selected frame or window.
						//The script used in this method runs in the body of an anonymous function.
		//JavascriptExecutor jv = (JavascriptExecutor)driver;
		//jv.executeAsyncScript("arguments[0].click();", firstname);
		
		
		System.out.println(driver.findElement(By.id("menu-item-140")).getTagName());
		System.out.println(driver.findElement(By.id("menu-item-140")).getSize());
		System.out.println(driver.findElement(By.id("menu-item-140")).getAttribute("name"));
		System.out.println(driver.findElement(By.id("menu-item-140")).getCssValue("background-color"));

		System.out.println("Closing Browser");
		driver.quit();
	}
	
	public static void findelements()
	{
		WebDriver driver ;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriver\\IEDriverServer.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		driver = new InternetExplorerDriver(capabilities);
		
		driver.get("http://www.DemoQA.com");
		driver.manage().window().maximize();
		
		driver.quit();
		System.out.println("closing browser");
		
		/*List element1 = driver.findElements(By.id("sfs"));
		
		WebElement element2 = driver.findElement(By.id("sfs"));
		Select sele = new Select(element2);
		sele.selectByVisibleText("sdfs");
		
		List <WebElement> elementCount = sele.getOptions();
		System.out.println(elementCount.size());*/
		
		int n = 1;
		for(int i =n ;i<=100;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.println("*");
			}
			else
			{
				System.out.println(i);
			}
		}

		
	}
	
		

}

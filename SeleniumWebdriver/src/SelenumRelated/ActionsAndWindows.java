package SelenumRelated;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

public class ActionsAndWindows {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		implicitWait();
		//explicitWait();
		//fluentWait();
		//switchCommands();
	}
	//Thread.sleep - pauses execution for sometime.
	//Thread.sleep() interacts with the thread scheduler to put the current thread in 
	//wait state for specified period of time. Once the wait time is over, thread state is 
	//changed to runnable state and wait for the CPU for further execution. So the actual time
	//that current thread sleep depends on the thread scheduler that is part of operating system.
	//But Thread.sleep blocks the current thread.
	//
	//Most of the web applications are developed using Ajax and Javascript. 
	//When a page is loaded by the browser the elements which we want to interact with may load at different time intervals.
	//Not only it makes this difficult to identify the element but also if the element is not located it will throw an "ElementNotVisibleException" exception. 
	//Using Waits, we can resolve this problem.
	
	//implicit wait
	//wait for a certain amount of time before throwing an exception that it cannot find the element on the page. 
	//We should note that implicit waits will be in place for the entire time the browser is open
	
	public static void implicitWait()
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		System.out.println("wait");
		
		driver.navigate().to("http://www.google.com");
	
		driver.quit();
	/*	Alert a = new 
		WebDriverWait w = new WebDriverWait(driver, 12);
		w.until(ExpectedConditions.alertIsPresent());
		driver.manage().window().maximize();*/
		
		
		
		
		
	}
	//explicit
	//wait for certain conditions (Expected Conditions) or the maximum time exceeded before 
	//throwing an "ElementNotVisibleException" exception.
	//Explicit wait gives better options than that of an implicit wait as 
	//it will wait for dynamically loaded Ajax elements.
	//creating reference wait for "WebDriverWait" class and instantiating using "WebDriver" reference
	
	public static void explicitWait()
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.navigate().to("www.google.com");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
		element.click();
		
		System.out.println("Explicit wait");
		driver.quit();
		
	}
	
	//Page load timeout 
	//Sets the amount of time to wait for a page load to complete before throwing an error. 
	//If the timeout is negative, page loads can be indefinite.
	//driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
	
	
	//wait for alert
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	 
    //Wait for Alert to be present
	//Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	//myAlert.accept();
	
	
	//fluent wait
	//The fluent wait is used to tell the web driver to wait for a condition, 
	//as well as the frequency with which we want to check the condition before
	//throwing an "ElementNotVisibleException" exception.
	
	public static void fluentWait()
	{
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriver\\IEDriverServer.exe");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	driver = new InternetExplorerDriver(capabilities);
	
	driver.navigate().to("www.google.com");

	Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(12,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	//Frequency is set to 5 seconds and the maximum time is set to 30 seconds. 
	//Thus this means that it will check for the element on the web page at every 5 seconds for the maximum time of 30 seconds. 
	//If the element is located within this time frame it will perform the operations 
	//else it will throw an" ElementNotVisibleException"
	WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
	element.click();
	
	System.out.println("Fluent wait");
	driver.quit();
	
	}
	
	//switch windows
	
	public static void switchCommands() throws InterruptedException {

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		driver = new InternetExplorerDriver(capabilities);

		driver.navigate().to("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		String handle = driver.getWindowHandle();
		System.out.println(handle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();

		//switch window
		Set handles = driver.getWindowHandles();
		System.out.println(handles);
		System.out.println(handles.size());

		driver.switchTo().window("window name");
		// window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		// frame
		driver.switchTo().frame("frame name");
		
		// alert
		//accept() To accept the alert
		//dismiss() To dismiss the alert
		//getText() To get the text of the alert
		//sendKeys() To write some text to the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("");

	}
	
	public static void iframes() throws InterruptedException
	{
		//index
		driver.switchTo().frame(0);
		//frame name
		driver.switchTo().frame("frameName");
		//webelement
		driver.switchTo().frame(driver.findElement(By.xpath("xpath")));
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
	}
	
	public static void accessIframeElements() throws InterruptedException
	{
		
		driver.switchTo().frame(0);
		//code
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		//code
		
		//error - no such element exception and 
					//no such frame exception - when switchTo.defaultCOntent is skipped
		
		
		
		//@cachelookup
		//@CacheLookup, as the name suggests helps us control when to cache a WebElement and when not to. 
		//This annotation when applied over a WebElement instructs Selenium to keep a cache of the WebElement 
		//instead of searching for the WebElement every time from the WebPage. 
		//This helps us save a lot of time.
		
		
		
	}
	
	
	


}

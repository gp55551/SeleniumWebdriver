package SelenumRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
        WebElement Element = driver.findElement(By.linkText("Linux"));
        js.executeScript("arguments[0].scrollIntoView();",Element);
        js.executeScript("arguments[0].click();",Element);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        
        
        
	}

}

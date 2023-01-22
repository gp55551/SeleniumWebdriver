package SelenumRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		//We use build() when we are performing sequence of operations and no 
		//need to use if we are performing single action.
		//build().perform()
		
		//double click
		Actions action = new Actions(driver);
		action.doubleClick(link).perform();
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		//right click
		WebElement link1 = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(link1).perform();
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		
		
	}

}

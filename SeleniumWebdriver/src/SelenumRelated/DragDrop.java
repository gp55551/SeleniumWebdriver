package SelenumRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
        		
        Actions action = new Actions(driver);
        action.dragAndDrop(From, To).perform();
        
        
        
	}

}

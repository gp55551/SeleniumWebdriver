package SelenumRelated;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(15000);
		System.out.println("wait");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		
		
		//get all options 
		
		 Select dropdown = new Select(driver.findElement(By.id("fruits")));

		    //Get all options
		    List<WebElement> dd = dropdown.getOptions();

		    //Get the length
		    System.out.println(dd.size());

		    // Loop to print one by one
		    for (int j = 0; j < dd.size(); j++) {
		        System.out.println(dd.get(j).getText());

		    }
		    
		    
	    }
		
		
	

}

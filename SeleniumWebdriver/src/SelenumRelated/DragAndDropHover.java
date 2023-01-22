package SelenumRelated;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHover {

	static WebDriver driver ;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dragAndDrop();
		//hover();
		
	}
	public static void dragAndDrop()
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		driver.get(URL);
		System.out.println("Navigating to URL");
		
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

		//actions
		Actions a = new Actions(driver);
		Action dragAndDrop = a.clickAndHold(From).moveToElement(To).release(To).build();
		//can use it also  = = a.dragAndDrop(From, To);
		dragAndDrop.perform();
		System.out.println("drag and drop success");
		
		driver.quit();
		System.out.println("closing browser");
	}
	
	public static void hover()
	{
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		driver.get(URL);
		System.out.println("Navigating to URL");
		
		
		WebElement elementToHover = driver.findElement(By.xpath("//ul[@class='site-menu m-dropdown']/li/a"));
		
		Actions a = new Actions(driver);
		a.moveToElement(elementToHover).build();
		a.perform();
		System.out.println("hover success");
		
		driver.quit();
		System.out.println("closing borwser");	
	}
	
	
	
	

}

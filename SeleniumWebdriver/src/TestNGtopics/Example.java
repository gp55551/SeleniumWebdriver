package TestNGtopics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Example {
  WebDriver driver ; 

  @Test
  public void f() {
	  
      driver.findElement(By.id("account")).click();
      driver.findElement(By.id("log")).sendKeys("testuser_1");
      driver.findElement(By.id("pwd")).sendKeys("Test@123");
      driver.findElement(By.id("login")).click();
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
      driver.findElement(By.id("account_logout"));

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
	  driver= new InternetExplorerDriver();
	  
	  driver.get("http://www.onlinestore.toolsqa.com");
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	driver.quit();  
  }

}

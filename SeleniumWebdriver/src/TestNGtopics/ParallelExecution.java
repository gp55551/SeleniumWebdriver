package TestNGtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ParallelExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	@Test
	public void session1()
	{
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver.get(URL);
		driver.quit();
		
	}
	@Test
	public void session2()
	{
		WebDriver driver1;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver1= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver1.get(URL);
		
		driver1.quit();
	}
	
	@Test
	public void session3()
	{
		WebDriver driver2;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver2= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver2.get(URL);
		
		driver2.quit();
		
		
	}
	@Test
	public void session4()
	{
		WebDriver driver2;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver2= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver2.get(URL);
		
		driver2.quit();
		
		
	}@Test
	public void session5()
	{
		WebDriver driver2;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver2= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver2.get(URL);
		
		driver2.quit();
		
		
	}@Test
	public void session6()
	{
		WebDriver driver2;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver2= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver2.get(URL);
		
		driver2.quit();
		
		
	}
	
	@Test
	public void session7()
	{
		WebDriver driver2;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver2= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver2.get(URL);
		
		driver2.quit();
		
		
	}
	
	@Test
	public void session8()
	{
		WebDriver driver2;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		driver2= new InternetExplorerDriver();
				
		String URL = "www.google.com";
		driver2.get(URL);
		
		driver2.quit();
		
		
	}

}

package TestNGtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			// driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void session1()
	{
		
		String URL = "www.google.com";
		driver.get(URL);
		driver.quit();
		
	}

	@Test
	public void session2() {

		String URL = "www.google.com";
		driver.get(URL);

		driver.quit();
	}
	
	@Test
	public void session3()
	{
		String URL = "www.google.com";
		driver.get(URL);
		
		driver.quit();
		
		
	}
	
	@Test
	public void session4() {

		String URL = "www.google.com";
		driver.get(URL);

		driver.quit();

	}
}

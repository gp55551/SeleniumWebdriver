package SelenumRelated;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class TakesScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver ; 
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		
		driver = new InternetExplorerDriver(dc);
		System.out.println("Driver initiated");
		
		driver.get("http://www.demo.guru99.com/v4/");
		System.out.println("navigated to URL");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("GGuru99 Bank Home Page")) {
			System.out.println("matching");
		} else {
			//screenshot and copy
			System.out.println("not matching");
			TakesScreenshot takeSc = ((TakesScreenshot)driver);
			File source = takeSc.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\GuaravLearnWorkspace\\ProgramsToLearn\\Screenshots\\Screenshots.jpg"));
			System.out.println("File copy completed");
		}

		System.out.println("closing browser");
		driver.quit();
		
	}

	
}

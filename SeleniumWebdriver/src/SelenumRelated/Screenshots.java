package SelenumRelated;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.jboss.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ss= (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("//D://abc.jpg");
		FileUtils.copyFile(source, dest);
		
		
		
	}

}

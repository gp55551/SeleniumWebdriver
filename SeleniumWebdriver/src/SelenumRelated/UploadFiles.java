package SelenumRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UploadFiles extends ExtentReportMethodCall{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReportMethodCall extentCall = new ExtentReportMethodCall();
		extentCall.extentReportStart("upload files","uploading files and validation");
		
		WebDriver driver ; 
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		
		driver = new InternetExplorerDriver(dc);
		System.out.println("Driver initiated");
		
		driver.get("http://www.demo.guru99.com/test/upload/");
		System.out.println("navigated to URL");
		
		//upload file 
		driver.findElement(By.id("uploadfile_0")).sendKeys("\\D:\\gaurav.jpg");
        driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		extentCall.passLog();
		
		driver.quit();
		
		extentCall.extentReportclose();
		
		
	}

}

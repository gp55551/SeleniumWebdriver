package SelenumRelated;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//extent report 3.1.5
public class ExtentReport1 {

	static Date date = new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyyyy_HH_mm_ss");
	
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent; 
	static ExtentTest tests;
	static String filePath = System.getProperty("user.dir")+"\\ExtentHtmlReports\\ExtentReport_"+sdf.format(date)+".html";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		htmlReporter = new ExtentHtmlReporter(filePath);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		tests = extent.createTest("verifyHomePageTitle", "Checking the Title");
		tests.assignAuthor("Gaurav Patnaik");

		WebDriver driver;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\IEDriver\\IEDriverServer.exe");

		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		driver = new InternetExplorerDriver(dc);
		System.out.println("Driver initiated");
		tests.log(Status.PASS, "Driver initiated : Passed");

		driver.get("http://www.demo.guru99.com/v4/");
		System.out.println("navigated to URL");
		tests.log(Status.PASS, "Navigated to URL : Passed");

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Guru99 Bank Home Page")) {
			System.out.println("matching");
			tests.log(Status.PASS, "Script Passed");
		} else {
			System.out.println("not matching");
			tests.log(Status.FAIL, "Script Failed");
		}

		// log with screenshot
		tests.pass("Screenshot capture",
				MediaEntityBuilder
						.createScreenCaptureFromPath(
								System.getProperty("user.dir") + "\\ExtentHtmlReports\\Screenshots\\Screenshot.png")
						.build());

		System.out.println("closing browser");
		tests.log(Status.PASS, "Closing browser");
		driver.quit();

		extent.flush();

	}
	
	

}

package SelenumRelated;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static Date date = new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyyyy_HH_mm_ss");
	
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent; 
	static ExtentTest tests;

	public void extentReportStart(String testname,String description)
	{
		String filePath = System.getProperty("user.dir")+"\\ExtentHtmlReports\\ExtentReport_"+sdf.format(date)+".html";	
		
		htmlReporter = new ExtentHtmlReporter(filePath);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		tests = extent.createTest(testname,description);
		tests.assignAuthor("Gaurav Patnaik");
	
	}
	
	public void passLog()
	{
		tests.log(Status.PASS, "Passed");

	}
	
	public void failLog()
	{
		tests.log(Status.FAIL, "Failed");

	}
	
	public void LogScreenshot() throws IOException
	{
		// log with screenshot
		tests.pass("Screenshot capture",
				MediaEntityBuilder
						.createScreenCaptureFromPath(
								System.getProperty("user.dir") + "\\ExtentHtmlReports\\Screenshots\\Screenshot.png")
						.build());
	
	}
	
	public void extentReportclose()
	{
		extent.flush();	
	}
	
}

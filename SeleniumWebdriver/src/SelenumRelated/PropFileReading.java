package SelenumRelated;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropFileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader(
				"C:\\Users\\ADMIN\\eclipse-workspace\\GFG_MAven\\src\\main\\java\\GFG_Maven\\GFG_MAven\\TestData.properties");
		
		Properties props = new Properties();
		
		props.load(reader);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//navigate
		driver.get(props.getProperty("searchTerm"));

		driver.close();

	}

}

package SelenumRelated;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws IOException, FindFailed {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com");
		
		Screen screen = new Screen();
		Pattern fileInputTextBox = new Pattern("C:\\Users\\gaurav_patnaik\\Desktop\\Trending.PNG");

		screen.find(fileInputTextBox);
		screen.click(fileInputTextBox);
		
		System.out.println("Trending button clicked");
		
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
		
	}

}

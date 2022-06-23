/*Program on taking screen shot
 * Created by B MAHESH on 28.03.2022
 * 
 */
package iPortman;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	public static void main(String mahesh[]) throws IOException {
		
		//WebDriver setup
		WebDriverManager.chromedriver().setup();
		
		//Creating object for ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		//Object creationg
		//WebDriverWait webdriverwait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//webdriverwait.until(ExpectedConditions.elementToBeClickable(null));
		
						
		//Load the URL
		driver.get("https://rahulshettyacademy.com/#/index");
		
		//Maximize the browser
		//driver.manage().window().maximize();
		
		//Upcasting driver object
		TakesScreenshot TAA=(TakesScreenshot)driver;
		
		File source=TAA.getScreenshotAs(OutputType.FILE);
		
		//Creating Object for FILE
		File destination=new File("D:\\image.PNG");
		
		FileHandler.copy(source, destination);
		
		
		
		
		
		
		
		
	}

}

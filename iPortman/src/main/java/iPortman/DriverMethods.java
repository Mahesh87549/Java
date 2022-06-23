package iPortman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

final class DriverMethods {
	
	public static void main(String args[]) throws InterruptedException {
		
		//Set up the browser
		WebDriverManager.chromedriver().setup();
		
		//Object creating
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
			driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//Minimize the URL
		//driver.manage().window().minimize();
		//Thread.sleep(2000);
		
		//Navigating to forward
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//Navigating to backward
		driver.navigate().back();
		Thread.sleep(2000);
		
		//refreshing the button
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Quit the method
		driver.quit();
		
		
	}

}

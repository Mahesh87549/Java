/*Program on Frames created by B MAHESH on 28.01.2022
 * 
 */

package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {
	
	public static void main(String args[]) throws Throwable {
		//WebDriver Manger setup
		WebDriverManager.chromedriver().setup();
		
		//Open the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Launch the URL
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");	
		
		//Switch to frame by index
		driver.switchTo().frame(0);
		
		
		//Click on the link
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//Wait for five minutes
		Thread.sleep(2000);
		
		//Close the browser
		//driver.quit();
		
		//Switch to default content
		driver.switchTo().defaultContent();
		
		//Switch to frame by name
		driver.switchTo().frame(1);
		
		//Click on the link
		driver.findElement(By.linkText("Alert")).click();
		
		//Switch to default content
		driver.switchTo().defaultContent();
		
	
		WebElement we=driver.findElement(By.className("rightIframe"));
		
		//Switch to frame by WebElement
		driver.switchTo().frame(we);
		
		driver.findElement(By.id("search")).sendKeys("Sucess");
		
		//Close the browser
		driver.quit();
		
		
		
		
		
		
		
	}
	

}

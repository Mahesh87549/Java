/*Program on Actions class created by B MAHESH on 31.01.2022
 * 
 */
package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class ActionsClassDemo {
	
	public static void main(String args[]) {
		

	//Setup chrome Browser
	WebDriverManager.chromedriver().setup();
	
	//Open the browser
	WebDriver driver=new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Launch the browser
	driver.get("https://www.timesjobs.com/");
	
	//Object creation for the Actions class
	Actions act=new Actions(driver);
	
	//Finding the element
	WebElement ele=driver.findElement(By.id("resumeFile_basic"));
	
	//act.click(ele).perform();
	
	//Launch jquery website
	driver.navigate().to("https://api.jquery.com/dblclick/");
	
	//swithTo the frame
	driver.switchTo().frame(0);
	
	WebElement WebElement = driver.findElement(By.xpath("/html/body/div"));
	
	act.doubleClick(WebElement).perform();
	
	

}
}

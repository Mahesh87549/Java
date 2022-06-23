/*Program on Keyboard Actions performed by B MAHESH on 09.02.2022
 * 
 */

package iPortman;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	
	//Main method
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver Setup
		WebDriverManager.chromedriver().setup();
		
		//Open Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Launch the URL
		driver.get("https://www.goibibo.com");
		
		//Object Creation for Actions class
		Actions act=new Actions(driver);
		
		//Performing PageDown Operation
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(3000);
		
		//Performing PageUp Operation
		act.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(3000);
		
		//Performing End & Home Operations
		act.sendKeys(Keys.END).perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(3000);
		
		//Quit the Browser
		driver.quit();
		
		
	}
	
	

}

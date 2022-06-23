/*Program on Alert+-s Created by B MAHESH on 28.01.2022
 * 
 */

package iPortman;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandlingConcept {
	
	//Main Method
	public static void main(String arg[]) throws Throwable {
		
		//WebDriver Manager setup
		WebDriverManager.chromedriver().setup();
		
		//Browser launching
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
			
		//Click on alert button
		driver.findElement(By.xpath("//input[@id='alertbtn' and @class='btn-style']")).click();
		
		//Shift control to alert page
		Alert alt=driver.switchTo().alert();
		
		
		//Display the text present in the alert message
		System.out.println(alt.getText());
		
		
		//Accept the alert
		alt.accept();
		
		//Close the Browser
		driver.close();
	
		
		
		
	}

}

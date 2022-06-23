package iPortman;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowGeneralActions {
	
		
	WebDriver driver=new ChromeDriver();
	
						
	/*
	This method will check whether the element is present
	Parameter: By
	Author: Mahesh
	
	 */

	public boolean isElementDisplayed (By parameter) {
		
		if(driver.findElement(parameter).isDisplayed()) {
			System.out.println("Element is Displayed sucessfully");
		return true;
		}
		else 
		return false;
}
	
	
	/*This method will wait for a Duration of 10 sectonds
	 Parameter type: By
	 Author: Mahesh
	
	 */
	public void explicitWait(By parameter) {
		WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(25));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(parameter));
		
	}



}
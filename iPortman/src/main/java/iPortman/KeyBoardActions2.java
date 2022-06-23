package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class KeyBoardActions2 {

	public final static void main(String[] args) {
		
		
		//WebDriver Setup
				WebDriverManager.chromedriver().setup();
				
				//Open Chrome Browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Launch the URL
				driver.get("https://www.goibibo.com");
				
				//Launch Another URL in the same Website
				driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
				
				//Switch to frame
				driver.switchTo().frame("iframeResult");
				
				//Creating Object for Actions Class
				Actions act=new Actions(driver);
				
				//Hold Down the Control Key
				act.keyDown(Keys.CONTROL).perform();
				
				//Click on the Option
				act.click(driver.findElement(By.xpath("//option[text()='Volvo']"))).perform();
				
				//Hold Down the Control Key
				act.keyDown(Keys.CONTROL).perform();
				
				//Click on the Option
				act.click(driver.findElement(By.xpath("//option[text()='Volvo']"))).perform();
				
				
			
				
				
				
				
		

	}

}

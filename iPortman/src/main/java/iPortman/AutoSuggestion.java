package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	
	public static void main(String[] args) throws Throwable {
		
	
	//WebDriver Setup
	WebDriverManager.chromedriver().setup();
	
	//Open Chrome Browser
	WebDriver driver=new ChromeDriver();
	
	//Maximize the Browser
	driver.manage().window().maximize();
	
	//Launch the URL
	driver.get("https://www.amazon.in/");
	
	//Find the element and enter text
	WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
	
	searchBox.sendKeys("mahe");
	
	Thread.sleep(3000);
	
	searchBox.sendKeys(Keys.ARROW_DOWN);
	
	searchBox.sendKeys(Keys.ENTER);
	
	
	
	
	

}
}

package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDemoPart3 {
	public static void main(String[] args) {
		
		//Setup
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.dtdc.in/");
		
		//Find the element by using link Text
	WebElement obj=	driver.findElement(By.xpath("//*[@id=\"myslidemenu\"]/ul/li[2]/a"));
	
	//Creating object for Actions class
	Actions act=new Actions(driver);
	
	//Move to element
	act.moveToElement(obj).perform();
		
		
	}

}

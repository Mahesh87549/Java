package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDemoPart2 {
	
	public static void main(String[] args) {
		
		//Setup Browser
		WebDriverManager.chromedriver().setup();
		
		//Open the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://jqueryui.com/droppable/");
		
		//Object creation for Actions class
		Actions act=new Actions(driver);
		
		//Swith to fram
		driver.switchTo().frame(0);
		
		//Source WebElement
		WebElement source=driver.findElement(By.id("draggable"));
		
		//destination WebElement
		WebElement destination=driver.findElement(By.id("droppable"));
		
		//Drag and Drop method
		//act.dragAndDrop(source, destination).perform();
		
		//Click and Hold
		act.clickAndHold(source).perform();
		
		//Release
		act.release(destination).perform();
		
		
	}

}

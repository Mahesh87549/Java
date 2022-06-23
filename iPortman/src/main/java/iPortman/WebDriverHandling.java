package iPortman;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHandling {

	public static void main(String[] args) {
		
		//WebDriver manager setup
		WebDriverManager.chromedriver().setup();
		
		//Object creating
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Load the URL		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		//finding no.of webtables present in the web page
		
		Object webtables=driver.findElements(By.xpath("//table")).size();
		
		//Creating Object for Actions class
		Actions act=new Actions(driver);
		
		for(int i=0;i<12;i++) {
		
		//Scrolling down page
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		
		System.out.println(webtables);
		
		//Going to the particular webelement
		WebElement table1=driver.findElement(By.xpath("//table[@id='example']"));
		
		//Finding Number of Rows in the table1
       System.out.println(driver.findElements(By.xpath("//table[@id='example']//tr")).size());
       
       //Printing row of elements
       WebElement elements=driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)[4]"));
       
       //Getting the Text
       String elements1=elements.getText();
       
      System.out.println(elements1);
      
      //Printing each cell of the Particular Row
      List<WebElement> cells=driver.findElements(By.xpath("((//table[@id='example']//tbody//tr)[4])//td"));
      
      for(WebElement o:cells) {
    	  System.out.println( o.getText());
      }
      
      //Finding the text of the single column
      List<WebElement> columns=driver.findElements(By.xpath("//table[@id='example']//tbody//td[2]"));
      
      for (WebElement o:columns) {
    	 System.out.println(o.getText()); 
    	  
      }
      
		
		//Quit the browser
		//driver.quit();

	}

}

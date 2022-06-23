/* Program on Locators created bt B MAHESH ON 26.01.2022
 */

package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

final public class AllTheLocators {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thepancard.com/");
		Thread.sleep(2000);
		// Maximize the window
		driver.manage().window().maximize();
		// Finding the element with the help of CSS Selector

		// Finding element by linkText
		driver.findElement(By.partialLinkText("Apply New PAN Card")).click();

		// Find the element with help of id
		// driver.findElement(By.id("rblCategory_1")).click();

		// Find the element with help of class
		// driver.findElement(By.className("class_Attribute")).click();

		// Find the element with help of tag name
		// driver.findElement(By.name("category_name")).click();

		// Find the element with the help of cssSelector:tagname#idvalue
		//driver.findElement(By.cssSelector("input#rblCategory_1")).click();
		
		//Find the element with the help of cssSelector:tagname.classname
		//driver.findElement(By.cssSelector("input.radio-inline")).click();
		
		//Find the element with the help of cssSelector:TAG&Attribute
		driver.findElement(By.cssSelector("input[id='rblCategory_1']")).click();
		
		//Find the element with the help of Xpath: Absolute X Path
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div[2]/div/div/input")).sendKeys("15/01/1996");

		//Find the element with the help of Xpath: Relative Xpath
		//driver.findElement(By.xpath("//input[@id='rblGender_0']")).click();
		
		//Find the element with the help of Xpath and
		//driver.findElement(By.xpath("//input[@id='rblGender_0' and @name='gender']")).click();
		
		//Find the element with the help of Xpath or
		driver.findElement(By.xpath("//input[@id='rblGender_0' or @name='gender']")).click();
		
		//Find the element using Xpath contains Method
		driver.findElement(By.xpath("(//input[contains(@id, rbl)])[6]")).click();
		
		// Wait for 2 minutes
		Thread.sleep(2000);

		// Close the browser
		driver.close();

	}

}

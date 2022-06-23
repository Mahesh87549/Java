/* Program on Alerts Handling
 * Created by B MAHESH on 24.03.2022
 */

package iPortman;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	final public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Creating Object for Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");

		// Maximize the browser
		driver.manage().window().maximize();

		// Finding the element
		driver.findElement(By.linkText("Show Alert")).click();

		// Move control to alert
		Alert alt = driver.switchTo().alert();

		// Accept the alert
		alt.accept();

	}

}

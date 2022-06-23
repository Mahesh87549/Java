package iPortman;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandling {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Launch the website
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Maximise the browser
		driver.manage().window().maximize();

		// Locating the webelement
		WebElement dd = driver.findElement(By.id("dropdown-class-example"));

		// Creating object for Select class only if tag is Select only
		Select slct = new Select(dd);

		// To findout whether the DropDown is Multiple or not
		System.out.println(slct.isMultiple());

		// List out all the options available in Dropdown
		List<WebElement> options = slct.getOptions();

		// Read out all the options
		for (WebElement e : options) {
			System.out.println(e.getText());
		}

		slct.selectByIndex(1);

		// Wait for two seconds
		Thread.sleep(2000);

		slct.selectByValue("option2");

		List<WebElement> option = slct.getAllSelectedOptions();

		// close the driver
		driver.close();

	}

}

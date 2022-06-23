package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWebSiteOpening {

	// All the WebElements xpaths
	By searchElement = By.xpath("//input[@id='twotabsearchtextbox']");

	WindowGeneralActions windowGeneralActions = new WindowGeneralActions();

//Creating Object for ChromeDriver assign to WebDriver interface
	static WebDriver driver = null;

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "");

				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();

		AmazonWebSiteOpening aws = new AmazonWebSiteOpening();
		aws.allTheMethods();

	}

	public void allTheMethods() {

		

		// Load the URL
		driver.get("https://www.amazon.in/");

		// Maximize the Window
		driver.manage().window().maximize();

		// Calling Explicit wait
		windowGeneralActions.explicitWait(searchElement);

		// Verify whether the element is present or not
		windowGeneralActions.isElementDisplayed(searchElement);

	}

}

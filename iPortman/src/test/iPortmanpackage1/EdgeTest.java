package iPortmanpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// Loading the URL
		driver.get("https://www.amazon.in/");
		// Maximizing the URL
		driver.manage().window().maximize();
		// Closing the driver
		driver.close();

	}

}

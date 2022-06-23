package iPortman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapabilityTest {
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/armani-exchange-logo-print-hoodie-with-drawstring-fastening/p/410294242_1200");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")).sendKeys("Mahesh");
	}

}


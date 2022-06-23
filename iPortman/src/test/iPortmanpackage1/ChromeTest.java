package iPortmanpackage1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Maximizing the Window
		driver.manage().window().maximize();
		//Opening the URL in the browser
		driver.get("https://www.amazon.in/");
	}
	

}

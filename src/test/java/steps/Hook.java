package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	@Before
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/Downloads/chromedriver");
		driver=new ChromeDriver();
	}

	@After
	public void afterMethod() {
		driver.quit();
	}
	
	
}

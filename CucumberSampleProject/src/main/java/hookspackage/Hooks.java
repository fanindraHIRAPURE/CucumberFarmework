package hookspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver = null;
	
	@Before
	public void setup() {
		System.out.println("Enter in setup");
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}

	@After
	public void tearDown() {
		System.out.println("Enter in teardown");
		driver.quit();
		
	}
}

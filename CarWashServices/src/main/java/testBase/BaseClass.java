package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

		public WebDriver driver;
		public Logger logger;
		
		
	@BeforeClass	
	public void setUp() {
		logger=LogManager.getLogger(getClass());
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.justdial.com");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}

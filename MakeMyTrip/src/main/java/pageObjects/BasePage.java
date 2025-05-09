package pageObjects;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
	}
}

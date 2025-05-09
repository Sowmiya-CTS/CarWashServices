package FlipkartPages;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeSuite;

public class SearchBox {
	
	public WebDriver driver;
	private static final String url="https://www.flipkart.com";
	
	@FindBy(how=How.XPATH, xpath="//input[@placeholder='Search for Products, Brands and More']")
	WebElement search;
	
	public SearchBox(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void open() {
		driver.get(url);
	}
	
	void searchProduct(String productName) {
		search.sendKeys("Iphone 14",Keys.ENTER);
		System.out.println("Search Dialog passed for : "+productName);
	}
	
	
}

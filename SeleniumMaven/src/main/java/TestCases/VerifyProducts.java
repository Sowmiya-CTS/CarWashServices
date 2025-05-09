package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class VerifyProducts {
	
	@FindBy(how=How.XPATH,xpath="//span[@class='BUOuZu']")
	WebElement displayResult;
	
	@FindBy(how=How.XPATH ,xpath="//span[@class='LAlF6k re6bBo']")
	WebElement totalPrice;
	
	public VerifyProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@Test
	public void displaySearchResult() {
	
		assertTrue(displayResult.isDisplayed(),"Search results displayed");
	}
	
	@Test
	public void validatePrice() {
		assertTrue(totalPrice.isDisplayed(),"Total price displayed");
	}
	
	

}

package FlipkartPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductBox {
    private WebDriver driver;

//    @FindBy(how = How.CSS, css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
//    private WebElement choose;

    public ProductBox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
    }

    public void selectProduct() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement choose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Apple iPhone 14 (Midnight, 256 GB)']")));
		choose.click();
        System.out.println("Product selected successfully");
    }
}

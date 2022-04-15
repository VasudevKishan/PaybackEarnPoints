package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productsPage {
	WebDriver driver;
	public productsPage(WebDriver driver) {
		this.driver=driver;
	}
	By productCard = By.xpath("//*[@id=\"hot-deals-product-list\"]/div[1]/a/div/div[1]/img");
	
	
	public WebElement getProductCard() {
		return driver.findElement(productCard);
	}
	
}

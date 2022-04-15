package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PartnerInfoPage {
	public WebDriver driver;
	public PartnerInfoPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By redBtn = By.xpath("//div[@class='pb-separator-comp']//following::a[contains(@class,'pb-ebay-readmore btn btn-pink red-button')]");
	
	public WebElement getRedBtn() {
		return driver.findElement(redBtn);
	}
}

package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class voucherPage {
	public WebDriver driver;
	public voucherPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By tncTab = By.xpath("//div[@class='col-md-12']//div//ul//li[2]//a");
	
	By howToUseTab = By.xpath("//div[@class='col-md-12']//div//ul//li[3]//a");
	
	By instructionsTab = By.xpath("//div[@class='col-md-12']//div//ul//li[1]//a");
	
	By contentsHeading = By.xpath("//div[@class='container tab-pane active pt-3  px-0']//h4");
	
	public WebElement getContentsHeading() {
		return driver.findElement(contentsHeading);
	}
	
	public WebElement getHowToUseTab() {
		return driver.findElement(howToUseTab);
	}
	
	public WebElement getInstructionsTab() {
		return driver.findElement(instructionsTab);
	}
	
	public WebElement getTncTab() {
		return driver.findElement(tncTab);
	}
	
}

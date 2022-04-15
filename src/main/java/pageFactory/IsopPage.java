package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsopPage {
	public WebDriver driver;
	public IsopPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By mobikwikDetailsBtn = By.cssSelector("a[data-title='mobikwik: Recharge Online']");
	
	By hpclPageBtn = By.cssSelector("a[data-title='hpcl']");
	
	public WebElement getHpclBtn() {
		return driver.findElement(hpclPageBtn);
	}
	
	public WebElement getMobikwikDetailsBtn() {
		return driver.findElement(mobikwikDetailsBtn);
	}
	
	
}

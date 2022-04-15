package pageFactory;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class instantVouchersPage {
	public WebDriver driver;
	public instantVouchersPage(WebDriver driver) {
		this.driver=driver;
	}
	By ccdBuyBtn = By.xpath("//div[@class='col-lg-3 p-2 col-md-4 col-sm-6 col-6']//div[@class='listind_inner_dv h-100 text-center bg-white rounded pt-5 position-relative cursor-pointer' and .//div//div//img[@alt='Cafe Coffee Day Online']]//div//a");
	By applyBtn = By.xpath("//button[text()='Apply']");
	//By archesBuyBtn = By.xpath("//div[@class='col-lg-3 p-2 col-md-4 col-sm-6 col-6']//div[@class='listind_inner_dv h-100 text-center bg-white rounded pt-5 position-relative cursor-pointer' and .//div//div//img[@alt='Archies Gallery']]//div//a");
	
	
	
	public WebElement getArchesBuyBtn() {
		
		try {
			return driver.findElement(By.xpath("//div[@class='col-lg-3 p-2 col-md-4 col-sm-6 col-6']//div[@class='listind_inner_dv h-100 text-center bg-white rounded pt-5 position-relative cursor-pointer' and .//div//div//img[@alt='Archies Gallery']]//div//a"));
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
	public WebElement getApplyBtn() {
		return driver.findElement(applyBtn);
	}
	
	public WebElement getCcdBuyBtn() {
		return driver.findElement(ccdBuyBtn);
	}
	
	public void hoverOn(WebElement e) throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(e).build().perform();
		Thread.sleep(500);
		
	}
	
	public void chooseFilter() {
		driver.findElement(By.cssSelector("label[for='DIS']")).click();
		driver.findElement(By.cssSelector("label[for='food-beverage-gift-vouchers']")).click();
		
	}
	
}

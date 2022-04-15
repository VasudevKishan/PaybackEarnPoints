package pageFactory;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OnlineShoppingPage {
	public WebDriver driver;
	
	public OnlineShoppingPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By dot0 = By.xpath("//button[@type='button' and text()='1']");
	By dot1 = By.xpath("//button[@type='button' and text()='2']");

	
	By div0 = By.xpath("//div[@aria-describedby='slick-slide00']");
	By div1 = By.xpath("//div[@aria-describedby='slick-slide01']");
	
	
	By img0 = By.xpath("//div[@aria-describedby='slick-slide00']//a//img");
	By img1 = By.xpath("//div[@aria-describedby='slick-slide01']//a//img");
	
	By card = By.cssSelector(".pb-grid-item .pb-grid-content");
	By cardOnHover = By.cssSelector(".pb-grid-item .pb-grid-content:hover");

	
	By shopButton = By.xpath("//div[@data-title='Flipkart']//div[@id='tileDetails']/a");
	
	By viewAllBtn = By.xpath("//div[@class='rte']//p//a");
	
	By categoryCard = By.xpath("//div[@role='option' and @aria-describedby='slick-slide11']");
	
	By recomendedViewAllBtn = By.xpath("//a[@role='button' and contains(text(),'View All')]");
	
	By seeMoreProductsBtn = By.id("show-more");
	
	
	public WebElement getSeeMoreProductsBtn() {
		return driver.findElement(seeMoreProductsBtn);
	}
	
	public WebElement getRecomendedViewAllBtn() {
		return driver.findElement(recomendedViewAllBtn);
	}
	
	public WebElement getCategoryCard() {
		return driver.findElement(categoryCard);
	}
	
	public WebElement getViewAll() {
		return driver.findElement(viewAllBtn);
	}
	
	public WebElement getShopBtn() {
		return driver.findElement(shopButton);
	}
	
	public String getColor(WebElement e) {
		return e.getCssValue("background-color");
	}
	
	public void hoverOn(WebElement e) throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(e).build().perform();
		Thread.sleep(500);
		
	}
	
	public WebElement getCardOnHover() {
		return driver.findElement(cardOnHover);
	}
	
	public WebElement getCard() {
		return driver.findElement(card);
	}
	
	public WebElement getDot0() {
		return driver.findElement(dot0);
	}
	
	public WebElement getDot1() {
		return driver.findElement(dot1);
	}

	public WebElement getDiv0() {
		return driver.findElement(div0);
	}
	
	public WebElement getDiv1() {
		return driver.findElement(div1);
	}
	
	public WebElement getImg0() {
		return driver.findElement(img0);
	}
	
	public WebElement getImg1() {
		return driver.findElement(img1);
	}

	
	public boolean ifCardsIncreased() throws InterruptedException {
		//Thread.sleep(2000);
		int a=driver.findElements(By.xpath("//div[@class='pb-product-list-grid-wrapper']")).size();
//		System.out.println(a);
		return a>12;
	}

	
	
}

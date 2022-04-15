package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bankingPartnerPage {
	public WebDriver driver;
	public bankingPartnerPage(WebDriver driver) {
		this.driver=driver;
	}
	By mobikwikDetailsBtn = By.cssSelector("a[data-title='mobikwik']");
	
	By questionDiv = By.xpath("//div[@class='pb-accordion-item panel panel-default'][2]");
	
	By answerDiv = By.xpath("//div[@class='pb-accordion-item panel panel-default'][2]//div");
	
	By InduslandBankDiv = By.xpath("//div[contains(@class,'pb-carousel-img-content slick-slide') and @data-slick-index='3']");
	
	public WebElement getInduslandBankDiv() {
		return driver.findElement(InduslandBankDiv);
	}
	
	public WebElement getAnswerDiv() {
		return driver.findElement(answerDiv);
	}
	
	public WebElement getQuestionDiv() {
		return driver.findElement(questionDiv);
	}
	
	public WebElement getMobikwikDetailsBtn() {
		return driver.findElement(mobikwikDetailsBtn);
	}
}

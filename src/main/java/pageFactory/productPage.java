package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
	WebDriver driver;
	public productPage(WebDriver driver) {
		this.driver=driver;
	}
	By refundPolicyTab = By.linkText("REFUND POLICY");
	By companyDiv = By.xpath("//div[@class='tab-pane active']//div//div//div[@class='pb-accordion-item panel panel-default'][2]");
	By policyDiv = By.xpath("//div[@class='tab-pane active']//div//div//div[@class='pb-accordion-item panel panel-default'][2]/h3");
	
	public WebElement getCompanyDiv() {
		return driver.findElement(companyDiv);
	}
	public WebElement getPolicyDiv() {
		return driver.findElement(policyDiv);
	}
	public WebElement getRefundPolicyTab() {
		return driver.findElement(refundPolicyTab);
	}
	
	
	
}

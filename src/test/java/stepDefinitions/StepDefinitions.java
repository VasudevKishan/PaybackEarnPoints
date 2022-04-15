package stepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

import static org.testng.Assert.*;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import pageFactory.*;
import utils.*;



public class StepDefinitions extends BaseWebDriver {
	
	@Before
    public void initializeWebDriver(Scenario currentScenario) {
        setCurrentScenario(currentScenario.getName());
        super.initializeWebDriver();
    }
	@After
	public void close_the_browser() {
		String ssPath = ScreenshotUtil.takeScreenshot(webDriver);
        ScreenshotUtil.setLastScreenshotFilename(ssPath);
        super.closeAllBrowserWindows();
	}

	@Given("navigate to {string}")
	public void navigate_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
		super.webDriver.get(string);
	}

	@When("click on dots at bottom of banner")
	public void click_on_dots_at_bottom_of_banner() {
	    // Write code here that turns the phrase above into concrete actions
	    OnlineShoppingPage op = new OnlineShoppingPage(super.webDriver);
	    op.getDot1().click();
	    
	    
	}

	@Then("banner should change")
	public void banner_should_change() {
	    // Write code here that turns the phrase above into concrete actions
		OnlineShoppingPage op = new OnlineShoppingPage(super.webDriver);
		assertEquals(op.getDiv1().getAttribute("aria-hidden"), "false");
	}

	
	
	@When("hovered over a card")
	public void hovered_over_a_card() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    OnlineShoppingPage op = new OnlineShoppingPage(super.webDriver);
	    op.hoverOn(op.getCard());
	}

	@Then("card should expand in size")
	public void card_should_expand_in_size() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    OnlineShoppingPage op = new OnlineShoppingPage(super.webDriver);
	    Thread.sleep(500);
		try {
	    	
			WebElement e= op.getCardOnHover();
	    	assertTrue(e instanceof WebElement);
	    }
		catch(NoSuchElementException e) {
			assertEquals("a", "b");
		}
		
	}

	@When("hovered over shop button")
	public void hovered_over_shop_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    OnlineShoppingPage op = new OnlineShoppingPage(super.webDriver);
	    op.hoverOn(op.getShopBtn());
	}

	@Then("background color of shop button should change")
	public void background_color_of_shop_button_should_change() {
	    // Write code here that turns the phrase above into concrete actions
	    OnlineShoppingPage op = new OnlineShoppingPage(super.webDriver);
	    assertEquals(op.getColor(op.getShopBtn()),"rgba(13, 74, 131, 1)");// change 13 to 12 to check for failed tc
	}

	@When("click on view all button under shop online via leading websites")
	public void click_on_view_all_button_under_shop_online_via_leading_websites() {
	    // Write code here that turns the phrase above into concrete actions
	    new OnlineShoppingPage(super.webDriver).getViewAll().click();
	}

	@Then("user should be redirected to EARN POINTS AT ONLINE PARTNERS page")
	public void user_should_be_redirected_to_earn_points_at_online_partners_page() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(super.webDriver.getCurrentUrl(),"https://www.payback.in/shop-online/online-partners");
	    
	}
	

	@When("clicked on a card under shop by category")
	public void clicked_on_a_card_under_shop_by_category() {
	    // Write code here that turns the phrase above into concrete actions
		new OnlineShoppingPage(super.webDriver).getCategoryCard().click();
		
	}
	
	@Then("user should be redirected to products page")
	public void user_should_be_redirected_to_products_page() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(super.webDriver.getCurrentUrl(),"https://www.payback.in/shop-online/mobiles");
	}
	
	@When("clicked on view all button under recomended deals")
	public void clicked_on_view_all_button_under_recomended_deals() {
	    // Write code here that turns the phrase above into concrete actions
	    new OnlineShoppingPage(super.webDriver).getRecomendedViewAllBtn().click();
	}

	@Then("user should be redirected to product page")
	public void user_should_be_redirected_to_product_page() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(super.webDriver.getTitle(), "Earn Product List");
	}
	
	@When("clicked on See more products button")
	public void clicked_on_see_more_products_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		OnlineShoppingPage p = new OnlineShoppingPage(super.webDriver);
		p.getSeeMoreProductsBtn().click();
		Thread.sleep(1000);
		p.getSeeMoreProductsBtn().click();
	}

	@Then("more products should be displayed")
	public void more_products_should_be_displayed() throws InterruptedException {
		Thread.sleep(3000);
		assertTrue(new OnlineShoppingPage(super.webDriver).ifCardsIncreased());
	}
	


	@When("clicked on a product card")
	public void clicked_on_a_product_card() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(1000);
	    new productsPage(super.webDriver).getProductCard().click();
	    Iterator<String> i=super.webDriver.getWindowHandles().iterator();
		
	    String parent = i.next();
	    String child;
	    while(i.hasNext()) {
	    	child = i.next();
		super.webDriver.switchTo().window(child);}
	    
	}

	@Then("redirects to Product information page")
	public void redirects_to_product_information_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//String title = new productPage(webDriver).getTitle();
		Thread.sleep(1000);
	    boolean a = webDriver.getTitle().contains("Buy");
	    assertTrue(a);
	    
	}

	@When("click on a company under refund policy")
	public void click_on_a_company_under_refund_policy() {
	    // Write code here that turns the phrase above into concrete actions
	    productPage p = new productPage(webDriver);
	    p.getRefundPolicyTab().click();
	    p.getCompanyDiv().click();
	}

	@Then("the bar should expand")
	public void the_bar_should_expand() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("true", new productPage(super.webDriver).getPolicyDiv().getAttribute("aria-expanded"));
		
	}

	
	@When("clicked on details button under earn points at online partners")
	public void clicked_on_details_button_under_earn_points_at_online_partners() {
	    // Write code here that turns the phrase above into concrete actions
	    new IsopPage(super.webDriver).getMobikwikDetailsBtn().click();
	    
	}
	
	@Then("user should be redirected to website information page")
	public void user_should_be_redirected_to_website_information_page() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(super.webDriver.getTitle(), "Mobikwik Offers: Online Mobile Recharge, Bill Payment - PAYBACK");
		
	}
	
	@When("clicked on know more button")
	public void clicked_on_know_more_button() {
	    // Write code here that turns the phrase above into concrete actions
	    new PartnerInfoPage(super.webDriver).getRedBtn().click();
	    //change view
	    Iterator<String> i=super.webDriver.getWindowHandles().iterator();
		
	    String parent = i.next();
	    String child;
	    while(i.hasNext()) {
	    	child = i.next();
		super.webDriver.switchTo().window(child);}
	    //System.out.println("Know more button clicked");
	    
	    
	}
	
	@Then("user should be redirected to the online partners website")
	public void user_should_be_redirected_to_the_online_partners_website() {
	    // Write code here that turns the phrase above into concrete actions
		super.webDriver.switchTo().window(super.webDriver.getWindowHandles().iterator().next());
	    assertEquals(super.webDriver.getCurrentUrl(), "https://www.mobikwik.com/");
	}
	
	@When("clicked on details button under earn points at in store partners")
	public void clicked_on_details_button_under_earn_points_at_in_store_partners() {
	    // Write code here that turns the phrase above into concrete actions
	    new IsopPage(super.webDriver).getHpclBtn().click();
	}
	
	@Then("user should be redirected to store information page")
	public void user_should_be_redirected_to_store_information_page() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(super.webDriver.getCurrentUrl(), "https://www.payback.in/partner-brands/hpcl");
	}
	
	@Then("user should be redirected to the in store partners website")
	public void user_should_be_redirected_to_the_in_store_partners_website() {
	    // Write code here that turns the phrase above into concrete actions
		
		assertEquals(super.webDriver.getCurrentUrl(), "https://webapps8.hpcl.co.in/DealerLocator/");
	}

	@When("clicked on Details button of a banking partner card")
	public void clicked_on_details_button_of_a_banking_partner_card() {
	    // Write code here that turns the phrase above into concrete actions
	    new bankingPartnerPage(super.webDriver).getMobikwikDetailsBtn().click();
	}

	@Then("user should be redirected to website information page of banking partner")
	public void user_should_be_redirected_to_website_information_page_of_banking_partner() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(super.webDriver.getTitle(), "Mobikwik Offers: Online Mobile Recharge, Bill Payment - PAYBACK");
	}

	@When("clicked on questions under faq")
	public void clicked_on_questions_under_faq() {
	    // Write code here that turns the phrase above into concrete actions
	    new bankingPartnerPage(super.webDriver).getQuestionDiv().click();
	}

	@Then("the section should be expanded and show answer.")
	public void the_section_should_be_expanded_and_show_answer() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("true",new bankingPartnerPage(super.webDriver).getAnswerDiv().getAttribute("aria-expanded"));
	}

	@When("clicked on a card under banking partners")
	public void clicked_on_a_card_under_banking_partners() {
	    // Write code here that turns the phrase above into concrete actions
	    new bankingPartnerPage(super.webDriver).getInduslandBankDiv().click();
	}

	@Then("user should be redirected to that partners information page")
	public void user_should_be_redirected_to_that_partners_information_page() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(super.webDriver.getTitle(), "IndusInd Bank: Apply for IndusInd Bank PAYBACK Credit Card - PAYBACK");
	}
	
	@When("hovered on buy now button any card")
	public void hovered_on_buy_now_button_any_card() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    instantVouchersPage ivp = new instantVouchersPage(webDriver);
	    ivp.hoverOn(ivp.getCcdBuyBtn());
	    //Thread.sleep(2000);
	}

	@Then("Buy now button should be highlighted")
	public void buy_now_button_should_be_highlighted() {
	    // Write code here that turns the phrase above into concrete actions
	    instantVouchersPage ivp = new instantVouchersPage(webDriver);
	    assertEquals(ivp.getCcdBuyBtn().getCssValue("border-color"), "rgb(0, 70, 170)");
	}

	@When("clicked on buy now button")
	public void clicked_on_buy_now_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    new instantVouchersPage(webDriver).getCcdBuyBtn().click();
	    Thread.sleep(2000);
	}

	@Then("user should be redirected to voucher information page")
	public void user_should_be_redirected_to_voucher_information_page() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(webDriver.getTitle(), "Buy Cafe Coffee Day Gift Vouchers & Gift Cards | Redeem Payback Points");
	}

	@When("selected the filters")
	public void selected_the_filters() {
	    // Write code here that turns the phrase above into concrete actions
	    new instantVouchersPage(webDriver).chooseFilter();
	}

	@When("clicked on apply")
	public void clicked_on_apply() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    new instantVouchersPage(webDriver).getApplyBtn().click();
	    Thread.sleep(1000);
	}

	@Then("products related to the filter should be displayed")
	public void products_related_to_the_filter_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    instantVouchersPage ivp= new instantVouchersPage(webDriver);
	    int flag=1;
	    if(!(ivp.getCcdBuyBtn() instanceof WebElement)) {
	    	flag=0;
	    }
	    
		   WebElement el = ivp.getArchesBuyBtn(); 
		   if(el!=null)
		    flag=0;
		
	    if(flag==0) {
	    	assertTrue(false);
	    }else {
			assertTrue(true);
		}
	}

	@When("clicked on terms and conditions tab")
	public void clicked_on_terms_and_conditions_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    new voucherPage(webDriver).getTncTab().click();
	}

	@Then("should display terms and conditons")
	public void should_display_terms_and_conditons() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(new voucherPage(webDriver).getContentsHeading().getText(), "Terms & Conditions");
	}

	@When("clicked on instructions tab")
	public void clicked_on_instructions_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    new voucherPage(webDriver).getInstructionsTab().click();
	}

	@Then("should display instructions")
	public void should_display_instructions() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(new voucherPage(webDriver).getContentsHeading().getText(), "Important Instructions");
	}

	@When("clicked on how to use tab")
	public void clicked_on_how_to_use_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    new voucherPage(webDriver).getHowToUseTab().click();
	}

	@Then("should display how to use")
	public void should_display_how_to_use() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(new voucherPage(webDriver).getContentsHeading().getText(), "How to Use");
	}



}












//TestRunner
//features = {"src/test/java/features/scrollingBanner.feature"
//		,"src/test/java/features/cardsUnderOS.feature"
//		,"src/test/java/features/cardsUnderSBC.feature"
//		,"src/test/java/features/cardsUnderRecomendedDeals.feature"
//		,"src/test/java/features/cardsInProductsPage.feature"
//}

//TestRunner1
//features = {"src/test/java/features/isoPartners.feature"
//		,"src/test/java/features/bankingPartner.feature"
//		,"src/test/java/features/instantVouchers.feature"
//}




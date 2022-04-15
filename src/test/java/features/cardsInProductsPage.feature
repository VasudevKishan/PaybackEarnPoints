Feature: Products Page 
@MediumPriority @OnlineShopping
Scenario: Validate the cards in Products page and refund policy in product page
Given navigate to "https://www.payback.in/shop-online"
When clicked on a card under shop by category
Then user should be redirected to products page
When clicked on a product card
Then redirects to Product information page
When click on a company under refund policy
Then the bar should expand



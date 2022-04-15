Feature: Cards under SHOP BY CATEGORY

@MediumPriority @OnlineShopping
Scenario: Validate cards under shop by category redirects to products page on click
Given navigate to "https://www.payback.in/shop-online"
When clicked on a card under shop by category
Then user should be redirected to products page



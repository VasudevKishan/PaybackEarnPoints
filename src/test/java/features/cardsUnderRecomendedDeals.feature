Feature: Cards under Recomended Deals
@MediumPriority @OnlineShopping
Scenario: Validate the view all button under recomended deals
Given navigate to "https://www.payback.in/shop-online"
When clicked on view all button under recomended deals
Then user should be redirected to product page
When clicked on See more products button
Then more products should be displayed

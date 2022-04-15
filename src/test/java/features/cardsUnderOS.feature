Feature: Cards under SHOP ONLINE VIA PAYBACK ACROSS LEADING WEBSITES

@LowPriority @OnlineShopping
Scenario: Validate that the cards expand in size when hovered
Given navigate to "https://www.payback.in/shop-online"
When hovered over a card
Then card should expand in size 

@LowPriority @OnlineShopping
Scenario: Validate that the shop button changes color when hovered
Given navigate to "https://www.payback.in/shop-online"
When hovered over shop button
Then background color of shop button should change

@MediumPriority @OnlineShopping
Scenario: Validate the View All button to displays more cards
Given navigate to "https://www.payback.in/shop-online"
When click on view all button under shop online via leading websites
Then user should be redirected to EARN POINTS AT ONLINE PARTNERS page

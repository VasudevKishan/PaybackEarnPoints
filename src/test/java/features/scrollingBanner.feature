Feature: Scrolling Banner

@LowPriority @OnlineShopping
Scenario: Validate Banners are changing when user clicks on the dots at the bottom of the banner

Given navigate to "https://www.payback.in/shop-online"
When click on dots at bottom of banner
Then banner should change



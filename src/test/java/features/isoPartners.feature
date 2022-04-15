Feature: In Store and Online Partners

@MediumPriority @IsoPartners
Scenario: Validate the know more button in website information page of online partners
Given navigate to "https://www.payback.in/in-store-online-brands"
When clicked on details button under earn points at online partners
Then user should be redirected to website information page
When clicked on know more button
Then user should be redirected to the online partners website

@MediumPriority @IsoPartners
Scenario: Validate the know more button in website information page of in store partners
Given navigate to "https://www.payback.in/in-store-online-brands"
When clicked on details button under earn points at in store partners
Then user should be redirected to store information page 
When clicked on know more button
Then user should be redirected to the in store partners website


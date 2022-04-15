Feature: Banking Partners Page
@MediumPriority @BankingPartners
Scenario: Validate Faq section
Given navigate to "https://www.payback.in/banking-services"
When clicked on Details button of a banking partner card
Then user should be redirected to website information page of banking partner
When clicked on questions under faq
Then the section should be expanded and show answer.

@MediumPriority @BankingPartners
Scenario: Validate the cards under payback partners in banking partners page
Given navigate to "https://www.payback.in/banking-services"
When clicked on Details button of a banking partner card
Then user should be redirected to website information page of banking partner
When clicked on a card under banking partners
Then user should be redirected to that partners information page

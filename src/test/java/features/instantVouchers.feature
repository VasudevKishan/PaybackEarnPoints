Feature: Instant Vouchers page
@MediumPriority @InstantVouchers
Scenario: Validate the cards on Instant vouchers page
Given navigate to "https://www.gyftr.com/payback?token=TEMPXYZ786&utm_source=undefined"
When hovered on buy now button any card
Then Buy now button should be highlighted
When clicked on buy now button
Then user should be redirected to voucher information page

@HighPriority @InstantVouchers
Scenario: Validate the filters
Given navigate to "https://www.gyftr.com/payback?token=TEMPXYZ786&utm_source=undefined"
When selected the filters
And clicked on apply
Then products related to the filter should be displayed


@LowPriority @InstantVouchers
Scenario: Validate the tabs under Voucher information page
Given navigate to "https://www.gyftr.com/payback?token=TEMPXYZ786&utm_source=undefined"
When clicked on buy now button
Then user should be redirected to voucher information page
When clicked on terms and conditions tab
Then should display terms and conditons
When clicked on instructions tab
Then should display instructions
When clicked on how to use tab
Then should display how to use

Story - Google Search

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development

Scenario: Browse To Paytm Website in Google

Given User is on google search page
When User searches for <keyword>
And User selects <address> in search result
Then <title> page should be displayed

Examples:
|keyword    |address            |title                                                                                |
|paytm      |https://paytm.com/ |Paytm.com – Digital & Utility Payment, Entertainment, Travel, Payment Gateway & more Online|
Meta:

Narrative:
As a user
I want to see my information
So that I can see my status in the bank

GivenStories: stories/CreateAccount.story

Scenario: Open accountInfo Page
When User clicks on menu Account Information

Scenario: User is on account information page
Given I am on account information page
When I select my account <cpfNumberInfo>
When I click on get information button
Then system should show my info and a message <message>

Examples:
|cpfNumberInfo|message                         |
|11111111111  |Operation completed with success|
|-1           |The CPF information is invalid  |
Meta:

Narrative:
As a user
I want to deposit amount in my account
So that I can save money

GivenStories: stories/CreateAccount.story

Scenario: Open deposit Page
When User clicks on menu Deposit

Scenario: User is on deposit page and make a deposit
Given I am on deposit page
When I select the account I want to deposit <cpfNumberDeposit>
When I fill the amount field <amount>
When I click on deposit button
Then System should show a message <message>
Examples:
|cpfNumberDeposit|amount|message                                 |
|11111111111     |2000  |Operation completed with success        |
|11111111111     |0     |The ammount is invalid for the operation|
|-1              |0     |The CPF information is invalid          |
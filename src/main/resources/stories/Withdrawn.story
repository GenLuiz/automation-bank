Meta:

Narrative:
As a user
I want to withdrawn some money
So that I can pay my bills

GivenStories: stories/Deposit.story

Scenario: Open withdraw Page
When User clicks on menu Withdrawn

Scenario: User is on withdrawn page
Given I am on withdrawn page
When I select my account <cpfNumber>
When I fill the amount field <amount>
When I click on withdrawn button
Then System should show a message <message>
Examples:
|cpfNumber  |amount|message                                 |
|11111111111|10    |Operation completed with success        |
|11111111111|0     |The ammount is invalid for the operation|
|-1         |0     |The CPF information is invalid          |
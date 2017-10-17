Meta:

Narrative:
As a user
I want to transfer money
So that I can transfer amount between accounts

GivenStories: stories/Deposit.story

Scenario: Open transfer Page
When User clicks on menu Transfer

Scenario: User is on transfer page
Given I am on transfer page
Then I select my account to transfer <cpfNumber>
When I select my friends account <friendCpf>
When I fill the transfer amount field that I want to transfer <transferAmount>
When I click on transfer button
Then System should show a message <message>
Examples:
|cpfNumber  |friendCpf  |transferAmount|message                                 |
|11111111111|22222222222|10            |Operation completed with success        |
|11111111111|22222222222|0             |The ammount is invalid for the operation|
|11111111111|-1         |0             |The CPF information is invalid          |
|-1         |-1         |0             |The CPF information is invalid          |
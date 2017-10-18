Meta:

Narrative:
As a customer of the bank
I want to perform a loan
So that I can get certain amount of money

GivenStories: stories/Deposit.story

Scenario: User should perform a loan
Given User is on loan page
When loan page loads
When User select his account <cpfNumber>
When User fill the amountInput <amountValue>
When User clicks on makeLoanButton
Then the system should show the message <message>
Examples:
| cpfNumber   | amountValue | message                                                                              |
| 11111111111 |    600      | Operation completed with success                                                     |
| 33333333333 |    65000    | The requested loan ammount exceeds the available credit limit                        |
| 22222222222 |    30000    | Insufficient balance in account for the loan operation. Minimum of $2000 is required |
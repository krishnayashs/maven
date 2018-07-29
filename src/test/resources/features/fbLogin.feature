Feature: verify facebook login


Scenario: user enters invalid username ans password
Given user is on fb login page
When user enters username in the username textbox
And user enters password in the password textbox
And user clicks on login button
Then user navigates to other page
And User validates the error message.


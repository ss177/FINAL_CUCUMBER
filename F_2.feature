Feature: Login Ation

@Login_functionality
Scenario: Sucessfull Login with Valid Credentials
Given User is on Home Page
When User navigate to Login Page
Then Message Displayed Login Sucessfull


@Display_All_Users
Scenario: Display all the Users in project
Given User Must be Logged in the Account
When User clicks on logout
Then Message Displayed logout succesfully



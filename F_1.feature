Feature: front accounting login by using int_exp_1

@login
Scenario Outline: front acconting login should be successfull
Given User should be login
When enters "<username>" and "<password>"
Then Login Sucessfull in front accounting

Examples: 

 |         username|password |
 |    administrator|admin123 |
 |            admin|root     |



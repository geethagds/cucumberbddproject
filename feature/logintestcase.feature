Feature: Login feature file for test case

@loginwithvaliddata
Scenario: User should be able to login to the application

Given User is in login page
When User enters email id "prashanthi.skvl@gmail.com"
And User enters password "Test@123"
And User clicks the signin button

#@logintestwithinvaliddata
#Scenario: User should be able to login to the application

#Given User is in login page
#When User enters email id "prashanthi.skvl@gmaibl.com"
#And User enters password "Test@1234"
#And User clicks the signin button


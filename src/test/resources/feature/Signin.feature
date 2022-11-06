@Regression

Feature: Sign in feature
#Given user currently state
#When user do this
#Then this result of what user do

   Scenario: Sign in with  Valid Email and Password
   Given User on Sign in page
   When User fill valid email
   And valid password
   Then The result is success Sign in


    Scenario: Sign in with invalid data
    Given User on Sign in page
    When User fill invalid email
    And Invalid password
    Then The result is failed Sign in

    Scenario: Sign in with password less than 5 characters
    Given User on Sign in page
    When User fill valid email
    And Password less than 5 character
    Then The result is failed Sign in

    Scenario: Sign in with invalid Email and password less than 5 characters
    Given User on Sign in page
    When User fill invalid email
    And Password less than 5 character
    Then The result is failed Sign in

    Scenario: Sign in input empty Email and password
    Given User on Sign in page
    When User directly click sign in
    Then The result is failed Sign in


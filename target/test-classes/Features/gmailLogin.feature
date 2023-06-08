Feature: Checking loging functionality of Gmail

  Scenario: Vaidate the login functionality with valid Email and password
    Given User is on Login page
    When User enter valid mail id and password
    And User click on continue button
    Then User enter in to Home page of Gmail

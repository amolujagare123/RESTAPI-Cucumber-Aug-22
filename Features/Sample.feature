Feature: all login scenarios

  Scenario: To test the functionality of login button for valid input
    Given Login page should be opened
    When I enter correct username and correct password
    And I click on login button
    Then I should be redirected to home page
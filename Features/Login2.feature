Feature: All login tests on billing page


  @login
  Scenario: To test the functionality of login button for valid input on billing page
    Given Billing Login page should be opened
  #  When I enter correct username and correct password on billing page
    When I enter "admin" and "admin" on billing page
    And I click on login button on billing page
    Then I should be redirected to home page of billing application

  @login
  Scenario: To test the functionality of login button for invalid input on billing page
    Given Billing Login page should be opened
  #  When I enter incorrect username and incorrect password on billing page
    When I enter "xyz" and "abcd" on billing page
    And I click on login button on billing page
    Then I should get an error

  @login
  Scenario: To test the functionality of login button for blank input on billing page
    Given Billing Login page should be opened
    # When I dont enter username and password on billing page
    When I enter "" and "" on billing page
    And I click on login button on billing page
    Then I should get an another error

    @registration
    Scenario: to test the functionality of submit button for registration page
      Given I am on registration page
      When I enter below data
      | amol | ujagare | 898989 | amol@gmail.com |
      And I click on submit button
      Then user should be added


  @Subscription
  Scenario Outline: to test the functionality of subscribe button for subscription page
    Given I am on subscription page
    When I enter <name> , <contact> ,<email>
    And I click on subscribe button
    Then user should be subscribed

    Examples:
      | name        | contact | email        |
      | Avinash     | 12345   | a@gmail.com  |
      | Pushpalatha | 12345   |  p@gmail.com |
      | Shashi      | 12345   |  s@gmail.com |
      | Kirti       | 12345   |  k@gmail.com |
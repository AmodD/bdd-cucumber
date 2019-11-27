@WIP
Feature: Login

  @TV-4 @OPEN
  Scenario: Login using ID and Password
    Given I have entered http://localhost:48000 
    And I see the login page
    When I enter valid user ID and Password
    Then I should see the dashboard page

  @TV-4 @OPEN
  Scenario: Login using Invalid ID and valid password
    Given I have entered http://localhost:48000 
    And I see the login page
    When I enter invalid user ID and valid Password
    Then I should see an error message

  @TV-4 @OPEN
  Scenario: Login using Valid ID and Invalid Password
    Given I have entered http://localhost:48000 
    And I see the login page
    When I enter Valid user ID and Invalid Password
    Then I should see an error message

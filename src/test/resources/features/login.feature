Feature: Login

  @TV-8 @OPEN
  Scenario: Login using ID and Password
    Given I have entered http://localhost:48000 
    AND I see the login page
    When I enter valid user ID and Password
    Then I should see the dashboard page

  @ORPHAN
  Scenario: Login using Invalid ID and valid password
    Given I have entered http://localhost:48000 
    AND I see the login page
    When I enter invalid user ID and valid Password
    Then I should see an error message "Invalid credentials"

Feature: Login

  @ORPHAN
  Scenario: Login using ID and Password
    Given I have entered http://localhost:48000 
    AND I see the login page
    When I enter valid user ID and Password
    Then I should see the dashboard page

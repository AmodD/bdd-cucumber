Feature: Accessing the application

  @ORPHAN
  Scenario: Viewing in a browser
    Given I am on a browser
    When I type http://localhost:48000 in the address bar
    Then I should see the home login page

Feature: Accessing the application

  @TV-8 @OPEN
  Scenario: Viewing in a browser
    Given I am on a Chrome browser
    When I type http://localhost:48000 in the address bar
    Then I should see the product login page
    And The title of the page should be "Fortiate Data Solutions"

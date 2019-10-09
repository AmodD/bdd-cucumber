@WIP
Feature: TV in various browsers
  
  compatibility check to see if the TV application opens up in different browsers

  @TV-8 @OPEN
  Scenario: Viewing in a Chrome browser
    Given I am on a Chrome browser
    When I type http://localhost:48000 in the address bar
    Then I should see the product login page

  @TV-8 @OPEN
  Scenario: Viewing in a Firefox browser
    Given I am on a Firefox browser
    When I type http://localhost:48000 in the address bar
    Then I should see the product login page

  @TV-8 @OPEN @ON-HOLD
  Scenario: Viewing in a IE browser
    Given I am on a IE browser
    When I type http://localhost:48000 in the address bar
    Then I should see the product login page

  @TV-8 @OPEN
  Scenario: Viewing in a Safari browser
    Given I am on a Safari browser
    When I type http://localhost:48000 in the address bar
    Then I should see the product login page

Feature: Python Microservice to create a model from an imported csv

  @TV-82 @OPEN
  Scenario: Given I have a csv file
    Given I have a CSV file
    When I import a CSV file
    Then I have a KNN model

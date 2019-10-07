Feature: Python Microservice to create a model from an imported csv

  @TV-82 @OPEN
  Scenario: Create a KNN Model
    Given I have a CSV file
    When I import a CSV file
    Then I have a KNN model

  @TV-82 @OPEN
  Scenario: Create a K-Means Model
    Given I have a CSV file
    When I import a CSV file
    Then I have a K-Means model

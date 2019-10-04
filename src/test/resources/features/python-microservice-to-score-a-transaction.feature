Feature: Python Microservice to score a transaction

  @TV-72 @OPEN
  Scenario: KNN Model
    Given KNN model
    When Topic Parsed data has following features Processing Code(DE3 - bit 1 & 2)
    And Transaction Amount (DE4)
    And POS Entry Mode (DE22)
    And Merchant Category Code(DE18)
    And POS Condition Code(DE25)
    And POS Data Code (DE-61/63)
    And Target Variable as - Response Code (DE-39)
    Then the microservice uses the KNN model
    And the microservice returns a score

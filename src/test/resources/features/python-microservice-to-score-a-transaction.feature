Feature: Python Microservice to score a transaction

  @ORPHAN
  Scenario: KNN Model
    Given Topic Parsed data has Processing Code(DE3 - bit 1 & 2)
    And Transaction Amount (DE4)
    And POS Entry Mode (DE22)
    And Merchant Category Code(DE18)
    And POS Condition Code(DE25)
    And POS Data Code (DE-61/63)
    And Target Variable as - Response Code (DE-39)
    Then the microservice should generate a KNN model
    And the microservice should return a score

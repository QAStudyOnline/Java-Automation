@TestScenarioV1
Feature: Login into system

  Scenario: Register new customer and login
    Given open browser
    And open main page
    And go to signin page
    And register as a new customer with name: "Jack"
    Then new customer name is "Jack"
    And close the browser
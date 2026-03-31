Feature: Navigation through Bon-bonite main menu

  Scenario: Navigate to Zapatos module
    Given the user is on the Bon-bonite home page
    When the user clicks on the menu "Zapatos"
    Then the user should see the list of shoe products

  Scenario: Navigate to Bolsos module
    Given the user is on the Bon-bonite home page
    When the user clicks on the menu "Bolsos"
    Then the user should see the list of bag products
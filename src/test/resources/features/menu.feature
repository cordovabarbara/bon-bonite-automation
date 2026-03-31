@menu
Feature: Navigation through Bon-bonite main menu

  Scenario: Navigate to Zapatos module
    Given the user is on the Bon-bonite home page
    When the user clicks on the menu "Zapatos"
    Then the user should see the list of shoes products

  Scenario: Navigate to Bolsos module
    Given the user is on the Bon-bonite home page
    When the user clicks on the menu "Bolsos"
    Then the user should see the list of bags products

  Scenario: Navigate to Cinturones module
    Given the user is on the Bon-bonite home page
    When the user clicks on the menu "Cinturones"
    Then the user should see the list of belts products

  Scenario: Navigate to Accesorios module
    Given the user is on the Bon-bonite home page
    When the user clicks on the menu "Accesorios"
    Then the user should see the list of accessories products
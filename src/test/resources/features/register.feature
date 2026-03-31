
Feature: User registration on Bon-bonite

  @registro
  Scenario: Successful registration of a new user
    Given the user is on the Bon-bonite home page
    When the user navigates to "Mi cuenta"
    And the user completes the registration form with valid data
    Then the user should see a welcome message
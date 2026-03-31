@actualizar
Feature: Update user account details on Bon-bonite

  Scenario: Successfully update account details
    Given the user is on the Bon-bonite home page
    When the user navigates to account and logs in
    And the user updates the account details
    Then the user should see a success message
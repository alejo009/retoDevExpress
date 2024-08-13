#language:en
Feature: Login Operations
  Scenario Outline: Login a user with invalid code recaptcha
    Given that "user" has opened hotel homepage
    When he clicks on the login button
    And  he enters email "<email>"
    And he enters password "<password>"
    And he enters and invalid reCAPTCHA code "<recaptcha>"
    Then an error message should be displayed saying "<errorMessage>"
  Examples:
    | email              | password | recaptcha | errorMessage |
    | pepito24@gmail.com | pepito1234 | qWsGB   | The submitted code is incorrect |

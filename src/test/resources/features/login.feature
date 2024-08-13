#language:en
Feature: Login Operations

  Scenario Outline: Login a user with invalid code recaptcha
    Given that "user" has opened hotel homepage
    When  he enters email "<email>" and password "<password>" and invalid reCAPTCHA code "<recaptcha>"
   # Then an error message should be displayed saying "<errorMessage>"
    Examples:
      | email              | password   | recaptcha | errorMessage                    |
      | pepito24@gmail.com | pepito1234 | qWsGB     | The submitted code is incorrect |
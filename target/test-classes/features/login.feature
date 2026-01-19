Feature: Login Functionality for TDDBank

  Scenario Outline: Successful login with different credentials
    Given the user is on the TDDBank login page
    When the user logs in using email "<email>" and password "<password>"
    Then the user should be redirected to the dashboard

    Examples:
      | email               | password     |
      | admin@tddbank.com   | 123456       |
      | manager@tddbank.com | bankmanager  |

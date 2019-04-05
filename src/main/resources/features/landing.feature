Feature: Register

  Scenario: As a user I should be able to successfully land on the main campus society page

    Given I have navigated to the landing page "https://www.campussociety.com/"
    When I pressed on the login button
    Then I should be redirected to the login page


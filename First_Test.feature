Feature: My firs test

  Scenario: I want to create my first test
    Given I go to the Cambridge University website
    When I click Give to Cambridge link
    And I can click the Alumni website link
    Then I close the browser

  Scenario Outline: As a not-so-novice, I want to go beyond touching Chrome
    Given I go to the Cambridge University website
    When I enter the search word "<words>"
    And I click the search icon
    And The URL has the word "<words>" in it
    And The tab title contains the "<words>"
    Then I close the browser

    Examples:
      | words                   |
      | Research                |
      | Scholarship             |
      | Museums and Collections |

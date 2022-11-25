Feature: Palindrome Check

  Scenario: Valid Palindrome
    Given Input string "Katak"
    When check test Palindrome
    Then the result "true"

  Scenario: Invalid Palindrome
    Given Input string "Kucing"
    When check test Palindrome
    Then the result "false"

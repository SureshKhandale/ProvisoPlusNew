Feature: This feature explains parameterization in Cucumber

  Scenario: Pass two number as parameter
    Given I have number 5 and 6
    When I add them
    Then Check if its addition is prime

  Scenario: Pass a string as parameter
    Given I have a string "Hello"
    Then Print this string on console

  Scenario: Passing a table as argument
    Given I have numbers as follow:
      |  5 |  6 |
      | 11 | 14 |
      | 31 | 56 |
      |  8 | 29 |

  Scenario Outline: Data driven test case
    Given I have username and password from <row_number>
    Then Print them

    Examples: 
      | row_number | 
      |          1 |          
      |          2 |          
      |          3 |          
      |          4 |          

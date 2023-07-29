Feature: This is my first feature for learning cucumber

Scenario Outline: Data Driven test case in cucumber
Given Chrome browser is opened
And Url of practo is launched
When User enters <username> and <password>
Then User is login and print then

Examples:
|username|password|
|9325772706|'Suresh@7030'|

Scenario: This is a For Corporates test case in cucumber
Given Click on For Corporates button
And Click on a Health and Wellness Partner button and open the Health and Wellness Partner page
When User enter the all filed in page 
Then User click on Schedule a Demo button

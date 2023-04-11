Feature: Click Buttons

  Scenario: Given a user wants to click buttons
    Given A user navigates to the DemoQA site
    When He single clicks a button
    Then He should see "You have done a dynamic click"
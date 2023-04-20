Feature: Complete form

  Scenario: A user wants to complete a form
    Given a user navigates to the from
    When a user fills out the form and submits it
    Then a user should see text box after submission
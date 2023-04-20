Feature: QuieTrack Login

  Scenario: A user wants to login to QuieTrack.com
    Given A user navigates to QuieTrack.com
    When A user enters the username and password
    Then A user should see the home page

  Scenario: A user forgot their password
    Given A user is on the Login page
    When A user click 'Forgot Password'
    Then The forgot password popup should show
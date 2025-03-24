Feature: Validate Login Functionality for Demo Application Guru99

  Scenario Outline: To Validate the Login functionality for Guru99 application
    Given User opens the demo application of guru99
    And the User will enter his username in username field as "<username>"
    And the User will ente his password in password field as "<password>"
    When user will click on the login button of the application after the fields
    Then user will be navigated to the demo application of guru99

    Examples: 
      | username   | password |
      | mngr616980 | byrYsYj  |

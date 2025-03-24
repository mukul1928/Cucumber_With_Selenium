@regression
@both
Feature: Creation of new customer of Guru99 application

  Background: 
    Given User opens the demo application of guru99
    And the User will enter his username in username field as "mngr616980"
    And the User will ente his password in password field as "byrYsYj"
    When user will click on the login button of the application after the fields
    Then user will be navigated to the demo application of guru99

  Scenario Outline: Creation of New Customer
    Given the user clicks on the new customer link in the application guru99
    And user enters the customer name in guru99 application as "<customer_name>"
    And user selects the gender in the page
    And user enters the date of birth in the field as "<date_birth>"
    And user enters the address in guru99 application as "<address>"

    Examples: 
      | customer_name | address   | date_birth |
      | Chandan       | New Delhi | 10-19-1990 |

Feature: To test the user register functionality of ninja website

@All
  Scenario: Register with mandatory fields.
    Given User open the application and navigate to resiter page
    When user click on register button
    And enter the first name "om"
    And Last name "Kangane"
    And telephone number "7845129654"
    And Email address "abc@gmail.com"
    And enter the password "test@123"
    And enter the confirmed password "test@123"
    And click on check box to confirm the above details
    And click on submit button
    Then system should register the member and account created successfully.

@All @Sanity
  Scenario: Register with duplicate  email address .
    Given User open the application and navigate to resiter page
    When user click on register button
    And enter the first name "om"
    And Last name "Kangane"
    And telephone number "7845129654"
    And Email address "abc@gmail.test"
    And enter the password "test@123"
    And enter the confirmed password "test@123"
    And click on check box to confirm the above details
    And click on submit button
    Then system should display duplicate email address waring message.

@All
  Scenario: Register with all fields.
    Given User open the application and navigate to resiter page
    When user click on register button
    And enter the first name "om"
    And Last name "Kangane"
    And telephone number "7845129654"
    And Email address "abc@gmail.com"
    And enter the password "test@123"
    And enter the confirmed password "test@123"
    And user click on Yes in newsletter
    And click on check box to confirm the above details
    And click on submit button
    Then system should register the member.

@All
  Scenario: Register without providing any fields.
    Given User open the application and navigate to resiter page
    When user don't enter any deatils in any field
    And click on submit button
    Then warning message should be displayed.

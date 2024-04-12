@smoke
  Feature: F01_Register | users could register with new accounts
    Scenario: Guest user could register with valid data successfully
      Given User go to register page
      When  User selects gender type
      And   User enter first name "asmaa3" and last name "nasser3"
      And   User selects Date of birth "1" "March" "2000"
      And   User enter email "asmaa3@example.com" field
      And   User fills Password fields "Asdfghjkl0@" "Asdfghjkl0@"
      And   User clicks on register button
      Then  A new account should be created successfully
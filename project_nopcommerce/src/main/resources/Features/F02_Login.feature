@smoke
  Feature: F02_Login | users could use login functionality to use their accounts
    @valid
    Scenario: user could login with valid email and password
      Given User go to login page
      When  user login with "valid" "asmaa3@example.com" and "Asdfghjkl0@"
      And   user press on login button
      Then  user login to the system successfully

    @invalid
    Scenario: user could login with invalid email and password
      Given  User go to login page
      When   user login with "invalid" "wrong@example.com" and "P@ssw0rd"
      And    user press on login button
      Then   user could not login to the system




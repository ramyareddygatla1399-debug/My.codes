Feature: login

  Scenario: Verify login functionality with valid data 
  Given orange application is open 
  When enter valid username and password  and click on login
  Then registraion page should open
  And close the application 
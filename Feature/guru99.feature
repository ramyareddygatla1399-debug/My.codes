Feature: registration page

@smoke
  Scenario: verify registration page with valid credentials
  Given registraion page should open 
  When enter user name and password 
  And click on signin 
  Then user navigate to home page 
  And clickon registration button 
  
  
 @Regression 
  Scenario:  enter details into all fields in regitration page 
  Given registration page should open 
  When enter below details
  |firstname|Ramya|
  |lastname|gatla|
  |phone|9087654321|
  |email|ram123@gmail.com|
  |address|Hyderabad|
  |city|Ghanpur|
  |state|Telangana|
  |postalcode|506252|
  And county shoud be selected from dropdown
  And enter username password and confirm password fields 
  Then click on submit
  
  
  
  @smoke  @Regression 
  
  Scenario:  enter details into all fields in regitration page 
  Given registration page should open 
  When enter below details
  |firstname|Ramya|
  |lastname|gatla|
  |phone|9087654321|
  |email|ram123@gmail.com|
  |address|Hyderabad|
  |city|Ghanpur|
  |state|Telangana|
  |postalcode|506252|
  And county shoud be selected from dropdown
  And enter username password and confirm password fields 
  Then click on submit
 
 
  
Feature: User Login
To check the login functionality of Ninja Tutorial Application

@All  @Sanity
Scenario: Login with valid credentials
Given User open the application URL navigate to login Page
When user enters valid Email Address "om999@gmail.com"
And user enter the valid password "test@123"
And click on login button
Then user is successfully login 

@All
Scenario: Login with invalid credentials
Given User open the application URL navigate to login Page
When user enters invalid Email Address "om989@gmail.com"
And user enter the invalid password "test@128"
And click on login button
Then user should get proper warning message 

@All @Sanity
Scenario: Login with invalid email address 
Given User open the application URL navigate to login Page
When user enters invalid Email Address "om959@gmail.com"
And user enter the valid password "test@123"
And click on login button
Then user should get proper warning message   

@All
Scenario: Login with invalid password address 
Given User open the application URL navigate to login Page
When user enters invalid Email Address "om959@gmail.com"
And user enter the invalid password "test@12"
And click on login button
Then user should get proper warning message  

#How to write multiple data pass to test case 

#Scenario Outline: pass the multiple data into test case
#Given user enter the URL and open the login page
#When user enter the username as <username>
#And user enter the password as <password>
#Then it is land to dashboard
#And login successfully message is displayed
#Examples: 
         #|  username        |  password  |
         #|  test@gmail.com  |  Test@123|
         #|  Java@123gmail.com  |  Java@123|

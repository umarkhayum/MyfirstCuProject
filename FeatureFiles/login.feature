Feature: Login Functionality Feature
@adminLogin
Scenario:
Validate Login test
Given navigates to orangehm
When user logs in using Username as "Admin"
And password as "Qedge123!@#"
When user click login button
Then user should validate  url text
Then user close browser
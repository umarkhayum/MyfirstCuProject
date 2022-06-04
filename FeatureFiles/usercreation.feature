Feature:
user creation with multiple data
@UserMultipleData
Scenario Outline: User Validation with multiple data
Given User Launch Url in Browser
When I enter Username as "Admin"
And I Enter Password as"Qedge123!@#"
When  i click login button
When I click Admin
When I click AddBtn
When  i Select "<UserRole>" in user role
When i Enter "<EmployeeName>" in ename
When I Enter "<UserName>" in username 
When I Enter "<Password>" in password
When I Enter "<cpassword>" in cpassword
When I click on save button 
Then I vallidate Url
Then I close Browser
Examples:
|UserRole|EmployeeName|UserName|Password|cpassword|
|Admin|ashraf Demo|Akhilesh19|Testing_098255432tes|Testing_098255432tes|
|ESS|Anjali Temp|Akhilesh25|Testing_025765432tes|Testing_025765432tes|
|Admin|Ajay demo|Akhilesh30|Testing_0358765432tes|Testing_0358765432tes|
|ESS|Dravid Demo|Akhilesh80|Testing_04765432tes|Testing_04765432tes|
|ESS|Arun Kumar|Akhilesh94|Testing_0987432tes|Testing_0987432tes|
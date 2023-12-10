 #Author Gaurav
 Feature: Login to application
 
 
 Scenario: Login to vtiger application with valid credentials
 Given I want to launch the browser 
 And  enter the url
 When  Login page is dispalyed enter the valid credentials
 And click on Login button
 Then Validate if home page is displayed or not.     
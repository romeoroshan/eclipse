Feature: Test login Functionality

	Scenario: Check login is successfull with valid credential
		Given browser is open
		And user is on login page
		When user enters username and password
		And User clicks on login
		Then user is navigated to the home page
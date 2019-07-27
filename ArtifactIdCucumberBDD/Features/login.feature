Feature: Safety Login feature

	In order to ensure Login functionality works,
	I want to run the cucumber test to verify it is working

Scenario:Login Functionality


	Given user navigates to https://safety-red5.kuvrr.com/
	When title of the login page is Safety Kuvrr
	Then user enters email "admin" and password "secret"
	Then user click on continue button
	And user is on home Page
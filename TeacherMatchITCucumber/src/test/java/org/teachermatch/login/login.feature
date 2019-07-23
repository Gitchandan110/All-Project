Feature: Login Functionality Feature

	In order to ensure Login functionality works,
	I want to run the cucumber test to verify it is working

Scenario: Login Functionality
	Given user navigates to https://titan.teachermatch.org
	When user logs in using email as titanteacher@yopmail.com and password as omsai11ram
	Then login should be successful
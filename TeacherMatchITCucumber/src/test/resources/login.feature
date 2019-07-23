Feature: Login Functionality Feature

	In order to ensure Login functionality works,
	I want to run the cucumber test to verify it is working

Scenario: Login Functionality
	Given user navigates to https://titan.teachermatch.org
	When user logs in using email as “admin@teachermatch.com” and Password “TM@g!5U#r%|”
	Then login should be successful
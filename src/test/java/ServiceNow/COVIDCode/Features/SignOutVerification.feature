#Author: juarezds
Feature: Sign Out Verification

Description: This feature file will verify that the user can log out properly

@Smoke @Test_Case_COVID-245 @User_Story_COVID-261
Scenario:
Given an internal user is logged into the COVIDcode application
And is on the home page
Then the internal user is able to sign out of the application by clicking on the Sign Out button
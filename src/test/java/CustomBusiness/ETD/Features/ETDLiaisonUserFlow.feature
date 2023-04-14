Feature: Liaison flow

Background: common steps
Given User is on ETD home page and user is "WANG, GANGSHI"

@notAuthorizedLiaison @Regression @Needs_review
Scenario: not authorized
Then User can verify that home tab is not authorized

@selectAllDisabledLiaison @Regression @Needs_review
Scenario: Bulk reset
When User clicks on Manage ETD Tab
And User loads a wide search
And User cannot select all checkmark

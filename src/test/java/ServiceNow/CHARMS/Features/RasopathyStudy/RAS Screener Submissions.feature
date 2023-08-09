Feature: RAS Screener Scenarios
	Description: This feature file contains scenarios which submit myRAS Screeners and verifies questionnaire datas in Native View

	@juarezds @myRasScreenerSubmissionOnly @InProgress @Progression
	Scenario: Participant Screener Self Submission Scenario 1
	    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
		And logs in via Okta with username "charmsparticipant3@yopmail.com" and password "Charms123"
		And clicks on Eligibility Questionnaire to begin questionnaire
		When the participant submits a screener from excel sheet "screenerScenario4"
#		Then data submitted for scenario is verified in native view against corresponding scenario from the excel sheet
#		Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
#		And logs in via Okta with username "charmsras5@yahoo.com" and password "RASTest2023$$"
#		And the participant submits a Individual Information Questionnaire for excel sheet "IIQScenario1"

	@juarezds @InProgress
	Scenario: Submitting the consent in Native View
	This scenario selects 'No' to all questions
		Then data submitted for scenario is verified in native view against corresponding scenario from the excel sheet
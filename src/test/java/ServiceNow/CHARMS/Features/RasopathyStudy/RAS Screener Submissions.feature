Feature: RAS Screener Scenarios
	Description: This feature file contains scenarios which submit myRAS Screeners and verifies questionnaire datas in Native View

	@juarezds @myRasScreenerSubmissionOnly @InProgress
	Scenario: Participant Screener Self Submission Scenario 1
		This scenario selects 'No' to all questions
		Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
		And logs in via Okta with username "charmsras5@yahoo.com" and password "RASTest2023$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		When the participant submits a screener for scenario one from excel sheet "Scenario1"
		Then data submitted for scenario one is verified in native view against scenario one excel sheet

	@bucurgb @myRasScreenerSubmissionOnly @Updating
	Scenario: Participant Screener Self Submission Scenario 2
	This scenario selects 'No' to all questions
		Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
		And logs in via Okta with username "charmsras5@yahoo.com" and password "RASTest2023$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		When the participant submits a screener from excel sheet "screenerScenario1"
		Then data submitted for scenario is verified in native view against corresponding scenario from the excel sheet
		Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
		And logs in via Okta with username "charmsras5@yahoo.com" and password "RASTest2023$$"
		And the participant submits a Individual Information Questionnaire for excel sheet "IIQScenario1"

	@juarezds @myRasScreenerSubmissionOnly @InProgress
	Scenario: Participant Screener Self Submission Scenario 2
	This scenario is completing the forms for someone else and selects 'No' to all questions
		Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
		And logs in via Okta with username "charmsras5@yahoo.com" and password "RASTest2023$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		When the participant submits a screener from excel sheet "screenerScenario2"
		Then data submitted for scenario is verified in native view against corresponding scenario from the excel sheet
		Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
		And logs in via Okta with username "charmsras3@yahoo.com" and password "RASTest2023$$"
		And the participant submits a Individual Information Questionnaire for excel sheet "IIQScenario1"


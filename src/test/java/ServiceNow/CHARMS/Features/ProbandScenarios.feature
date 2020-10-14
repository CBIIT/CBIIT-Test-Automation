Feature: Proband Scenarios
Description: This feature file contains Proband related scenarios

@Progression 
Scenario: Proband LFS Okta Login
Given a Proband is on the CHARMS home page
When the Proband logs in with existing valid credentials
Then the Proband is directed to the Clinical Genetics Branch page
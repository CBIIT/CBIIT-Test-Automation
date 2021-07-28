Feature:

Description: This is the automated test suite for Comets Explorer

@Smoke @MataRodriguezKO
Scenario: Running Integrity Check
Given the user is on the Comets homepage
When the user clicks on the correlate
And the user submits a file and checks Integrity
Then the passed QC message appears

@Smoke @MataRodriguezKO
Scenario: Running Model
Given the user is on the Comets homepage
When the user clicks on the correlate
And the user runs the integrity check
And select pre-specified models
When selecting the Gender Stratified options from the Choose Model drop down
And clicking on Run Model
Then the Correlation successful message appears

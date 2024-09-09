#Author: @SonikaJain
Feature: Surgical Medication and other Medical History section of the Fanconi Survey on the Fanconi Longitudinal Cohort Study Portal
  Description:This feature file contains submissions and assertion scenarios for the Surgical Medication and other Medical History section of the Fanconi Survey by the proband or the legal guardian (Proxy)

  @jains @SurgicalMedicationHistory @CP2-3178 @CP2-3133 @playwright @In-Progress @Testing
  Scenario: Participant fills and submit the Surgical Medication and other Medical History section for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    And fills the Surgical and other Medical History section for scenario 1
Feature: SMS Clinic Visits
  Description:This portion of the Study Management System allows Study Team to easily see and track Participant Clinic visits and the expected Schedule/Appointments for the Clinic Visit days. These records can be viewed from either the Participant Details or Participant Study records.

  @jains @ClinicVisits @playwright @In-Progress
  Scenario: Participant records a New Clinic visit form for scenario 1
    Given a Participant is on the Fanconi Study login page and logs with user credentials via Okta
    Given a Participant is on the RAS Study login page and logs with user credentials via Okta
    And fills the Background Information section for scenario 1
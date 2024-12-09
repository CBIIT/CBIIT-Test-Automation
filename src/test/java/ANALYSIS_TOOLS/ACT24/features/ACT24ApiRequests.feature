Feature: These are API requests that are made on the ACT24 application

  @matakevin @Smoke @Regression @selenium
  Scenario: User retrieves participant list on researcher site
    Then the GET call to retrieve participant list is requested and the 200 status code is returned

  @matakevin @Smoke @Regression @selenium
  Scenario: Retrieve Study and Recall data from the given resource in JSON format from study 7685
    Then the Study and Recall Data and 200 status code is returned

  @matakevin @Smoke @Regression @selenium
  Scenario: Retrieve Study and Recall data from the given resource in JSON format from study 7693 with no participants
    Then the Study 7694 Recall Data and 200 status code is returned

  @matakevin @Smoke @Regression @selenium
  Scenario: Retrieve Study and Recall data from the given resource in JSON format from study 7692 with no participants
    Then the Studys 7692 Recall Data and 200 status code is returned

  @matakevin @Smoke @Regression @selenium
  Scenario: Retrieve Study and Recall statistics (Detailed Report, with Overlap Resolution [QC]) from the given resource in JSON format
    Then the selected participants with specified StudyID "7692" detailed reports are returned with status code 200

  @matakevin @Smoke @Regression @selenium
  Scenario: Retrieve Study and Recall data (Summary Report, with Overlap Resolution [QC]) from the given resource in JSON format
    Then the selected participants "7685" with specified StudyIDs are returned with status code 200
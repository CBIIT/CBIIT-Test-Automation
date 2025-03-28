Feature: These are API requests that are made on the ACT24 application

  @Smoke @satya @Regression @playwright @NCIATWP-8639
  Scenario: User retrieves the study list
    Given User sets the baseUrl and endpoint for the request
    Then User sends the request and retrieves the study list

  @Smoke @satya @Regression @playwright @NCIATWP-8640
  Scenario: User retrieves the participant list of a studyid
    Given User sets the baseUrl and endpoint for the request of participant list
    Then User sends the request and retrieves the participant list

  @Smoke @satya @Regression @playwright @NCIATWP-8646
  Scenario: User retrieves the QC summary report of the study
    Given User sets the baseUrl and endpoint for the request of QC summary report
    Then User sends the request and retrieves the QC summary report

  @Smoke @satya @Regression @playwright @NCIATWP-8647
  Scenario: User retrieves the QC detail report of the study
    Given User sets the baseUrl and endpoint for the request of QC detail report
    Then User sends the request and retrieves the QC detail report

  @Smoke @satya @Regression @playwright @NCIATWP-8647
  Scenario: User retrieves the detail report of the study
    Given User sets the baseUrl and endpoint for the request of detail report
    Then User sends the request and retrieves the detail report
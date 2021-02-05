Feature: CICD Integration

  @CICD_Integration_Application_Build
  Scenario: CICD DevOps Application Automated Build Deployment
    Given login to the CICD_Dev_Ops application in Native View is successful with username "DevOpsUsername" and password "DevOpsPassword"
    When selecting the "CICD Integration" application
    And selecting "Application" as the deployment type
    Then build is able to be executed successfully
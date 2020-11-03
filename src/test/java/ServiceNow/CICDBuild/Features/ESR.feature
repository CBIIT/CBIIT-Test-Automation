Feature: ESR Automated Build Deployment

  @ESR_Application_Build
  Scenario: CICD DevOps Application Automated Build Deployment
    Given login to the CICD_Dev_Ops application in Native View is successful with username "DevOpsUsername" and password "DevOpsPassword"
    When selecting the "esr" application
    And selecting "Application" as the deployment type
   # Then build is able to be executed successfully
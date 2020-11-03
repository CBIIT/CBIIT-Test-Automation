Feature: CICD_Dev_Ops Automated Build Deployment

  @CICD_Dev_Ops_Application_Build
  Scenario: CICD DevOps Application Automated Build Deployment
    Given login to the CICD_Dev_Ops application in Native View is successful with username "DevOpsUsername" and password "DevOpsPassword"
    When selecting the "CICD_Dev_Ops" application
    And selecting "Application" as the deployment type
   # Then build is able to be executed successfully

  @CICD_Dev_Ops_UpdateSet_Build
  Scenario: CICD DevOps UpdateSet Automated Build Deployment
    Given login to the CICD_Dev_Ops application in Native View is successful with username "DevOpsUsername" and password "DevOpsPassword"
    When selecting the "CICD_Dev_Ops" application
    And selects "UpdateSet" as the deployment type
    When selecting sets that contain "CICD_Dev_Ops_in_progress" and moving them to the right side table
   # Then build is able to be executed successfully 

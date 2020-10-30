Feature: CICD_Dev_Ops Automated Build Deployment

  @DevOpsApplicationBuild
  Scenario: CICD_Dev_Ops Application Automated Build Deployment
    Given login to the CICD_Dev_Ops application in Native View is successful with username "DevOpsUsername" and password "DevOpsPassword"
    When selecting the "CICD_Dev_Ops" application
    And selecting "Application" as the deployment type
    Then build is able to be executed successfully

  #@DevOpsInProgressBuild 
  Scenario: CICD_Dev_Ops UpdateSet Automated Build Deployment
    Given login to the CICD_Dev_Ops application in Native View is successful with username "DevOpsUsername" and password "DevOpsPassword"
    When selecting the "CICD_Dev_Ops" application
    And selects "UpdateSet" as the deployment type
  # When selecting sets that contain "code_review" and moving them to the right side table
    #Then build is able to be executed successfully 

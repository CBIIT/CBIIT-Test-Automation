#Author: @SonikaJain
Feature: FHQ Form Submission Scenarios
  Description:This feature file contains scenarios which submit FHQ Screener by Participant or Legal guardian of the participant in the portal and assertion of data in the NativeView

  @jains @FHQSubmissionInPortal @CP2-562 @CP2-930 @CP2-559 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for all the Relatives
    Given test automation account "<AccountResetScriptURL>" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And the consent is submitted for "<ScreenerScenario>" and "<ConsentStatus>" "<ConsentType>" "<ResponseType>" is verified in Native View

    Examples:
      | Email                  | Password   | ScreenerScenario      | ConsentStatus | ConsentType | ResponseType                 | AccountResetScriptURL                                                                                    |
      | Rasopathy1@yopmail.com | Charms123$ | screenerScenarioAdult | Complete      | Adult       | Participant upload to portal | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @jains @FHQ_Regression @selenium
  Scenario Outline: Reset the FHQ test accounts
    Given test automation account "<AccountResetScriptURL>" has been reset

    Examples:
      | AccountResetScriptURL                                                                                                                                                                                                                                                             |
      | https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sys_script_fix.do%3Fsys_id%3D9e54020987309250ad46326d3fbb35f4%26sysparm_record_target%3Dsys_script_fix%26sysparm_record_row%3D15%26sysparm_record_rows%3D1420%26sysparm_record_list%3DORDERBYDESCsys_updated_on |

  @jains @FHQSubmissionInPortal @CP2-562 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Participant |

  @jains @FHQSubmissionInPortal @CP2-930 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Partner     |

  @jains @FHQSubmissionInPortal @CP2-559 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Mother      |

  @jains @FHQSubmissionInPortal @CP2-559 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Father      |

  @jains @FHQSubmissionInPortal @CP2-563 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Children    |

  @jains @FHQSubmissionInPortal @CP2-603 @CP2-1020 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Sibling     |

  @jains @FHQSubmissionInPortal @CP2-550 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Aunt        |

  @jains @FHQSubmissionInPortal @CP2-550 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Uncle       |

  @jains @FHQSubmissionInPortal @CP2-550 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | NieceNephew |

  @jains @FHQSubmissionInPortal @CP2-559 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative         |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | MaternalGrandMother |

  @jains @FHQSubmissionInPortal @CP2-559 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative         |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | MaternalGrandFather |

  @jains @FHQSubmissionInPortal @CP2-559 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative         |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | PaternalGrandMother |

  @jains @FHQSubmissionInPortal @CP2-559 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative         |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | PaternalGrandFather |

  @jains @FHQSubmissionInPortal @CP2-563 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative   |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | GrandChildren |

  @jains @FHQSubmissionInPortal @CP2-563 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                  | Password   | FHQScenario  | FHQRelative |
      | Rasopathy1@yopmail.com | Charms123$ | FHQScenario1 | Cousin      |

    @jains @FHQAssertionInNV @CP2-562 @FHQ_Regression @selenium
    Scenario Outline: This scenario outline the assertion of the completed FHQ Form for all the Relatives
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Form

      Examples:
        | Email                  | Password   |
        | Rasopathy1@yopmail.com | Charms123$ |


  @jains @FHQAssertionInNV @CP2-1013 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
   Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Participant |

  @jains @FHQAssertionInNV @CP2-930 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Partner     |

  @jains @FHQAssertionInNV @CP2-924 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Mother      |

  @jains @FHQAssertionInNV @CP2-924 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Father      |

  @jains @FHQAssertionInNV @CP2-935 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Children    |

  @jains @FHQAssertionInNV @CP2-931 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Sibling     |

  @jains @FHQAssertionInNV @CP2-928 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Aunt        |

  @jains @FHQAssertionInNV @CP2-943 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Uncle       |

  @jains @FHQAssertionInNV @CP2-943 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | NieceNephew |

  @jains @FHQAssertionInNV @CP2-913 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandMother |

  @jains @FHQAssertionInNV @CP2-913 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandFather |

  @jains @FHQAssertionInNV @CP2-913 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandMother |

  @jains @FHQAssertionInNV @CP2-913 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandFather |

  @jains @FHQAssertionInNV @CP2-936 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative   |
      | FHQScenario1 | GrandChildren |

  @jains @FHQAssertionInNV @CP2-942 @FHQ_Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Cousin      |

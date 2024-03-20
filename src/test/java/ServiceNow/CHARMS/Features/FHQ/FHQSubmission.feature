#Author: @SonikaJain
Feature: FHQ Form Submission Scenarios
  Description:This feature file contains scenarios which submit FHQ Screener by Participant or Legal guardian of the participant in the portal and assertion of data in the NativeView

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for all the Relatives
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And participant submits FHQ Relatives Form from excel name "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario  |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Participant |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Partner     |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Mother      |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Father      |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Children    |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Sibling     |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Aunt        |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Uncle       |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | NieceNephew |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | MaternalGrandMother |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | MaternalGrandFather |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | PaternalGrandMother |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | PaternalGrandFather |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative   |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | GrandChildren |

  @FHQSubmissionInPortal @Regression
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Cousin      |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Participant |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Partner     |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Mother      |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Father      |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Children    |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Sibling     |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Aunt        |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Uncle       |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | NieceNephew |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandMother |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandFather |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandMother |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandFather |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative   |
      | FHQScenario1 | GrandChildren |

  @FHQAssertionInNV @Regression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Cousin      |

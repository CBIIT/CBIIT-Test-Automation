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

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Participant |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Partner     |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Mother      |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Father      |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Children    |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Sibling     |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Aunt        |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Uncle       |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | NieceNephew |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | MaternalGrandMother |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | MaternalGrandFather |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | PaternalGrandMother |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | PaternalGrandFather |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative   |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | GrandChildren |

  @FHQSubmissionInPortal
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario1 | Cousin      |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Participant |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Partner     |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Mother      |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Father      |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Children    |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Sibling     |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Aunt        |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Uncle       |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | NieceNephew |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandMother |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandFather |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandMother |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandFather |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative   |
      | FHQScenario1 | GrandChildren |

  @FHQAssertionInNV
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Cousin      |

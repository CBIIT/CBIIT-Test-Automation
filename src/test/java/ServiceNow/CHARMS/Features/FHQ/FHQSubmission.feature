#Author: @SonikaJain
Feature: FHQ Form Submission Scenarios
  Description:This feature file contains scenarios which submit FHQ Screener by Participant or Legal guardian of the participant in the portal and assertion of data in the NativeView

  @jains @FHQSubmissionInPortal @CP2-562 @CP2-930 @CP2-559 @Regression1 @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for all the Relatives
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And participant submits FHQ Relatives Form from excel name "<FHQScenario>"

    Examples:
      | Email                | Password      | FHQScenario  |
      | charmsras5@yahoo.com | RASTest2023$$ | FHQScenario1 |

  @jains @FHQSubmissionInPortal @CP2-562 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Participant |

  @jains @FHQSubmissionInPortal @CP2-930 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Partner     |

  @jains @FHQSubmissionInPortal @CP2-559 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Mother      |

  @jains @FHQSubmissionInPortal @CP2-559 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Father      |

  @jains @FHQSubmissionInPortal @CP2-563 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Children    |

  @jains @FHQSubmissionInPortal @CP2-603 @CP2-1020 @Regression1 @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Sibling     |

  @jains @FHQSubmissionInPortal @CP2-550 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Aunt        |

  @jains @FHQSubmissionInPortal @CP2-550 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Uncle       |

  @jains @FHQSubmissionInPortal @CP2-550 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | NieceNephew |

  @jains @FHQSubmissionInPortal @CP2-559 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | MaternalGrandMother |

  @jains @FHQSubmissionInPortal @CP2-559 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | MaternalGrandFather |

  @jains @FHQSubmissionInPortal @CP2-559 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | PaternalGrandMother |

  @jains @FHQSubmissionInPortal @CP2-559 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative         |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | PaternalGrandFather |

  @jains @FHQSubmissionInPortal @CP2-563 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative   |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | GrandChildren |

  @jains @FHQSubmissionInPortal @CP2-563 @Regression @selenium
  Scenario Outline: This scenario outline the completion of the FHQ Form for one Relative Type
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And user submits FHQ Relative from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras1@yahoo.com | RASTest2022$$ | FHQScenario1 | Cousin      |

  @jains @FHQAssertionInNV @CP2-1013 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Participant |

  @jains @FHQAssertionInNV @CP2-930 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Partner     |

  @jains @FHQAssertionInNV @CP2-924 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Mother      |

  @jains @FHQAssertionInNV @CP2-924 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Father      |

  @jains @FHQAssertionInNV @CP2-935 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Children    |

  @jains @FHQAssertionInNV @CP2-931 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Sibling     |

  @jains @FHQAssertionInNV @CP2-928 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Aunt        |

  @jains @FHQAssertionInNV @CP2-943 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Uncle       |

  @jains @FHQAssertionInNV @CP2-943 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | NieceNephew |

  @jains @FHQAssertionInNV @CP2-913 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandMother |

  @jains @FHQAssertionInNV @CP2-913 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | MaternalGrandFather |

  @jains @FHQAssertionInNV @CP2-913 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandMother |

  @jains @FHQAssertionInNV @CP2-913 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative         |
      | FHQScenario1 | PaternalGrandFather |

  @jains @FHQAssertionInNV @CP2-936 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative   |
      | FHQScenario1 | GrandChildren |

  @jains @FHQAssertionInNV @CP2-942 @Regression @selenium
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form for one Relative Type
    Given the study nurse logs into Native View
    Then data submitted for FHQ Relative is verified in FHQ Patient page of NativeView from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples:
      | FHQScenario  | FHQRelative |
      | FHQScenario1 | Cousin      |

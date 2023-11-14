Feature: FHQ Form Submission Scenarios
  Description:This feature file contains scenarios which submit FHQ Screener by Participant or Legal guardian of the participant

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    # And clicks CHARMS FHQ Relative Link page
    And participant submits FHQ Relatives Form from excel name "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario  |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario2 |

  #@FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Survey page
    And participant submits FHQ Participant from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario2 | Participant |

  #@FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And participant submits FHQ Partner from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario2 | Partner     |

  #@FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And participant submits FHQ Mother from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario2 | Mother      |

  #@FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And participant submits FHQ Father from excel name "<FHQScenario>" and excel sheet "<FHQRelative>"

    Examples: 
      | Email                | Password      | FHQScenario  | FHQRelative |
      | charmsras2@yahoo.com | RASTest2023$$ | FHQScenario2 | Father      |

  #@FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Survey page
    And participant submits FHQ Participant from excel sheet "<FHQScenario>"
 
    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Participant |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Relative Link page
    And participant submits FHQ Relative from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario         |
      | charmsras1@yahoo.com | RASTest2022$$ | Partner             |
      | charmsras1@yahoo.com | RASTest2022$$ | Mother              |
      | charmsras1@yahoo.com | RASTest2022$$ | Father              |
      | charmsras1@yahoo.com | RASTest2022$$ | Children            |
      | charmsras1@yahoo.com | RASTest2022$$ | Sibling             |
      | charmsras1@yahoo.com | RASTest2022$$ | Aunt                |
      | charmsras1@yahoo.com | RASTest2022$$ | Uncle               |
      | charmsras1@yahoo.com | RASTest2022$$ | NieceNephew         |
      | charmsras1@yahoo.com | RASTest2022$$ | MaternalGrandMother |
      | charmsras1@yahoo.com | RASTest2022$$ | MaternalGrandFather |
      | charmsras1@yahoo.com | RASTest2022$$ | PaternalGrandMother |
      | charmsras1@yahoo.com | RASTest2022$$ | PaternalGrandFather |
      | charmsras1@yahoo.com | RASTest2022$$ | GrandChildren       |
      | charmsras1@yahoo.com | RASTest2022$$ | Cousin              |

  @FHQRegression @Verified
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Partner Link page
    And participant submits FHQ Partner from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Partner     |

  @FHQRegression @Verified
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Mother Link page
    And participant submits FHQ Mother from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Mother      |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Father Link page
    And participant submits FHQ Father from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Father      |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Children Link page
    And participant submits FHQ Children from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Children    |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Sibling Link page
    And participant submits FHQ Sibling from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Sibling     |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Aunt Link page
    And participant submits FHQ Aunt from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Aunt        |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Uncle Link page
    And participant submits FHQ Uncle from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Uncle       |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ NieceNephew Link page
    And participant submits FHQ NieceNephew from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | NieceNephew |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ MaternalGrandMother Link page
    And participant submits FHQ MaternalGrandMother from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario         |
      | charmsras5@yahoo.com | RASTest2023$$ | MaternalGrandMother |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ MaternalGrandFather Link page
    And participant submits FHQ MaternalGrandFather from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario         |
      | charmsras5@yahoo.com | RASTest2023$$ | MaternalGrandFather |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ PaternalGrandMother Link page
    And participant submits FHQ PaternalGrandMother from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario         |
      | charmsras5@yahoo.com | RASTest2023$$ | PaternalGrandMother |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ PaternalGrandFather Link page
    And participant submits FHQ PaternalGrandFather from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario         |
      | charmsras5@yahoo.com | RASTest2023$$ | PaternalGrandFather |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ GrandChildren Link page
    And participant submits FHQ GrandChildren from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario   |
      | charmsras5@yahoo.com | RASTest2023$$ | GrandChildren |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Cousin Link page
    And participant submits FHQ Cousin from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras5@yahoo.com | RASTest2023$$ | Cousin      |

  @FHQRegression
  Scenario Outline: This scenario outline the completion of the FHQ Form
    Given participant open RASopathies Longitudinal Cohort Study login page
    Then logs Rasopathy page via Okta with username "<Email>" and password "<Password>"
    And clicks CHARMS FHQ Parent Link page
    And participant submits FHQ Parent from excel sheet "<FHQScenario>"

    Examples: 
      | Email                | Password      | FHQScenario |
      | charmsras1@yahoo.com | RASTest2022$$ | Parent      |

  @FHQRegression 
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ Patient is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario |
      | Participant |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ Partner is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario |
      | Partner     |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ Mother is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario |
      | Mother      |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ Father is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario |
      | Father      |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ Children is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
     | FHQScenario |
     | Children    |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ Sibling is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples:
      | FHQScenario |
      | Sibling     |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ AuntUncle is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples:
      | FHQScenario |
      | AuntUncle   |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ NieceNephew is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario |
      | NieceNephew |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ MaternalGrandMother is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario         |
      | MaternalGrandMother |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ MaternalGrandFather is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
     | FHQScenario         |
     | MaternalGrandFather |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ PaternalGrandMother is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario         |
      | PaternalGrandMother |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ PaternalGrandFather is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario         |
      | PaternalGrandFather |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ GrandChildren is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario   |
      | GrandChildren |

  @FHQRegression
  Scenario Outline: This scenario outline the assertion of the completed FHQ Form
    Given the study nurse logs into Native View
    Then data submitted for FHQ Cousin is verified in FHQ Patient page of NativeView from excel sheet "<FHQScenario>"

    Examples: 
      | FHQScenario |
      | Cousin      |
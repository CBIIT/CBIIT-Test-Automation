Feature: These are the scenarios for the API Access tab on the mSigPortal Application

    @Smoke @matakevin @selenium
    Scenario: User retrieves mutational signature data for SBS1
        Given user sets api mutational signature data with signature name as SBS One
        Then SBS One data is received

    @matakevin @NEEDSREVIEW @selenium
    Scenario: User retrieves mutational spectrum data
        Given user sets api mutational spectrum with default parameters on API access page
        Then mutational spectrum data is received

    @Smoke @matakevin @selenium
    Scenario: User retrieves signature activity data
        Given user sets api signature activity with default parameters on API access page
        Then signature activity data is received

    @Smoke @matakevin @selenium
    Scenario: User retrieves signature association data
        Given user sets api signature association with default parameters on API access page
        Then signature association data is received

    @matakevin @NEEDSREVIEW @selenium
    Scenario: User retrieves ethiology data
        Given user sets api ethiology data with default parameters on API access page
        Then ethiology data is received
Feature: mSigPortal Api Access

    @Smoke @uddins211
    Scenario: User retrieves mutational signature data for SBS1
        Given user sets api mutational signature data with signature name as SBS One
        Then SBS One data is received


    Scenario: User retrieves mutational spectrum data
        Given user sets api mutational spectrum with default parameters on API access page
        Then mutational spectrum data is received

    @Smoke @uddins211
    Scenario: User retrieves signature activity data
        Given user sets api signature activity with default parameters on API access page
        Then signature activity data is received

    @Smoke @uddins211
    Scenario: User retrieves signature association data
        Given user sets api signature association with default parameters on API access page
        Then signature association data is received

    @Smoke @uddins211 @Progression
    Scenario: User retrieves ethiology data
        Given user sets api ethiology data with default parameters on API access page
        Then ethiology data is received
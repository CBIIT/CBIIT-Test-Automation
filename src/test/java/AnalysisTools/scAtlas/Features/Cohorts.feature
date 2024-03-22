Feature:These are features on the Cohorts Page of scAtlas

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Gene Filter on NCI-Clarity using "RP11-1260E13.2"
        Given the user is on the scAtlas home page
        When the user clicks NCI-CLARITY window
        And the user enters "RP11-1260E13.2" in the gene filter
        Then the "RP11-1260E13.2" gene Cell is returned

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Gene Filter on Multi-Regional using "RP11-1260E13.2"
        Given the user is on the scAtlas home page
        When the user clicks Multi-Regional window
        And the user enters "RP11-1260E13.2" in the gene filter
        Then the "RP11-1260E13.2" gene Cell is returned

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Gene Filter on Sequential NCI-Clarity using "RP11-1260E13.2"
        Given the user is on the scAtlas home page
        When the user clicks Sequential NCI-Clarity window
        And the user enters "RP11-1260E13.2" in the gene filter
        Then the "RP11-1260E13.2" gene Cell is returned

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Gene Filter on NCI-Clarity using "AAAS"
        Given the user is on the scAtlas home page
        When the user clicks Sequential NCI-Clarity window
        And the user enters "AAAS" in the gene filter
        Then the "AAAS" Cell is returned

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Gene Filter on Multi-Regional using "AAAS"
        Given the user is on the scAtlas home page
        When the user clicks Sequential NCI-Clarity window
        And the user enters "AAAS" in the gene filter
        Then the "AAAS" Cell is returned

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Gene Filter on Sequential NCI-Clarity using "AAAS"
        Given the user is on the scAtlas home page
        When the user clicks Sequential NCI-Clarity window
        And the user enters "AAAS" in the gene filter
        Then the "AAAS" Cell is returned
Feature: These scenarios verify the LDassoc module of the LDLink Application

    @Smoke @Regression @matakevin @selenium
    Scenario: Calculating the example file on LDassoc
        Given a LDlink user opens home page
        When the user clicks on the LDassoc module
        When the user calculates example GWAS data on the LDassoc page
        Then the "Association Results" text displays

    @matakevin @NEEDSREVIEW @selenium
    Scenario: Uploading the firewall limit txt file to LDassoc
        Given a LDlink user opens home page
        When the user clicks on the LDassoc module
        And the user uploads "./src/test/resources/prostate_example_grch37.txt", selects Variant drop down, enters "rs7837688" and YRI population and calculates
        Then the "Association Results" text displays

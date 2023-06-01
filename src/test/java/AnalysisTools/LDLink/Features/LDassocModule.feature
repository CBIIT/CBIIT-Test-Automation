Feature: This feature file encompasses test cases on the LDassoc module of LDlink

    @Smoke @Regression @matakevin
    Scenario: Calculating the example file on LDassoc
        Given a LDlink user opens home page
        When the user clicks on the LDassoc module
        When the user calculates example GWAS data on the LDassoc page
        Then the "Association Results" text displays

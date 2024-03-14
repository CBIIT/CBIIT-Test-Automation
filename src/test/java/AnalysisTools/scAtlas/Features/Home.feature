Feature:These are features on the Home Page of scAtlas
    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Ensure Tumor Cell Community and T-Cell load correctly on NCI-Clarity
        Given the user is on the scAtlas home page
        When the user clicks NCI-CLARITY window
        Then the "Tumor Cell Community" and "T-Cell" tabs are displayed

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Ensure Tumor Cell Community and T-Cell load correctly on Multi-Regional
        Given the user is on the scAtlas home page
        When the user clicks Multi-Regional window
        Then the "Tumor Cell Community" tab is displayed but the "T-Cell" tab is not displayed

    @NCIATWP-6677 @matakevin @Smoke
    Scenario: Ensure Tumor Cell Community and T-Cell load correctly on Sequential NCI-Clarity
        Given the user is on the scAtlas home page
        When the user clicks Sequential NCI-Clarity window
        Then the "Tumor Cell Community" tab is displayed but the "T-Cell" tab is not displayed
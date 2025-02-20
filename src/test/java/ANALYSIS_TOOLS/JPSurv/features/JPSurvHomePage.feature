Feature: These are the scenarios for the Home page on the JPSurv Application

    @Smoke @Regression @matakevin @selenium
    Scenario: User Uploads example Dic and Txt File
        Given the user is on the JPSurv homepage
        When user selects Dic and Txt file
        And user clicks upload
        And user select year of diagnosis start "1976"
        And user select year of diagnosis end "2007"
        And user select maximum number of years from diagnosis "<= 9"
        And select Non-Hodgkin-Lymphoma
        And user click calculate button
        Then user verify survival vs year at diagnosis tab displayed

    @Smoke @Regression @matakevin @selenium
    Scenario: User Uploads example Dic and Txt File and selects Site recode NHL and CML
        Given the user is on the JPSurv homepage
        When user selects Dic and Txt file
        And user clicks upload
        And user select year of diagnosis drop down "Site recode NHL and CML"
        And user select year of diagnosis start "1976"
        And user select year of diagnosis end "2007"
        And user select maximum number of years from diagnosis "<= 9"
        And select Non-Hodgkin-Lymphoma
        And user click calculate button
        Then user verify survival vs year at diagnosis tab displayed

    @Smoke @Regression @matakevin @selenium
    Scenario: User Uploads example Dic and Txt File  for email
        Given the user is on the JPSurv homepage
        When user selects Dic and Txt file
        And user clicks upload
        And enter email address
        And click submit
        Then verify email send

    @Smoke @Regression @matakevin @selenium
    Scenario: User Upload example CSV file
        Given the user is on the JPSurv homepage
        When user selects CSV Files
        And user clicks upload
        And select "Cohort" for age rec drop down
        And select "Cohort" for stage drop down
        And select "Year" for year drop down
        And select "Interval" for interval drop down
        And select "Number.Alive" for alive at start drop down
        And select "Number.Dead" for  died drop down
        And select "Number.Lost" for  lost to follow up
        And select "Expected.Survival.Int" for exp int drop down
        And select "Relative Survival Int" for rel int drop down
        And select "Relative Survival Cum" for rel cum drop down
        And select "Relative Survival Int SE" for rel sur int se drop down
        And select "Relative Survival Cum SE" for  rel sur cum se drop down
        And clicks save
        And clicks upload
        And selects zero for age rec
        And selects zero for stage
        And user click calculate button
        Then user verify survival vs year at diagnosis tab displayed

    @Smoke @Regression @matakevin @selenium
    Scenario: User Upload workspace file
        Given the user is on the JPSurv homepage
        When user selects workspace
        And user clicks import
        Then workspace results display

    @Smoke @Regression @matakevin @selenium
    Scenario: User Click Reset Button
        Given the user is on the JPSurv homepage
        When user selects Dic and Txt file
        And user clicks upload
        And select Non-Hodgkin-Lymphoma
        And select Calculate
        And click Reset
        Then page is reset

    @Smoke @Regression @matakevin @selenium
    Scenario: User Click Download Full Dataset
        Given the user is on the JPSurv homepage
        When user selects Dic and Txt file
        And user clicks upload
        And select Non-Hodgkin-Lymphoma
        And select Calculate
        And click download full dataset button
        Then verify dataset download "JPSurv-Tutorial_JPSURV.xlsx"

    @Smoke @Regression @matakevin @selenium
    Scenario: User Uploads non-example Dic and Txt File
        Given the user is on the JPSurv homepage
        When user selects non-example Dic and Txt file
        And user clicks upload
        And select Calculate
        Then user verify survival vs year at diagnosis tab displayed

    @Smoke @Regression @matakevin @selenium
    Scenario: User Uploads non-example workspace
        Given the user is on the JPSurv homepage
        When user selects non-example workspace
        And user clicks import
        Then workspace results display

    @In-Progress @matakevin @selenium @manualLoadTest
    Scenario: User Uploads example Dic and Txt File
        Given the user is on the JPSurv homepage
        Then the user submits 30 jobs with diagnosis start "1976", diagnosis end "2007" and maximum number of years from diagnosis "<= 9"
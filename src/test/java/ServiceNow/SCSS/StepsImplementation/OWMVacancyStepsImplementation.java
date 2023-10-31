package ServiceNow.SCSS.StepsImplementation;

import ServiceNow.SCSS.Constants.NativeViewSCSSConstants;
import ServiceNow.SCSS.Constants.OWMVacanciesConstants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class OWMVacancyStepsImplementation extends PageInitializer {

    public void clickButton(String button) {
        if (button.equals("Create vacancy")) {
            CommonUtils.waitForVisibility(owmVacancyPage.createVacancyButton);
            CommonUtils.clickOnElement(owmVacancyPage.createVacancyButton);
        } else if (button.equals("Save")) {
            CommonUtils.waitForVisibility(owmVacancyPage.saveButton);
            CommonUtils.clickOnElement(owmVacancyPage.saveButton);
        } else {
            CommonUtils.waitForVisibility(owmVacancyPage.saveAndFinalizeButton);
            CommonUtils.clickOnElement(owmVacancyPage.saveAndFinalizeButton);
        }
    }

    public void userSubmitsTheBasicVacancyInformation(String basicVacancyInformation) {
        // ----- CHECKING THE DROPDOWN OPTIONS FOR POSITION CLASSIFICATION -----
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyTitleField);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.basicVacancyInformationText.getText(),basicVacancyInformation, "-- VERIFYING BASIC VACANCY INFORMATION TEXT --");
        JavascriptUtils.scrollIntoView(owmVacancyPage.saveButton);
        CommonUtils.waitForVisibility(owmVacancyPage.apptPackageInitiatorField);
        CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        boolean positionNumber= false;
        while (!positionNumber) {
            try {
                int n = 0;
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 9; j++) {
                        String actualPositionClassification = owmVacancyPage.positionClassificationDropdownOptions(j).getText();
                        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[(j+n)-1], actualPositionClassification, "-- VERIFYING FIRST 24 OPTIONS --");
                    }
                    n = n + 8;
                    JavascriptUtils.scrollIntoView(owmVacancyPage.positionClassificationDropdownOptions(9));
                }
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[24], owmVacancyPage.positionClassificationDropdownOptions(6).getText(), "-- VERIFYING OPTION 25 --");
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[25], owmVacancyPage.positionClassificationDropdownOptions(7).getText(), "-- VERIFYING OPTION 26 --");
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[26], owmVacancyPage.positionClassificationDropdownOptions(8).getText(), "-- VERIFYING OPTION 27 --");
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[27], owmVacancyPage.positionClassificationDropdownOptions(9).getText(), "-- VERIFYING OPTION 28 --");
                owmVacancyPage.positionClassificationDropdownOptions(11).getText();
            } catch (NoSuchElementException e) {
                positionNumber = true;
            }
        }
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(owmVacancyPage.vacancyDashboardTab);
        CommonUtils.clickOnElement(owmVacancyPage.vacancyDashboardTab);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(owmVacancyPage.createVacancyButton);
        CommonUtils.clickOnElement(owmVacancyPage.createVacancyButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyTitleField);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.basicVacancyInformationText.getText(),basicVacancyInformation, "-- VERIFYING BASIC VACANCY INFORMATION TEXT --");
        CommonUtils.sendKeys(owmVacancyPage.vacancyTitleField, OWMVacanciesConstants.VACANCY_TITLE);
        CommonUtils.clickOnElement(owmVacancyPage.allowHRSpecialistToTriageCheckbox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyDescriptionField, OWMVacanciesConstants.VACANCY_DESCRIPTION);
        JavascriptUtils.scrollIntoView(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.waitForVisibility(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.clickOnElement(owmVacancyPage.openCalendarTableInBasicVacancySection);
        String openDate = new String(OWMVacanciesConstants.TODAYS_DATE);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(Integer.parseInt(openDate.substring(6,8))-1));
        CommonUtils.clickOnElement(owmVacancyPage.vacancyCloseDateTextBox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyCloseDateTextBox, OWMVacanciesConstants.VACANCY_CLOSE_DATE);
        CommonUtils.sendKeys(owmVacancyPage.vacancyCloseDateTextBox, Keys.ENTER);
        CommonUtils.clickOnElement(owmVacancyPage.vacancyScoringDueDateTextBox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyScoringDueDateTextBox, OWMVacanciesConstants.VACANCY_SCORING_DUE_DATE);
        CommonUtils.sendKeys(owmVacancyPage.vacancyScoringDueDateTextBox, Keys.ENTER);
        CommonUtils.assertTrue(owmVacancyPage.coverLetterOptionalCheckmark.isSelected());
        CommonUtils.clickOnElement(owmVacancyPage.curriculumVitaeOptionalCheckmark);
        CommonUtils.clickOnElement(owmVacancyPage.qualificationStatementOptionalCheckmark);
        Actions move = new Actions(webDriver);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(owmVacancyPage.saveButton);
        move.dragAndDropBy(owmVacancyPage.recommendationsSlider, -180, 0).build().perform();
        move.dragAndDropBy(owmVacancyPage.recommendationsSlider, 60*OWMVacanciesConstants.VACANCY_RECOMMENDATIONS, 0).build().perform();
        CommonUtils.waitForVisibility(owmVacancyPage.apptPackageInitiatorField);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.apptPackageInitiatorField.getAttribute("title"), OWMVacanciesConstants.VACANCY_APPOINTMENT_PACKAGE_INITIATOR, "-- VERIFYING APPOINTMENT PACKAGE INITIATOR --");
        // ----- CLICKING ON THE POSITION CLASSIFICATION -----
        CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
        CommonUtils.waitForClickability(owmVacancyPage.positionClassificationDropdownOptions(1));
        MiscUtils.sleep(3000);
        boolean positionNumberClick= false;
        while (!positionNumberClick) {
            try {
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 9; j++) {
                        String actualPositionClassification = owmVacancyPage.positionClassificationDropdownOptions(j).getText();
                        if(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATION.equals(actualPositionClassification)) {
                            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdownOptions(j));
                            owmVacancyPage.positionClassificationDropdownOptions(11).getText();
                        }
                    }
                    JavascriptUtils.scrollIntoView(owmVacancyPage.positionClassificationDropdownOptions(9));
                }
                CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdownOption(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATION));
                owmVacancyPage.positionClassificationDropdownOptions(11).getText();
            } catch (NoSuchElementException e) {
                positionNumberClick = true;
            }
        }
        CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
        CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
        CommonUtils.sendKeysToElement(owmVacancyPage.orgFieldDropdown, OWMVacanciesConstants.VACANCY_ORGANIZATIONAL_CODE);
        CommonUtils.sendKeys(owmVacancyPage.orgFieldDropdown, Keys.ENTER);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }

    public void userIsSelectingTheMandatoryStatements(String statements) {
        CommonUtils.waitForVisibility(owmVacancyPage.mandatoryStatementsText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.mandatoryStatementsText.getText(),statements, "-- VERIFYING MANDATORY STATEMENTS TEXT --");
        CommonUtils.assertTrue(owmVacancyPage.mandatoryStatementEqualOpportunityEmployerButton.isDisplayed());
        CommonUtils.clickOnElement(owmVacancyPage.mandatoryStatementStandardsOfConductButton);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(owmVacancyPage.mandatoryStatementReasonableAccommodationButton);
        CommonUtils.clickOnElement(owmVacancyPage.mandatoryStatementForeignEducationButton);
        CommonUtils.clickOnElement(owmVacancyPage.mandatoryStatementReasonableAccommodationButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }

    public void userIsAddingMembers(String commetteeMembers) {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyCommitteeText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.vacancyCommitteeText.getText(),commetteeMembers, "-- VERIFYING VACANCY COMMITTEE TEXT --");
        CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
        CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
        CommonUtils.clickOnElement(owmVacancyPage.committeeMember(OWMVacanciesConstants.VACANCY_COMMITTEE_CHAIR));
        CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
        CommonUtils.waitForVisibility(owmVacancyPage.atLeastOneCommitteeMemberText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.atLeastOneCommitteeMemberText.getText(),OWMVacanciesConstants.AT_LEAST_ONE_COMMITTEE_TEXT, "-- VERIFYING AT LEAST ONE COMMITTEE TEXT --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
        CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
        CommonUtils.clickOnElement(owmVacancyPage.committeeMember(OWMVacanciesConstants.VACANCY_COMMITTEE_EXECUTIVE_SECRETARY));
        CommonUtils.clickOnElement(owmVacancyPage.roleDropdownMemberVoting);
        CommonUtils.clickOnElement(owmVacancyPage.exeSecretaryRole);
        CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }

    public void userChoosesEmailTemplate(String emailTemplates) {
        CommonUtils.waitForVisibility(owmVacancyPage.emailTemplatesText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.emailTemplatesText.getText(),emailTemplates, "-- VERIFYING EMAIL TEMPLATES TEXT --");
        CommonUtils.clickOnElement(owmVacancyPage.applicationSavedButton);
        CommonUtils.clickOnElement(owmVacancyPage.applicationSubmittedButton);
        CommonUtils.waitForVisibility(owmVacancyPage.atLeastOneEmailTemplateText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.atLeastOneEmailTemplateText.getText(),OWMVacanciesConstants.AT_LEAST_ONE_EMAIL_TEMPLATE_TEXT, "-- VERIFYING AT LEAST ONE EMAIL TEMPLATE TEXT --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.applicationSubmittedButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }

    public void userPublishesAVacancy() {
        CommonUtils.waitForVisibility(owmVacancyPage.reviewAndFinalizeText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.reviewAndFinalizeText.getText(),OWMVacanciesConstants.REVIEW_AND_FINALIZE_TEXT, "-- VERIFYING REVIEW AND FINALIZE TEXT --");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(owmVacancyPage.saveButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }

    public void userVerifyThatAVacancyIsFinalized() {
        CommonUtils.waitForVisibility(owmVacancyPage.readyToFinalizeVacancyText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.readyToFinalizeVacancyText.getText(),OWMVacanciesConstants.READY_T0_FINALIZE_VACANCY_TEXT, "-- VERIFYING READY TO FINALIZE VACANCY TEXT --");
        CommonUtils.waitForVisibility(owmVacancyPage.acceptConfirmationAlert);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.acceptConfirmationAlert);
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyFinalizedText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.vacancyFinalizedText.getText(),OWMVacanciesConstants.VACANCY_FINALIZED_TEXT, "-- VERIFYING VACANCY FINALIZED TEXT --");
        CommonUtils.waitForVisibility(owmVacancyPage.closeConfirmationAlert);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.closeConfirmationAlert);
    }
    public void logOutScss() {
        JavascriptUtils.scrollIntoView(owmVacancyPage.logOutUserButton);
        CommonUtils.clickOnElement(owmVacancyPage.logOutUserButton);
        CommonUtils.waitForVisibility(owmVacancyPage.logOutButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.logOutButton);
    }

    public void theApplicantShouldSeeThePublishedVacancy() {
        CommonUtils.waitForVisibility(owmVacancyPage.specializedScientificJobsText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.specializedScientificJobsText.getText(),OWMVacanciesConstants.SPECIALIZED_SCIENTIFIC_JOBS_TEXT, "-- VERIFYING SPECIALIZED SCIENTIFIC JOBS TEXT --");
        JavascriptUtils.scrollIntoView(owmVacancyPage.owmVacancyDynamicLocatorHomePage(OWMVacanciesConstants.VACANCY_TITLE));
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.owmVacancyDynamicLocatorHomePage(OWMVacanciesConstants.VACANCY_TITLE).getText(),OWMVacanciesConstants.VACANCY_INSTITUTE, "-- VERIFYING THE CREATED VACANCY INSTITUTE --");
    }

    public void theUserShouldSeeTheMenuOptions(String home, String vacancyDashboard, String yourVacancies, String reports, String profile) {
        CommonUtils.assertEqualsWithMessage(home, owmVacancyPage.tabOption(home).getText(), "-- VERIFYING HOME TAB --");
        CommonUtils.assertEqualsWithMessage(vacancyDashboard, owmVacancyPage.tabOption(vacancyDashboard).getText(), "-- VERIFYING VACANCY DASHBOARD TAB --");
        CommonUtils.assertEqualsWithMessage(yourVacancies, owmVacancyPage.tabOption(yourVacancies).getText(), "-- VERIFYING YOUR VACANCIES TAB --");
        CommonUtils.assertEqualsWithMessage(reports, owmVacancyPage.tabOption(reports).getText(), "-- VERIFYING REPORTS TAB --");
        CommonUtils.assertEqualsWithMessage(profile, owmVacancyPage.tabOption(profile).getText(), "-- VERIFYING PROFILE TAB --");
    }

    public void userIsAbleToSeeTheNihLinkAndTheOnTheHomePage(String openVacancies) {
        CommonUtils.assertEqualsWithMessage(openVacancies, owmVacancyPage.openVacancyText.getText(), "-- VERIFYING OPEN VACANCIES TEXT --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.NIH_LINK, owmVacancyPage.nihLink.getText(), "-- VERIFYING NIH LINK --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION, owmVacancyPage.columnFilterOption(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION).getText(), "-- VERIFYING VACANCY TITLE COLUMN --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_INSTITUTE_COLUMN_OPTION, owmVacancyPage.columnFilterOption(OWMVacanciesConstants.VACANCY_INSTITUTE_COLUMN_OPTION).getText(), "-- VERIFYING VACANCY INSTITUTE COLUMN --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICATION_PERIOD_COLUMN_OPTION, owmVacancyPage.columnFilterOption(OWMVacanciesConstants.VACANCY_APPLICATION_PERIOD_COLUMN_OPTION).getText(), "-- VERIFYING VACANCY APPLICATION PERIOD COLUMN COLUMN --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.nihLink);
        CommonUtils.waitForVisibility(owmVacancyPage.whoWeAreText);
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.WHO_WE_ARE_TEXT, owmVacancyPage.whoWeAreText.getText(), "-- VERIFYING WHO WE ARE TEXT --");
        CucumberLogUtils.logScreenshot();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SCSSPortalView"));
        CommonUtils.waitForVisibility(owmVacancyPage.scssLandingPageTitle);
        CucumberLogUtils.logScreenshot();
    }

    public void userCanSeeAllVacancies() {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyDashboardTabs(OWMVacanciesConstants.VACANCY_PRE_FLIGHT_MAIN));
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_PRE_FLIGHT_MAIN, owmVacancyPage.vacancyDashboardTabs(OWMVacanciesConstants.VACANCY_PRE_FLIGHT_MAIN).getText(), "-- VERIFYING PRE FLIGHT VACANCIES TAB --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_LIVE_MAIN, owmVacancyPage.vacancyDashboardTabs(OWMVacanciesConstants.VACANCY_LIVE_MAIN).getText(), "-- VERIFYING LIVE VACANCIES TAB --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSED_MAIN, owmVacancyPage.vacancyDashboardTabs(OWMVacanciesConstants.VACANCY_CLOSED_MAIN).getText(), "-- VERIFYING CLOSED VACANCIES TAB --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_PRE_FLIGHT_ALL, owmVacancyPage.columnFilterOptionVacancies(1).getText(), "-- VERIFYING PRE FLIGHT VACANCIES ALL TAB --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES ALL VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES ALL OPEN DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES ALL CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES ALL ACTIONS COLUMN NAME --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_PRE_FLIGHT_DRAFT, owmVacancyPage.columnFilterOptionVacancies(2).getText(), "-- VERIFYING PRE FLIGHT VACANCIES DRAFT TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(2));
        CommonUtils.waitForVisibility(owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION));
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES DRAFT VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES DRAFT OPEN DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES DRAFT CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES DRAFT ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_PRE_FLIGHT_FINALIZED, owmVacancyPage.columnFilterOptionVacancies(3).getText(), "-- VERIFYING PRE FLIGHT VACANCIES FINALIZED TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(3));
        CommonUtils.waitForVisibility(owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION));
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES FINALIZED VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES FINALIZED OPEN DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES FINALIZED CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION).getText(), "-- VERIFYING PRE FLIGHT VACANCIES FINALIZED ACTIONS COLUMN NAME --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.vacancyDashboardTabs(OWMVacanciesConstants.VACANCY_LIVE_MAIN));
        CommonUtils.waitForVisibility(owmVacancyPage.columnFilterOptionVacancies(1));
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_LIVE_ALL, owmVacancyPage.columnFilterOptionVacancies(1).getText(), "-- VERIFYING LIVE VACANCIES ALL TAB  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION, owmVacancyPage.liveVacanciesVacancyTitleText.getText(), "-- VERIFYING LIVE VACANCIES ALL VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION, owmVacancyPage.liveVacanciesOpenDateText.getText(), "-- VERIFYING LIVE VACANCIES ALL OPEN DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.liveVacanciesCloseDateText.getText(), "-- VERIFYING LIVE VACANCIES ALL CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.liveVacanciesActionsText.getText(), "-- VERIFYING LIVE VACANCIES ALL ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.liveVacanciesApplicantsText.getText(), "-- VERIFYING LIVE VACANCIES ALL APPLICANTS COLUMN NAME --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_LIVE_LIVE, owmVacancyPage.columnFilterOptionVacancies(2).getText(), "-- VERIFYING LIVE VACANCIES LIVE TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(2));
        CommonUtils.waitForVisibility(owmVacancyPage.liveVacanciesVacancyTitleText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.liveVacanciesVacancyTitleText.getText(), "-- VERIFYING LIVE VACANCIES LIVE VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION, owmVacancyPage.liveVacanciesOpenDateText.getText(), "-- VERIFYING LIVE VACANCIES LIVE OPEN DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.liveVacanciesCloseDateText.getText(), "-- VERIFYING LIVE VACANCIES LIVE CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.liveVacanciesActionsText.getText(), "-- VERIFYING LIVE VACANCIES LIVE ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.liveVacanciesApplicantsText.getText(), "-- VERIFYING LIVE VACANCIES LIVE APPLICANTS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_LIVE_EXTENDED, owmVacancyPage.columnFilterOptionVacancies(3).getText(), "-- VERIFYING LIVE VACANCIES EXTENDED TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(3));
        CommonUtils.waitForVisibility(owmVacancyPage.liveVacanciesVacancyTitleText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.liveVacanciesVacancyTitleText.getText(), "-- VERIFYING LIVE VACANCIES EXTENDED VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_OPEN_DATE_COLUMN_OPTION, owmVacancyPage.liveVacanciesOpenDateText.getText(), "-- VERIFYING LIVE VACANCIES EXTENDED OPEN DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.liveVacanciesCloseDateText.getText(), "-- VERIFYING LIVE VACANCIES EXTENDED CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.liveVacanciesActionsText.getText(), "-- VERIFYING LIVE VACANCIES EXTENDED ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.liveVacanciesApplicantsText.getText(), "-- VERIFYING LIVE VACANCIES EXTENDED APPLICANTS COLUMN NAME --");
        CommonUtils.clickOnElement(owmVacancyPage.vacancyDashboardTabs(OWMVacanciesConstants.VACANCY_CLOSED_MAIN));
        CommonUtils.waitForVisibility(owmVacancyPage.columnFilterOptionVacancies(1));
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSED_ALL, owmVacancyPage.columnFilterOptionVacancies(1).getText(), "-- VERIFYING CLOSED VACANCIES ALL TAB  --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.closedVacanciesVacancyTitleText.getText(), "-- VERIFYING CLOSED VACANCIES ALL VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.closedVacanciesCloseDateText.getText(), "-- VERIFYING CLOSED VACANCIES ALL CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.closedVacanciesActionsText.getText(), "-- VERIFYING CLOSED VACANCIES ALL ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.closedVacanciesApplicantsText.getText(), "-- VERIFYING CLOSED VACANCIES ALL APPLICANTS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSED_TRIAGE, owmVacancyPage.columnFilterOptionVacancies(2).getText(), "-- VERIFYING CLOSED VACANCIES TRIAGE TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(2));
        CommonUtils.waitForVisibility(owmVacancyPage.closedVacanciesVacancyTitleText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.closedVacanciesVacancyTitleText.getText(), "-- VERIFYING CLOSED VACANCIES TRIAGE VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.closedVacanciesCloseDateText.getText(), "-- VERIFYING CLOSED VACANCIES TRIAGE CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.closedVacanciesActionsText.getText(), "-- VERIFYING CLOSED VACANCIES TRIAGE ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.closedVacanciesApplicantsText.getText(), "-- VERIFYING CLOSED VACANCIES TRIAGE APPLICANTS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSED_INDIVIDUAL_SCORING, owmVacancyPage.columnFilterOptionVacancies(3).getText(), "-- VERIFYING CLOSED VACANCIES INDIVIDUAL SCORING TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(3));
        CommonUtils.waitForVisibility(owmVacancyPage.closedVacanciesVacancyTitleText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.closedVacanciesVacancyTitleText.getText(), "-- VERIFYING CLOSED VACANCIES INDIVIDUAL SCORING VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.closedVacanciesCloseDateText.getText(), "-- VERIFYING CLOSED VACANCIES INDIVIDUAL SCORING CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.closedVacanciesActionsText.getText(), "-- VERIFYING CLOSED VACANCIES INDIVIDUAL SCORING ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.closedVacanciesApplicantsText.getText(), "-- VERIFYING CLOSED VACANCIES INDIVIDUAL SCORING APPLICANTS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSED_COMMITTEE_REVIEW, owmVacancyPage.columnFilterOptionVacancies(4).getText(), "-- VERIFYING CLOSED VACANCIES COMMITTEE REVIEW TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(4));
        CommonUtils.waitForVisibility(owmVacancyPage.closedVacanciesVacancyTitleText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.closedVacanciesVacancyTitleText.getText(), "-- VERIFYING CLOSED VACANCIES COMMITTEE REVIEW VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.closedVacanciesCloseDateText.getText(), "-- VERIFYING CLOSED VACANCIES COMMITTEE REVIEW CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.closedVacanciesActionsText.getText(), "-- VERIFYING CLOSED VACANCIES COMMITTEE REVIEW ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.closedVacanciesApplicantsText.getText(), "-- VERIFYING CLOSED VACANCIES COMMITTEE REVIEW APPLICANTS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSED_VOTING_COMPLETE, owmVacancyPage.columnFilterOptionVacancies(5).getText(), "-- VERIFYING CLOSED VACANCIES VOTING COMPLETE TAB  --");
        CommonUtils.clickOnElement(owmVacancyPage.columnFilterOptionVacancies(5));
        CommonUtils.waitForVisibility(owmVacancyPage.closedVacanciesVacancyTitleText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.closedVacanciesVacancyTitleText.getText(), "-- VERIFYING CLOSED VACANCIES VOTING COMPLETE VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_CLOSE_DATE_COLUMN_OPTION, owmVacancyPage.closedVacanciesCloseDateText.getText(), "-- VERIFYING CLOSED VACANCIES VOTING COMPLETE CLOSE DATE COLUMN NAME  --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ACTIONS_COLUMN_OPTION, owmVacancyPage.closedVacanciesActionsText.getText(), "-- VERIFYING CLOSED VACANCIES VOTING COMPLETE ACTIONS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.closedVacanciesApplicantsText.getText(), "-- VERIFYING CLOSED VACANCIES VOTING COMPLETE APPLICANTS COLUMN NAME --");
    }

    @Then("User navigates and can see all vacancies under {string} tab")
    public void userNavigatesAndCanSeeAllVacanciesUnderTab(String yourVacancies) {
        CommonUtils.clickOnElement( owmVacancyPage.tabOption(yourVacancies));
        CommonUtils.waitForVisibility(owmVacancyPage.yourVacanciesAssignedToYouText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_ASSIGNED_TO_YOU_TEXT , owmVacancyPage.yourVacanciesAssignedToYouText.getText(), "-- VERIFYING YOUR VACANCIES ASSIGNED TO YOU TEXT --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION , owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_TITLE_COLUMN_OPTION).getText(), "-- VERIFYING YOUR VACANCIES VACANCY TITLE COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_APPLICANT_COLUMN_OPTION).getText(), "-- VERIFYING YOUR VACANCIES APPLICANTS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_STATUS_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_STATUS_COLUMN_OPTION).getText(), "-- VERIFYING YOUR VACANCIES STATUS COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_SCORING_DUE_BY_COLUMN_OPTION, owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_SCORING_DUE_BY_COLUMN_OPTION).getText(), "-- VERIFYING YOUR VACANCIES SORTING DUE BY COLUMN NAME --");
        CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_YOUR_SCORING_COLUMN_OPTION , owmVacancyPage.columnFilterOptionVacancyDashboard(OWMVacanciesConstants.VACANCY_YOUR_SCORING_COLUMN_OPTION ).getText(), "-- VERIFYING YOUR VACANCIES YOUR SCORING COLUMN NAME --");
    }
    @Then("used navigates to see {string}")
    public void usedNavigatesToSeeReports(String reports) {
        CommonUtils.clickOnElement( owmVacancyPage.tabOption(reports));
        CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        CommonUtils.waitForVisibility(nativeViewSCSSReportsPage.focusAreaReportingText);
        CommonUtils.assertEqualsWithMessage(NativeViewSCSSConstants.FOCUS_AREA_REPORTING_TEXT , nativeViewSCSSReportsPage.focusAreaReportingText.getText(), "-- VERIFYING FOCUS AREA REPORTING TEXT --");
        JavascriptUtils.scrollIntoView(nativeViewSCSSReportsPage.nativeViewReportsText(NativeViewSCSSConstants.VACANCY_DATES_OPEN_CLOSE_TEXT));
        CommonUtils.assertEqualsWithMessage(NativeViewSCSSConstants.VACANCY_DATES_OPEN_CLOSE_TEXT, nativeViewSCSSReportsPage.nativeViewReportsText(NativeViewSCSSConstants.VACANCY_DATES_OPEN_CLOSE_TEXT).getText(), "-- SCSS VACANCY DATES - OPEN AND CLOSE TEXT --");
        JavascriptUtils.scrollIntoView(nativeViewSCSSReportsPage.nativeViewReportsText(NativeViewSCSSConstants.VACANCY_DATES_INDIVIDUAL_SCORING_TEXT));
        CommonUtils.assertEqualsWithMessage(NativeViewSCSSConstants.VACANCY_DATES_INDIVIDUAL_SCORING_TEXT, nativeViewSCSSReportsPage.nativeViewReportsText(NativeViewSCSSConstants.VACANCY_DATES_INDIVIDUAL_SCORING_TEXT).getText(), "-- SCSS VACANCY DATES - INDIVIDUAL SCORING TEXT --");
        JavascriptUtils.scrollIntoView(nativeViewSCSSReportsPage.nativeViewReportsText(NativeViewSCSSConstants.APPLICANT_DECISION_DATE_TEXT));
        CommonUtils.assertEqualsWithMessage(NativeViewSCSSConstants.APPLICANT_DECISION_DATE_TEXT, nativeViewSCSSReportsPage.nativeViewReportsText(NativeViewSCSSConstants.APPLICANT_DECISION_DATE_TEXT).getText(), "-- SCSS APPLICANT DECISION DATE TEXT --");
    }
}
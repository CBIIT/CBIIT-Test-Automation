package ServiceNow.SCSS.StepsImplementation;

import ServiceNow.SCSS.Constants.OWMVacanciesConstants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
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
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[24], owmVacancyPage.positionClassificationDropdownOptions(6).getText(), "-- VERIFYING OPTIONS 25 --");
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[25], owmVacancyPage.positionClassificationDropdownOptions(7).getText(), "-- VERIFYING OPTIONS 26 --");
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[26], owmVacancyPage.positionClassificationDropdownOptions(8).getText(), "-- VERIFYING OPTIONS 27 --");
                CommonUtils.assertEqualsWithMessage(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATIONS[27], owmVacancyPage.positionClassificationDropdownOptions(9).getText(), "-- VERIFYING OPTIONS 28 --");
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
                MiscUtils.sleep(5000);
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

}
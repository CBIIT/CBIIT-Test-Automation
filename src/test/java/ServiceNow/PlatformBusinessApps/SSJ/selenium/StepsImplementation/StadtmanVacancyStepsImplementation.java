package ServiceNow.PlatformBusinessApps.SSJ.selenium.StepsImplementation;

import ServiceNow.PlatformBusinessApps.SSJ.selenium.Constants.OWMVacanciesConstants;
import ServiceNow.PlatformBusinessApps.SSJ.selenium.Constants.StadtmanVacanciesConstants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class StadtmanVacancyStepsImplementation extends PageInitializer {
    public void theUserSubmitsTheBasicVacancyInformation(String basicVacancyInformation) {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyTitleField);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.basicVacancyInformationText.getText(),basicVacancyInformation, "-- VERIFYING BASIC VACANCY INFORMATION TEXT --");
        CommonUtils.sendKeys(owmVacancyPage.vacancyTitleField, StadtmanVacanciesConstants.VACANCY_TITLE);
        CommonUtils.clickOnElement(owmVacancyPage.allowHRSpecialistToTriageCheckbox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyDescriptionField, StadtmanVacanciesConstants.VACANCY_DESCRIPTION);
        CommonUtils.clickOnElement(owmVacancyPage.enableFocusAreaCheckbox);
        JavascriptUtils.scrollIntoView(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.waitForVisibility(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.clickOnElement(owmVacancyPage.openCalendarTableInBasicVacancySection);
        String openDate = new String(StadtmanVacanciesConstants.TODAYS_DATE);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(Integer.parseInt(openDate.substring(6,8))-1));
        CommonUtils.clickOnElement(owmVacancyPage.vacancyCloseDateTextBox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyCloseDateTextBox, StadtmanVacanciesConstants.VACANCY_CLOSE_DATE);
        CommonUtils.sendKeys(owmVacancyPage.vacancyCloseDateTextBox, Keys.ENTER);
        CommonUtils.clickOnElement(owmVacancyPage.vacancyScoringDueDateTextBox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyScoringDueDateTextBox,StadtmanVacanciesConstants.VACANCY_SCORING_DUE_DATE);
        CommonUtils.sendKeys(owmVacancyPage.vacancyScoringDueDateTextBox, Keys.ENTER);
        CommonUtils.assertTrue(owmVacancyPage.coverLetterOptionalCheckmark.isSelected());
        CommonUtils.clickOnElement(owmVacancyPage.curriculumVitaeOptionalCheckmark);
        CommonUtils.clickOnElement(owmVacancyPage.qualificationStatementOptionalCheckmark);
        Actions move = new Actions(webDriver);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(owmVacancyPage.saveButton);
        move.dragAndDropBy(owmVacancyPage.recommendationsSlider, -180, 0).build().perform();
        move.dragAndDropBy(owmVacancyPage.recommendationsSlider, 60*StadtmanVacanciesConstants.VACANCY_RECOMMENDATIONS, 0).build().perform();
        CommonUtils.waitForVisibility(owmVacancyPage.apptPackageInitiatorField);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.apptPackageInitiatorField.getAttribute("title"), StadtmanVacanciesConstants.VACANCY_APPOINTMENT_PACKAGE_INITIATOR, "-- VERIFYING APPOINTMENT PACKAGE INITIATOR --");
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
                        if(StadtmanVacanciesConstants.VACANCY_POSITION_CLASSIFICATION.equals(actualPositionClassification)) {
                            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdownOptions(j));
                            owmVacancyPage.positionClassificationDropdownOptions(11).getText();
                        }
                    }
                    JavascriptUtils.scrollIntoView(owmVacancyPage.positionClassificationDropdownOptions(9));
                }
                CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdownOption(StadtmanVacanciesConstants.VACANCY_POSITION_CLASSIFICATION));
                owmVacancyPage.positionClassificationDropdownOptions(11).getText();
            } catch (NoSuchElementException e) {
                positionNumberClick = true;
            }
        }
        CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
        CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
        CommonUtils.sendKeysToElement(owmVacancyPage.orgFieldDropdown, StadtmanVacanciesConstants.VACANCY_ORGANIZATIONAL_CODE);
        CommonUtils.sendKeys(owmVacancyPage.orgFieldDropdown, Keys.ENTER);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }

    public void theUserIsSelectingTheMandatoryStatements(String statements) {
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

    public void theUserIsAddingMembers(String commetteeMembers) {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyCommitteeText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.vacancyCommitteeText.getText(),commetteeMembers, "-- VERIFYING VACANCY COMMITTEE TEXT --");
        CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
        CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
        CommonUtils.clickOnElement(owmVacancyPage.committeeMember(StadtmanVacanciesConstants.VACANCY_COMMITTEE_CHAIR));
        CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
        CommonUtils.waitForVisibility(owmVacancyPage.atLeastOneCommitteeMemberText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.atLeastOneCommitteeMemberText.getText(),StadtmanVacanciesConstants.AT_LEAST_ONE_COMMITTEE_TEXT, "-- VERIFYING AT LEAST ONE COMMITTEE TEXT --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
        CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
        CommonUtils.clickOnElement(owmVacancyPage.committeeMember(StadtmanVacanciesConstants.VACANCY_COMMITTEE_EXECUTIVE_SECRETARY));
        CommonUtils.clickOnElement(owmVacancyPage.roleDropdownMemberVoting);
        CommonUtils.clickOnElement(owmVacancyPage.exeSecretaryRole);
        CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }
    public void theUserChoosesEmailTemplate(String emailTemplates) {
        CommonUtils.waitForVisibility(owmVacancyPage.emailTemplatesText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.emailTemplatesText.getText(),emailTemplates, "-- VERIFYING EMAIL TEMPLATES TEXT --");
        CommonUtils.clickOnElement(owmVacancyPage.applicationSavedButton);
        CommonUtils.clickOnElement(owmVacancyPage.applicationSubmittedButton);
        CommonUtils.waitForVisibility(owmVacancyPage.atLeastOneEmailTemplateText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.atLeastOneEmailTemplateText.getText(),StadtmanVacanciesConstants.AT_LEAST_ONE_EMAIL_TEMPLATE_TEXT, "-- VERIFYING AT LEAST ONE EMAIL TEMPLATE TEXT --");
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.applicationSubmittedButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(owmVacancyPage.saveButton);
    }

    public void applicantShouldSeeThePublishedVacancy() {
        CommonUtils.waitForVisibility(owmVacancyPage.specializedScientificJobsText);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.specializedScientificJobsText.getText(), OWMVacanciesConstants.SPECIALIZED_SCIENTIFIC_JOBS_TEXT, "-- VERIFYING SPECIALIZED SCIENTIFIC JOBS TEXT --");
        JavascriptUtils.scrollIntoView(owmVacancyPage.owmVacancyDynamicLocatorHomePage(StadtmanVacanciesConstants.VACANCY_TITLE));
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.owmVacancyDynamicLocatorHomePage(StadtmanVacanciesConstants.VACANCY_TITLE).getText(),StadtmanVacanciesConstants.VACANCY_INSTITUTE, "-- VERIFYING THE CREATED VACANCY INSTITUTE --");
    }
}

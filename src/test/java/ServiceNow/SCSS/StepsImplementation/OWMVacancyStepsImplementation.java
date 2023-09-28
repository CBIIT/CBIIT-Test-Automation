package ServiceNow.SCSS.StepsImplementation;

import ServiceNow.SCSS.Constants.OWMVacanciesConstants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class OWMVacancyStepsImplementation extends PageInitializer {
    public void selectOpenCloseDate(String openDate, String closeDate) {
        JavascriptUtils.scrollIntoView(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.waitForVisibility(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.clickOnElement(owmVacancyPage.openCalendarTableInBasicVacancySection);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(Integer.parseInt(openDate)));
        JavascriptUtils.scrollIntoView(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        CommonUtils.waitForVisibility(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        CommonUtils.clickOnElement(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(Integer.parseInt(closeDate)));
    }

    public void selectPositionClassification(String position) {
        if (position.equals("Scientific Executive")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionScientificExecutive);
        } else if (position.equals("Senior Scientific Officer")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionSeniorScientificOfficer);
        } else if (position.equals("Senior Investigator")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(stadtmanVacancyPage.positionSeniorInvestigator);
        } else {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionScientificDirector);
        }
    }

    public void selectOrganizationalCode(String code) {
        if (code.equals("HNC")) {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC);
        } else if (code.equals("HNC1")) {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC1);
        } else if (code.equals("HNA")) {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(stadtmanVacancyPage.orgHNA);
        } else {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC14);
        }
    }

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

    public void addChair(String person) {
                CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
                CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
                CommonUtils.clickOnElement(owmVacancyPage.committeeMember(person));
                CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
    }

    public void addExecutiveSecretary(String member) {
                CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
                CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
                CommonUtils.clickOnElement(owmVacancyPage.committeeMember(member));
                CommonUtils.clickOnElement(owmVacancyPage.roleDropdownMemberVoting);
                CommonUtils.clickOnElement(owmVacancyPage.exeSecretaryRole);
                CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
    }
    public void userSubmitsTheBasicVacancyInformation(String basicVacancyInformation) {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyTitleField);
        CommonUtils.assertEqualsWithMessage(owmVacancyPage.basicVacancyInformationText.getText(),basicVacancyInformation, "-- VERIFYING BASIC VACANCY INFORMATION TEXT --");
        CommonUtils.sendKeys(owmVacancyPage.vacancyTitleField, OWMVacanciesConstants.VACANCY_TITLE);
        CommonUtils.clickOnElement(owmVacancyPage.allowHRSpecialistToTriageCheckbox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyDescriptionField, OWMVacanciesConstants.VACANCY_DESCRIPTION);
        CommonUtils.clickOnElement(owmVacancyPage.vacancyOpenDateTextBox);
        CommonUtils.sendKeys(owmVacancyPage.vacancyOpenDateTextBox, OWMVacanciesConstants.VACANCY_OPEN_DATE);
        CommonUtils.sendKeys(owmVacancyPage.vacancyOpenDateTextBox, Keys.ENTER);
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
        Assert.assertEquals(owmVacancyPage.apptPackageInitiatorField.getAttribute("title"), OWMVacanciesConstants.VACANCY_APPOINTMENT_PACKAGE_INITIATOR);
        CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
        CommonUtils.waitForClickability(owmVacancyPage.positionClassificationDropdownOption(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATION));
        CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdownOption(OWMVacanciesConstants.VACANCY_POSITION_CLASSIFICATION));
        CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
        CommonUtils.waitForClickability(owmVacancyPage.positionClassificationDropdownOption(OWMVacanciesConstants.VACANCY_ORGANIZATIONAL_CODE));
        CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdownOption(OWMVacanciesConstants.VACANCY_ORGANIZATIONAL_CODE));
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
}